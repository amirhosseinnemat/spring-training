package ir.shaparak.amulator.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.shaparak.amulator.dto.PersonalReqParam;
import ir.shaparak.amulator.dto.PersonalResponse;
import ir.shaparak.amulator.model.PersonalModel;
import ir.shaparak.amulator.services.validator.PersonalValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PersonalServices {

    @Autowired
    private PersonalValidator personalValidator;

    @Value("${personal.info.path}")
    private String personalPath;
    private final List<PersonalModel> personalList = new ArrayList<>();
    private final Map<Integer, PersonalModel> personalHash = new HashMap<>();

    @PostConstruct
    private void init() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            personalList.addAll(Arrays.asList(mapper.readValue(Paths.get(personalPath).toFile(), PersonalModel[].class)));
            personalHash.putAll(personalList.stream().collect(Collectors.toMap(PersonalModel::getNationalCode, Function.identity())));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public PersonalResponse getPersonals(PersonalReqParam reqParam) {
        PersonalResponse personalResponse = new PersonalResponse();
        if (personalValidator.validate(reqParam.getNatCode()))
        {
            List<PersonalModel> personalModels = Collections.singletonList(personalHash.get(Integer.parseInt(reqParam.getNatCode())));
            personalResponse.setPersonalModels(personalModels);
            personalResponse.setStatus(HttpStatus.OK.value());

            return personalResponse;

        } else {
            personalResponse.setStatus(HttpStatus.NOT_FOUND.value());
            personalResponse.setError("invalid parameter");
            return personalResponse;
        }
    }
}

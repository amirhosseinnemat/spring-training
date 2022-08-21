package ir.shaparak.amulator.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.shaparak.amulator.dto.PostalReqParam;
import ir.shaparak.amulator.dto.PostalResponse;
import ir.shaparak.amulator.model.PostalModel;
import ir.shaparak.amulator.services.validator.PostalValidator;
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
public class PostalServices {

    @Autowired
    PostalValidator postalValidator;

    @Value("${postalcode.info.path}")
    private String postalPath;

    private final List<PostalModel> postalModelList = new ArrayList<>();

    private final Map<Long, PostalModel> postalHash = new HashMap<>();

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            postalModelList.addAll(Arrays.asList(mapper.readValue(Paths.get(postalPath).toFile(), PostalModel[].class)));
            postalHash.putAll(postalModelList.stream().collect(Collectors.toMap(PostalModel::getPostalCode, Function.identity())));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PostalResponse getPostal(PostalReqParam reqParam) {
        PostalResponse postalResponse = new PostalResponse();

        if (postalValidator.validate(reqParam.getPostalCode())) {
            List<PostalModel> postalModels = Collections.singletonList(postalHash.get(Long.parseLong(reqParam.getPostalCode())));
            postalResponse.setPostalModels(postalModels);
            postalResponse.setStatus(HttpStatus.OK.value());

            return postalResponse;

        } else {
            postalResponse.setStatus(HttpStatus.NOT_FOUND.value());
            postalResponse.setError("invalid parameter");
            return postalResponse;
        }
    }


}

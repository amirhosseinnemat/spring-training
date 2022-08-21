package ir.shaparak.amulator.controller;

import ir.shaparak.amulator.dto.PersonalReqParam;
import ir.shaparak.amulator.dto.PersonalResponse;
import ir.shaparak.amulator.services.PersonalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalServices personalServices;

    @RequestMapping("/find-personals")
    public PersonalResponse getPersonals(@RequestBody PersonalReqParam reqParam)
    {
        return personalServices.getPersonals(reqParam);
    }
}

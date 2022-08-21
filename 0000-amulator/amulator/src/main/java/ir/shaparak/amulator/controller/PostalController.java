package ir.shaparak.amulator.controller;


import ir.shaparak.amulator.dto.PostalReqParam;
import ir.shaparak.amulator.dto.PostalResponse;
import ir.shaparak.amulator.services.PostalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postal")
public class PostalController {


    @Autowired
    private PostalServices postalServices;

    @RequestMapping("/find-postal")
    public PostalResponse getPostal(@RequestBody PostalReqParam reqParam) {
        return postalServices.getPostal(reqParam);
    }
}

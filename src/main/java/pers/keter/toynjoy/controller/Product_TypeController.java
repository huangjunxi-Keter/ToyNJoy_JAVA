package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.Product_TypeService;

import javax.annotation.Resource;

@Controller
public class Product_TypeController {

    @Resource
    private Product_TypeService service;

    @CrossOrigin
    @PostMapping(value = "/getAllProductType", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getInfoByUsername() {
        return service.getAll();
    }

}

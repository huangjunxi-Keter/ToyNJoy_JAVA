package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.User_InfoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class User_InfoController {

    @Resource
    private User_InfoService service;

    @CrossOrigin
    @PostMapping(value = "/getInfoByUsername", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getInfoByUsername(HttpServletRequest request) {
        String username = request.getParameter("username");

        return service.getInfoByUsername(username);
    }

}

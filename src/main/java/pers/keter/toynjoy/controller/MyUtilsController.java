package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.MyUtilsService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyUtilsController {

    @Resource
    MyUtilsService service;

    @CrossOrigin
    @PostMapping(value = "/sendEmail", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult sendEmail(HttpServletRequest request) {
        String email = request.getParameter("email");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        return service.sendEmail(email, title, content);
    }
}

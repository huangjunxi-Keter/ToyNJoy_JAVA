package pers.keter.toynjoy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.service.UsersService;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UsersController {

    @Resource
    private UsersService service;

    @CrossOrigin
    @PostMapping(value = "/login", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult Login (HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        return service.Login(username, password);

    }

    @CrossOrigin
    @PostMapping(value = "/getUserByUserName", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getUserByUserName (HttpServletRequest request) {

        String username = request.getParameter("username");

        return service.getUserByUserName(username);

    }

    @CrossOrigin
    @PostMapping(value = "/CreateUser", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult CreateUser (HttpServletRequest request) {

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        return service.CreateUser(name, password, email);

    }

}

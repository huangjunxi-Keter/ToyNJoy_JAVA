package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.FriendService;
import pers.keter.toynjoy.service.Product_Photo_GalleryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class FriendController {

    @Resource
    private FriendService service;

    @CrossOrigin
    @PostMapping(value = "/getFriendByUserName", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getInfoByUsername(HttpServletRequest request) {
        String username = request.getParameter("username");
        return service.getFriendByUserName(username);
    }

}

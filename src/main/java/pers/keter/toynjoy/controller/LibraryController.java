package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.FriendService;
import pers.keter.toynjoy.service.LibraryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LibraryController {

    @Resource
    private LibraryService service;

    @CrossOrigin
    @PostMapping(value = "/getLibraryDataByProductId", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getLibraryDataByProductId(HttpServletRequest request) {
        String username = request.getParameter("username");
        String productId = request.getParameter("productId");
        return service.getByProductIdAndUsername(username, productId);
    }

    @CrossOrigin
    @PostMapping(value = "/CreateLibraryByUsernmae", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult CreateLibraryByUsernmae(HttpServletRequest request) {
        String username = request.getParameter("username");
        String productId = request.getParameter("productId");
        return service.CreateLibraryByUsernmae(username, productId);
    }
}

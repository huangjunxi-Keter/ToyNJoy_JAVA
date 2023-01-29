package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.WishListService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class WishListController {

    @Resource
    private WishListService service;

    @CrossOrigin
    @PostMapping(value = "/getWishListDataByProductId", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getDataByProductId(HttpServletRequest request) {
        String username = request.getParameter("username");
        String productId = request.getParameter("productId");
        return service.getByProductIdAndUsername(username, productId);
    }

}

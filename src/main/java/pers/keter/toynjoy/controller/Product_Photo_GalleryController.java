package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.Product_Photo_GalleryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Product_Photo_GalleryController {

    @Resource
    private Product_Photo_GalleryService service;

    @CrossOrigin
    @PostMapping(value = "/getListByProductID", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getInfoByUsername(HttpServletRequest request) {
        String product_id = request.getParameter("product_id");
        return service.getListByProductID(product_id);
    }

}

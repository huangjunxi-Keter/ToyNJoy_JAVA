package pers.keter.toynjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.service.ProductService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

    @Resource
    private ProductService service;

    @CrossOrigin
    @PostMapping(value = "/getProductListPaging", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getInfoByUsername(HttpServletRequest request) {
        int top = Integer.parseInt(request.getParameter("top"));
        int num = Integer.parseInt(request.getParameter("num"));
        String orderColumn = request.getParameter("orderColumn");
        String type_id = request.getParameter("type_id");
        String name = request.getParameter("name");
        return service.getProductListPaging(top, num, orderColumn, name, type_id);
    }

    @CrossOrigin
    @PostMapping(value = "/getCount", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getCount(HttpServletRequest request) {
        String name = request.getParameter("name");
        String type_id = request.getParameter("type_id");
        return service.getCount(name, type_id);
    }

    @CrossOrigin
    @PostMapping(value = "/getNewProduct", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getNewProduct() {
        return service.getNewProduct();
    }

    @CrossOrigin
    @PostMapping(value = "/getBrowseProduct", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getBrowseProduct() {
        return service.getBrowseProduct();
    }

    @CrossOrigin
    @PostMapping(value = "/getPurchasesProduct", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getPurchasesProduct() {
        return service.getPurchasesProduct();
    }

    @CrossOrigin
    @PostMapping(value = "/getProductInWishListByUsername", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getProductInWishListByUsername(HttpServletRequest request) {
        String username = request.getParameter("username");
        String productname = request.getParameter("productname");
        return service.getProductInWishListByUsername(username, productname);
    }

    @CrossOrigin
    @PostMapping(value = "/getProductInLibraryByUsername", produces = "application/json;charset=utf-8")
    @ResponseBody
    public ServiceResult getProductInLibraryByUsername(HttpServletRequest request) {
        String username = request.getParameter("username");
        String productname = request.getParameter("productname");
        return service.getProductInLibraryByUsername(username, productname);
    }
}

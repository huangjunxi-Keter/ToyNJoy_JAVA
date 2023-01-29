package pers.keter.toynjoy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.utils.MyUtils;

@Service
public class MyUtilsService {

    @Autowired
    private MyUtils utils;

    public ServiceResult sendEmail(String email, String title, String content){
        ServiceResult result = new ServiceResult(false);
        try{
            utils.sendSimpleMail(email, title, content);
            result.setState(true);
            result.setMessage("发送成功！");
        }catch (Exception e){
            result.setMessage(e.getMessage());
        }

        return result;
    }

}

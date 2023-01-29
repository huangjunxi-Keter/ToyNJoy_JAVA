package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.IUser_InfoDao;
import pers.keter.toynjoy.entity.ServiceResult;
import pers.keter.toynjoy.entity.User_Info;

import javax.annotation.Resource;
import java.util.Random;

@Service
public class User_InfoService {

    @Resource
    private IUser_InfoDao User_InfoDao;

    private Random random = new Random();

    public ServiceResult getInfoByUsername(String username) {
        ServiceResult result = new ServiceResult(false);

        User_Info user_info = User_InfoDao.getInfoByUsername(username);
        if (user_info != null) {
            result.setState(true);
            result.setData(user_info, true, false);
        } else {
            result.setMessage("未检索到用户详情！");
        }

        return result;
    }

    public int CreateUser(String name){
        String imageStr = "ToyNJoy(" + (random.nextInt(4) + 1) + ").jpg";
        return User_InfoDao.CreateUserInfo(name, imageStr);
    }

}

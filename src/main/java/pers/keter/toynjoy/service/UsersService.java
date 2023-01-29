package pers.keter.toynjoy.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.keter.toynjoy.dao.IUsersDao;
import pers.keter.toynjoy.entity.Users;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UsersService {

    @Resource
    private IUsersDao UsersDao;
    @Resource
    private User_InfoService user_infoService;

    public ServiceResult Login (String username, String password) {

        ServiceResult result = new ServiceResult(false);

        Users user = UsersDao.Login(username, password);
        if (user != null) {
            result.setState(true);
            result.setData(user, true, false);
        } else {
            result.setMessage("用户名或密码错误！");
        }

        return result;
    }

    public ServiceResult getUserByUserName (String username) {

        ServiceResult result = new ServiceResult(false);

        Users user = UsersDao.getUserByUserName(username);
        if (user != null) {
            result.setState(true);
            result.setData(user, true, false);
        } else {
            result.setMessage("获取用户信息失败！");
        }

        return result;
    }

    @Transactional
    public ServiceResult CreateUser(String name, String password, String email){
        ServiceResult result = new ServiceResult(false);
        try {
            ServiceResult user = getUserByUserName(name);
            if (user.getData() == null || user.getData().equals("")){
                UsersDao.CreateUser(name,password,email,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                user_infoService.CreateUser(name);

                result.setState(true);
                result.setMessage("注册成功");
            }
            else{
                result.setMessage("用户名已存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setMessage(e.getMessage());
        }

        return result;
    }
}

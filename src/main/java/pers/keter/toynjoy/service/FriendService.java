package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.IFriendDao;
import pers.keter.toynjoy.dao.IProduct_Photo_GalleryDao;
import pers.keter.toynjoy.entity.Friend;
import pers.keter.toynjoy.entity.Product_Photo_Gallery;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FriendService {

    @Resource
    IFriendDao FriendDao;

    public ServiceResult getFriendByUserName(String username) {
        List<Friend> data = FriendDao.getFriendByUserName(username);
        ServiceResult result = new ServiceResult(false);
        if (data != null){
            result.setState(true);
            result.setData(data, true, true);
        }
        else{
            result.setMessage("获取数据失败");
        }
        return result;
    }

}

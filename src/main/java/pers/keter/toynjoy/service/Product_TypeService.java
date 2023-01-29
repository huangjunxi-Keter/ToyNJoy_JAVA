package pers.keter.toynjoy.service;

import org.springframework.stereotype.Service;
import pers.keter.toynjoy.dao.IProduct_TypeDao;
import pers.keter.toynjoy.entity.Product_Type;
import pers.keter.toynjoy.entity.ServiceResult;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Product_TypeService {

    @Resource
    private IProduct_TypeDao Product_TypeDao;

    public ServiceResult getAll() {
        ServiceResult result = new ServiceResult(false);

        List<Product_Type> list = Product_TypeDao.getAll();
        if (list != null) {
            result.setState(true);
            result.setData(list, true, true);
        } else {
            result.setMessage("未检索到产品类型！");
        }

        return result;
    }

}

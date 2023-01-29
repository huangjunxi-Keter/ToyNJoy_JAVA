package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Product_Photo_Gallery;

import java.util.List;

@Repository
public interface IProduct_Photo_GalleryDao {

    List<Product_Photo_Gallery> getListByProductID(String product_id);

}

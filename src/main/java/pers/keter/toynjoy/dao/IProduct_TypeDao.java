package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Product_Type;

import java.util.List;

@Repository
public interface IProduct_TypeDao {

    List<Product_Type> getAll();

}

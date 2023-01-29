package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Product;

import java.util.List;

@Repository
public interface IProductDao {

    List<Product> getProductListPaging(int top, int num, String orderColumn, String name, String type_id);

    int getCount(String name, String type_id);

    List<Product> getNewProduct();

    List<Product> getBrowseProduct();

    List<Product> getPurchasesProduct();

    int addPurchasesById(String productId);

    List<Product> getProductInWishListByUsername(String username, String productname);

    List<Product> getProductInLibraryByUsername(String username, String productname);

}

package pers.keter.toynjoy.dao;

import org.springframework.stereotype.Repository;
import pers.keter.toynjoy.entity.Library;

@Repository
public interface ILibraryDao {

    Library getByProductIdAndUsername(String username, String productId);

    int CreateLibraryByUsername(String username, String productId, String date);

}

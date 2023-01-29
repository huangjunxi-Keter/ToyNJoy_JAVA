package pers.keter.toynjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@SpringBootApplication
@MapperScan("pers.keter.toynjoy.dao")
public class ToyNJoyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToyNJoyApplication.class, args);
    }

}

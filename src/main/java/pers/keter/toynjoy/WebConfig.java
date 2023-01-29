package pers.keter.toynjoy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${cbs.userImagesPath}")
    private String userImagesPath;//图片地址
    @Value("${cbs.productImagesPath}")
    private String productImagesPath;//图片地址
    @Value("${cbs.photoGalleryImagesPath}")
    private String photoGalleryImagesPath;//图片地址

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //System.out.println("文件路径==" + userImagesPath);
        registry.addResourceHandler("/Image/**")
                .addResourceLocations(userImagesPath)
                .addResourceLocations(productImagesPath)
                .addResourceLocations(photoGalleryImagesPath);
    }

}

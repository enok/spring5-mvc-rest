package guru.springfamework.config;

import guru.springfamework.api.v1.mapper.CategoryMapper;
import guru.springfamework.api.v1.mapper.CustomerMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by enok on 31/07/2018
 */
@Configuration
public class Config {

    @Bean
    public CategoryMapper categoryMapper() {
        return CategoryMapper.INSTANCE;
    }

    @Bean
    public CustomerMapper customerMapper() {
        return CustomerMapper.INSTANCE;
    }
}

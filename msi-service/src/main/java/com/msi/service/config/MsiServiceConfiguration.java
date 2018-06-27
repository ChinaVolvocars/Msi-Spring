package com.msi.service.config;

import com.msi.service.service.UserService;
import com.msi.service.service.impl.UserServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class MsiServiceConfiguration {


  @Bean
  @ConditionalOnMissingBean
  public UserService userService() {
    return new UserServiceImpl();
  }

}

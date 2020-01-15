package com.boot.config;

import com.boot.core.annotation.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhuxiaomeng
 * @date 2018/1/3.
 * @email 154040976@qq.com
 */
@Configuration
public class LogConfig {

  @Bean(name = "logAspect")
  public LogAspect getLogAspect(){
    return new LogAspect();
  }

}

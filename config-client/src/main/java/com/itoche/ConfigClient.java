
package com.itoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 全局配置服务器
 *
 * http://localhost:8081/user/as12
 *
 */
@SpringBootApplication
public class ConfigClient {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClient.class, args);
  }
}

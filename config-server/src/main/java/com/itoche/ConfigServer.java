
package com.itoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * 全局配置服务器
 *
 * http://localhost:8088/cloud-config-common/application.property
 * http://localhost:8088/cloud-config/common
 *
 * 【post】 http://localhost:8081/refresh 刷新内存中属性
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServer.class, args);
  }
}

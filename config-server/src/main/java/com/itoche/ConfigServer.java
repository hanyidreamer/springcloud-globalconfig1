
package com.itoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * 全局配置服务器
 *
 * http://localhost:8088/cloud-config-common/application.property
 * http://localhost:8088/cloud-config/common
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServer.class, args);
  }
}

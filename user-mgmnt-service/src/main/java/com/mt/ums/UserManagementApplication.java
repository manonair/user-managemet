package com.mt.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author m1015830
 * UserManagementApplication !
 *
 */


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan("com.mt.ums.domin.entity")
@EnableJpaRepositories("com.mt.ums.repository")
@EnableDiscoveryClient
public class UserManagementApplication 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(UserManagementApplication.class, args);
    }
}

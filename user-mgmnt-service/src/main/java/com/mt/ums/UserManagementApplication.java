package com.mt.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author m1015830
 * UserManagementApplication !
 *
 */


@SpringBootApplication
@EnableConfigurationProperties
public class UserManagementApplication 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(UserManagementApplication.class, args);
    }
}

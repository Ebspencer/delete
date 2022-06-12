package com.delete.delete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeleteApplication {

    public static void main(String[] args) {
        String po = "Emmanuel";
        String mo = "Spencer";

                System.out.println(po);
        System.out.println(mo);


        SpringApplication.run(DeleteApplication.class, args);
    }

}

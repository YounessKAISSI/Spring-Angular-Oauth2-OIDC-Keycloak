package org.enset.app.inventoryservice;

import org.enset.app.inventoryservice.entities.Product;
import org.enset.app.inventoryservice.repository.ProductRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRespository productRespository){
        return args -> {
            productRespository.save(Product.builder().id("P01").name("Computer").price(5000).quantity(5).build());
            productRespository.save(Product.builder().id("P02").name("Printer").price(1200).quantity(10).build());
            productRespository.save(Product.builder().id("P03").name("Smart Phone").price(4200).quantity(34).build());
        };
    }
}

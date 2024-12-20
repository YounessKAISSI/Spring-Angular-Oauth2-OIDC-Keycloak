package org.enset.app.inventoryservice.repository;

import org.enset.app.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, String> {
}

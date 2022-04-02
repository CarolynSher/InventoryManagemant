package com.example.inventorymanagemant.repositories;

import com.example.inventorymanagemant.model.Products;
import org.springframework.data.repository.CrudRepository;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.repositories
 * <p>
 * User: carolyn.sher
 * Date: 4/2/2022
 * Time: 11:13 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface ProductRepository extends CrudRepository<Products,Long>{
}

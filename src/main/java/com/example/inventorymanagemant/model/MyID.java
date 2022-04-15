package com.example.inventorymanagemant.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.model
 * <p>
 * User: carolyn.sher
 * Date: 4/14/2022
 * Time: 3:57 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class MyID {
@Id
    private Long id;

    public MyID() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

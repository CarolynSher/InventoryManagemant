package com.example.inventorymanagemant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: InventoryManagemant
 * Package: model
 * <p>
 * User: carolyn.sher
 * Date: 4/1/2022
 * Time: 4:01 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="products")
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    double price;
    int inv;
    int min;
    int max;

    @ManyToMany
    @JoinTable(name="product_part", joinColumns =@JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name="part_id"))
    List<Parts> associatedParts;

    {
        associatedParts = new ArrayList<>();
    }


    public Products() {
    }

    public Products( String name, double price, int inv,int min, int max) {

        this.name = name;
        this.price = price;
        this.inv=inv;
        this.min = min;
        this.max = max;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public List<Parts> getAssociatedParts() {
        return associatedParts;
    }

    public void setAssociatedParts(List<Parts> associatedParts) {
        this.associatedParts = associatedParts;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        return id == products.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}

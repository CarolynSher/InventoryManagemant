package com.example.inventorymanagemant.bootstrap;

import com.example.inventorymanagemant.model.Parts;
import com.example.inventorymanagemant.model.Products;
import com.example.inventorymanagemant.repositories.PartRepository;
import com.example.inventorymanagemant.repositories.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.bootstrap
 * <p>
 * User: carolyn.sher
 * Date: 4/2/2022
 * Time: 12:38 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BootStrapData implements CommandLineRunner {
    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
    }

    public PartRepository getPartRepository() {
        return partRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Products bicycle= new Products("bicycle",100.0,15,10,100);
        Products unicycle= new Products("unicycle",100.0,15,10,100);
        Parts wheel=new Parts("wheel", 10,30,50,1000);
        Parts pedal=new Parts("pedal", 10,30,50,1000);
        bicycle.getParts().add(wheel);
        bicycle.getParts().add(pedal);
        wheel.setProduct(bicycle);
        pedal.setProduct(bicycle);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        partRepository.save(wheel);
        partRepository.save(pedal);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println("Number of Parts"+partRepository.count());
    }
}

package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.teasy.warehousedatares.entity.Product;
import uz.teasy.warehousedatares.projection.CustomOutput;
import uz.teasy.warehousedatares.projection.CustomProduct;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepositiry extends JpaRepository<Product,Integer> {

   boolean existsByNameAndCategoryId(String name, Integer category_id);


}

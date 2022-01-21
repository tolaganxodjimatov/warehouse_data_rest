package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;
import uz.teasy.warehousedatares.entity.Input_Product;
import uz.teasy.warehousedatares.projection.CustomCurrency;
import uz.teasy.warehousedatares.projection.CustomInput_Product;


@RepositoryRestResource(path = "input_product", collectionResourceRel = "list", excerptProjection = CustomInput_Product.class)
public interface Input_ProductRepository extends JpaRepository<Input_Product, Integer> {
}

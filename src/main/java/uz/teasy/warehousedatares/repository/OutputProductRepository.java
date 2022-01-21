package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.teasy.warehousedatares.entity.OutputProduct;
import uz.teasy.warehousedatares.projection.CustomMeasurement;
import uz.teasy.warehousedatares.projection.CustomOutput;
import uz.teasy.warehousedatares.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}

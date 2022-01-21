package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.teasy.warehousedatares.entity.Measurement;
import uz.teasy.warehousedatares.projection.CustomInput_Product;
import uz.teasy.warehousedatares.projection.CustomMeasurement;


@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    boolean existsByName(String name);

}

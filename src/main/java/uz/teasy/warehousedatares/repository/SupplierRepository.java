package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.teasy.warehousedatares.entity.Supplier;
import uz.teasy.warehousedatares.projection.CustomOutput;
import uz.teasy.warehousedatares.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
boolean existsByPhoneNumber(String phoneNumber);

}

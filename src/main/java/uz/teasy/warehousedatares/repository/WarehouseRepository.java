package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.teasy.warehousedatares.entity.Warehouse;
import uz.teasy.warehousedatares.projection.CustomOutput;
import uz.teasy.warehousedatares.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    boolean existsByName(String name);
}

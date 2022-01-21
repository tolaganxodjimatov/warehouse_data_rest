package uz.teasy.warehousedatares.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.teasy.warehousedatares.entity.Client;
import uz.teasy.warehousedatares.projection.CustomCategory;
import uz.teasy.warehousedatares.projection.CustomClient;



@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
    boolean existsByName(String name);
}

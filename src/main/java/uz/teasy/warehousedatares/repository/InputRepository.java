package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.teasy.warehousedatares.entity.Input;
import uz.teasy.warehousedatares.projection.CustomInput;



@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
    boolean existsByFactureNumber(String factureNumber);
}

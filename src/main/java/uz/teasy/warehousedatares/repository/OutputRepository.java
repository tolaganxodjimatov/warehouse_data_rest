package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.teasy.warehousedatares.entity.Output;
import uz.teasy.warehousedatares.projection.CustomOutput;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
    boolean existsByFactureNumber(String factureNumber);
}

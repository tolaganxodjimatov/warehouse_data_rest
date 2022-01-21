package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.teasy.warehousedatares.entity.Currency;
import uz.teasy.warehousedatares.projection.CustomCategory;
import uz.teasy.warehousedatares.projection.CustomClient;
import uz.teasy.warehousedatares.projection.CustomCurrency;


@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    boolean existsByName(String name);
}

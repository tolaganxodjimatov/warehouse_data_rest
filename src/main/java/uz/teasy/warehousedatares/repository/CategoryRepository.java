package uz.teasy.warehousedatares.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.teasy.warehousedatares.entity.Category;
import uz.teasy.warehousedatares.projection.CustomCategory;


@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @RestResource(path = "byName")
    public Page<Category> findAllByName(@Param("name") String name, Pageable pageable);
}

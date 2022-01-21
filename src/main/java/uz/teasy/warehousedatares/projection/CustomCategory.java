package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Category;


@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Integer getParentCategory();
}

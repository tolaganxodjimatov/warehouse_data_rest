package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Category;
import uz.teasy.warehousedatares.entity.Measurement;
import uz.teasy.warehousedatares.entity.Product;


@Projection(types = Product.class)
public interface CustomProduct {

    Category getCategory();

    String getDode();

    Measurement getMeasurement();

}

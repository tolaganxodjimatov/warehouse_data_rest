package uz.teasy.warehousedatares.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Input;
import uz.teasy.warehousedatares.entity.Input_Product;
import uz.teasy.warehousedatares.entity.Product;

import java.sql.Date;

@Projection(types = Input_Product.class)
public interface CustomInput_Product {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();

}

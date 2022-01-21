package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Currency;
import uz.teasy.warehousedatares.entity.Input;
import uz.teasy.warehousedatares.entity.Supplier;
import uz.teasy.warehousedatares.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}

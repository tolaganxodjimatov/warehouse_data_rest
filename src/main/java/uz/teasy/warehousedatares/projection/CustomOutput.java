package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Client;
import uz.teasy.warehousedatares.entity.Currency;
import uz.teasy.warehousedatares.entity.Output;
import uz.teasy.warehousedatares.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}

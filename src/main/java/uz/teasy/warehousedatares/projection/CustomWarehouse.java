package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Warehouse;


@Projection(types = Warehouse.class)
public interface CustomWarehouse{

    Integer getId();

    String getName();

    String getPhoneNumber();
}

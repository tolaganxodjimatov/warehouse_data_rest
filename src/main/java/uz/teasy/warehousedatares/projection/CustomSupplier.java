package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Supplier;


@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    String getPhoneNumber();
}

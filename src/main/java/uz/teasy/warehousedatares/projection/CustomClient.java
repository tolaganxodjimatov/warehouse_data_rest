package uz.teasy.warehousedatares.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Client;


@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();

    String getName();

    String getPhoneNumber();
}

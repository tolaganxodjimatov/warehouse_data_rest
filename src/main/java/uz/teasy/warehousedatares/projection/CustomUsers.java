package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Users;
import uz.teasy.warehousedatares.entity.Warehouse;

import java.util.Set;

@Projection(types = Users.class)

public interface CustomUsers {


    Integer getId();


    String getFirstName();


    String getLastName();


    String getPhoneNumber();


    String getCode();


    String getPassword();

    boolean getActive();


    Set<Warehouse> getWarehouseSet();


}

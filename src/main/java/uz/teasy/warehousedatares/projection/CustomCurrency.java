package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean getActive();

}

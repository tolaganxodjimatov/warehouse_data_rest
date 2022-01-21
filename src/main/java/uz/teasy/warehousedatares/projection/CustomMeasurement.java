package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Measurement;


@Projection(types = Measurement.class)
public interface CustomMeasurement{
    Integer getId();

    String getName();

    boolean getActive();

}

package uz.teasy.warehousedatares.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.teasy.warehousedatares.entity.Output;
import uz.teasy.warehousedatares.entity.OutputProduct;
import uz.teasy.warehousedatares.entity.Product;


@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}

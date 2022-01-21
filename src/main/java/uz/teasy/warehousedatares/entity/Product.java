package uz.teasy.warehousedatares.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.teasy.warehousedatares.entity.template.AbsEntity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbsEntity {
    @ManyToOne(optional = false)
    private Category category;

    private String code;//unikalniy kod dlya kajdogo tovara

    @ManyToOne(optional = false)
    private Measurement measurement;

}

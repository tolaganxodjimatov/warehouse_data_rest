package uz.teasy.warehousedatares.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.teasy.warehousedatares.entity.template.AbsEntity;


import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsEntity {
}

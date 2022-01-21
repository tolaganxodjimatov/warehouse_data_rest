package uz.teasy.warehousedatares.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.teasy.warehousedatares.entity.template.AbsEntity;


import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client extends AbsEntity {
    @Column(unique = true,nullable = false)
    private String phoneNumber;
}

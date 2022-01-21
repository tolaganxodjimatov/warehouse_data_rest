package uz.teasy.warehousedatares.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Timestamp date; //etibor berish kk bovotti 2 ta kutubhonadan osa bolarkjan

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private  Supplier supplier;

    @ManyToOne
    private Currency currency;

    private String factureNumber;

    @Column(unique = true,nullable = false)
    private String code;

}

package org.itstep.one_to_one_uni;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "passport")
public class Passport {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String country;

}

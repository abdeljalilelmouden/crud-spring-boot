package com.api.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : abdeljalil el mouden
 * @version : 1.0
 * @see : abdeljalil.mouden@gmail.com
 * @date : 24-09-2022
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "formation")
public class FormationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formation", nullable = false, updatable = false, unique = true)
    private Long idFormation;

    @Column(name = "title", nullable = false, updatable = true, unique = false, length = 15)
    private String titre;

    @Column(name = "etat")
    private boolean etat;

    @Temporal(TemporalType.DATE)
    private Date dateFormation;
}

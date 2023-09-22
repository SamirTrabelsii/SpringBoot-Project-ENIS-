package com.projet.membre_service.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_mbr",discriminatorType = DiscriminatorType.STRING,length = 3)
public abstract class Membre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String cin;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @NonNull
    private String Cv;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @Lob
    private byte[] photo;

}

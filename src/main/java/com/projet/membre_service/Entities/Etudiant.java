package com.projet.membre_service.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@DiscriminatorValue("etd")
@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor


public class Etudiant extends Membre {

    @Temporal(TemporalType.DATE)
    private Date dateInscription;
    private String diplome;
    private String sujet;
    @ManyToOne
    private EnseignantChercheur encadrant;

    @Builder
    public Etudiant (String cin, String nom, String prenom, Date dateNaissance,
                     String cv, String email, String password, Date dateInscription, String sujet, String diplome, EnseignantChercheur encadrant){
        super(cin, nom, prenom,dateNaissance,cv,email,password);
        this.dateInscription=dateInscription;
        this.sujet=sujet;
        this.diplome=diplome;
        this.encadrant=encadrant;
    }

}

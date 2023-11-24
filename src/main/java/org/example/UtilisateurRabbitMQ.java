package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UtilisateurRabbitMQ {

    private int id;

    private String nom;

    private String prenom;

    private String mail;

    private Boolean isEmailConfirmed;

}

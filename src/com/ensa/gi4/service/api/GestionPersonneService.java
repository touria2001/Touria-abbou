package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Personne;

public interface GestionPersonneService {
	Personne connecter(String nom, String pw);
	String determinerRole();
	boolean creerCompte(String name,String pw, String role);

}

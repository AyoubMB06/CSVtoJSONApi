package com.projet.covid.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

import org.json.CDL;

/**
 * Bean est la classe qui définit le retour de chaque cas 
 * Cette classe est caractérisée par les informations suivantes :
   
 * Description des principales fonctionnalités de la classe
 * Traitement et conversion des données et implémentation du métier du service
 * Description complémentaire, sur les attributs statiques par exemple
 * 
 * @author TpNotéAgilité
 * @version 1.0.0
 */
public class Bean
{
    private String date;
    private String pays;
    private int infections;
    private int deces;
    private int guerisons;
    private double TauxDeces;
    private double TauxGuerison;
    private double TauxInfection;
    
	public Bean(String date, String pays, int infections, int deces, int guerisons, double TauxDeces, double tauxGuerison,
			double tauxInfection) {
		this.date = date;
		this.pays = pays;
		this.infections = infections;
		this.deces = deces;
		this.guerisons = guerisons;
		this.TauxDeces = TauxDeces;
		TauxGuerison = tauxGuerison;
		TauxInfection = tauxInfection;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getInfections() {
		return infections;
	}

	public void setInfections(int infections) {
		this.infections = infections;
	}

	public int getDeces() {
		return deces;
	}

	public void setDeces(int deces) {
		this.deces = deces;
	}

	public int getGuerisons() {
		return guerisons;
	}

	public void setGuerisons(int guerisons) {
		this.guerisons = guerisons;
	}

	public double getTauxGuerison() {
		return TauxGuerison;
	}

	public void setTauxGuerison(double tauxGuerison) {
		TauxGuerison = tauxGuerison;
	}

	public double getTauxInfection() {
		return TauxInfection;
	}

	public void setTauxInfection(double tauxInfection) {
		TauxInfection = tauxInfection;
	}

	public double getTauxDeces() {
		return TauxDeces;
	}

	public void setTauxDeces(double tauxDeces) {
		TauxDeces = tauxDeces;
	}
	
	
	//DEBUT
	
	
	
	

}


	


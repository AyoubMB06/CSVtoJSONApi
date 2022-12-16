package com.projet.covid.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.GsonBuilder;
import com.projet.covid.bean.Bean;

import io.swagger.annotations.ApiOperation;

/**
 * CovidDataController est la classe qui gère la configuration du Swagger
 * Cette classe est caractérisée par les informations suivantes :
   
 * Description des principales fonctionnalités de la classe
 * Cette classe permet de configurer le controller
 * Description complémentaire, sur les attributs statiques par exemple
 * 
 * @author TpNotéAgilité
 * @version 1.0.0
 */
@Api(value = "Covid Data Resource REST Endpoint", description = "Affiche les infos du Covid 19")
@RestController
@RequestMapping(value = "/api")
public class CovidDataController {

	
	/** 
     * <b>Fonction AllCountries</b> 
     * 
     * @return Un String de type Json 
     * @throws FileNotFoundException 
     *     Fichier non fourni actuellement 
     * @throws IOException 
     *     Fichier non fourni actuellement 
     */
	@GetMapping("/getAll")
	private String AllCountries() {
			
		String line ="";
		String deleimeter = ";";
		String filePath = "coronavirus.politologue.com-pays-2022-12-12.csv";
		Integer i = 0;
		
		List<Bean> beans = new ArrayList<Bean>();
		
		
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				
				while(i<=7) {
					line = reader.readLine();
					i++;
				}
			
				
				while((line = reader.readLine()) != null) {
					//System.out.println("User Data: "+line);
					
					String[] userData = line.split(deleimeter);   
					
					beans.add(new Bean(userData[0], userData[1], Integer.valueOf(userData[2]), Integer.valueOf(userData[3]), Integer.valueOf(userData[4]), Double.valueOf(userData[5]).doubleValue(), Double.valueOf(userData[6]).doubleValue(), Double.valueOf(userData[7]).doubleValue()));
					
				}
				
				//System.out.println("User Json : "+ new GsonBuilder().setPrettyPrinting().create().toJson(beans));
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			return new GsonBuilder().setPrettyPrinting().create().toJson(beans);
	}
	
	/** 
     * <b>Fonction oneCountryData</b> 
     * 
     * @param country 
     *     Un string passé en paramètre par l'utilisateur en fonction du pays
     * @return Un String de type Json 
     * @throws FileNotFoundException 
     *     Fichier non fourni actuellement 
     * @throws IOException 
     *     Fichier non fourni actuellement 
     */
	@ApiOperation(value = "Retourner toutes les données d'un pays")
	@GetMapping("/oneCountryData")
	private String oneCountryData(@RequestParam String country) {
		
		String line ="";
		String deleimeter = ";";
		String filePath = "coronavirus.politologue.com-pays-2022-12-12.csv";
		Integer i = 0;
		
		List<Bean> beans = new ArrayList<Bean>();
		
		
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				
				while(i<=7) {
					line = reader.readLine();
					i++;
				}
			
				
				while((line = reader.readLine()) != null) {
					//System.out.println("User Data: "+line);
					
					String[] userData = line.split(deleimeter);
					
					if(userData[1].equals(country)) {
						beans.add(new Bean(userData[0], userData[1], Integer.valueOf(userData[2]), Integer.valueOf(userData[3]), Integer.valueOf(userData[4]), Double.valueOf(userData[5]).doubleValue(), Double.valueOf(userData[6]).doubleValue(), Double.valueOf(userData[7]).doubleValue()));						
					}
					
				}
				
				//System.out.println("Covid Json : "+ new GsonBuilder().setPrettyPrinting().create().toJson(beans));
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return new GsonBuilder().setPrettyPrinting().create().toJson(beans);
			
			
	}
	
	
	/** 
     * <b>Fonction oneCountryDataWithDate</b> 
     * 
     * @param country 
     *     Un string passé en paramètre par l'utilisateur en fonction du pays
     * @param date 
     *     Un string passé en paramètre par l'utilisateur en fonction de la date
     * @return Un String de type Json 
     * @throws FileNotFoundException 
     *     Fichier non fourni actuellement 
     * @throws IOException 
     *     Fichier non fourni actuellement 
     */
	@ApiOperation(value = "Retourner les données d'un pays avec une date")
	@GetMapping("/oneCountryDataWithDate")
	private String oneCountryDataWithDate(@RequestParam String country, @RequestParam String date) {
		
		String line ="";
		String deleimeter = ";";
		String filePath = "coronavirus.politologue.com-pays-2022-12-12.csv";
		Integer i = 0;
		
		List<Bean> beans = new ArrayList<Bean>();
		
		
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				
				while(i<=7) {
					line = reader.readLine();
					i++;
				}
			
				
				while((line = reader.readLine()) != null) {
					//System.out.println("User Data: "+line);
					
					String[] userData = line.split(deleimeter);
					
					if(userData[1].equals(country) && userData[0].equals(date)) {
						beans.add(new Bean(userData[0], userData[1], Integer.valueOf(userData[2]), Integer.valueOf(userData[3]), Integer.valueOf(userData[4]), Double.valueOf(userData[5]).doubleValue(), Double.valueOf(userData[6]).doubleValue(), Double.valueOf(userData[7]).doubleValue()));						
					}
					
				}
				
				//System.out.println("Covid Json : "+ new GsonBuilder().setPrettyPrinting().create().toJson(beans));
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return new GsonBuilder().setPrettyPrinting().create().toJson(beans);
	}
	
	
	/** 
     * <b>Fonction todayCountryData</b> 
     * 
     * @param country 
     *     Un string passé en paramètre par l'utilisateur en fonction du pays
     * @return Un String de type Json 
     * @throws FileNotFoundException 
     *     Fichier non fourni actuellement 
     * @throws IOException 
     *     Fichier non fourni actuellement 
     */
	@ApiOperation(value = "Retourner les données du jour pour un pays")
	@GetMapping("/todayCountryData")
	private String todayCountryData(@RequestParam String country) {
		
		String line ="";
		String deleimeter = ";";
		String filePath = "coronavirus.politologue.com-pays-2022-12-12.csv";
		Integer i = 0;
		
		LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dateObj.format(formatter);
		
		List<Bean> beans = new ArrayList<Bean>();
		
		
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				
				while(i<=7) {
					line = reader.readLine();
					i++;
				}
			
				
				while((line = reader.readLine()) != null) {
					//System.out.println("User Data: "+line);
					
					String[] userData = line.split(deleimeter);
					
					if(userData[1].equals(country) && userData[0].equals(date)) {
						beans.add(new Bean(userData[0], userData[1], Integer.valueOf(userData[2]), Integer.valueOf(userData[3]), Integer.valueOf(userData[4]), Double.valueOf(userData[5]).doubleValue(), Double.valueOf(userData[6]).doubleValue(), Double.valueOf(userData[7]).doubleValue()));						
					}
					
				}
				
				//System.out.println("Covid Json : "+ new GsonBuilder().setPrettyPrinting().create().toJson(beans));
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(beans.isEmpty()) {
				return "Valeur d'aujourd'hui indisponible !";
			}else {
				return new GsonBuilder().setPrettyPrinting().create().toJson(beans);				
			}
	}
	

}

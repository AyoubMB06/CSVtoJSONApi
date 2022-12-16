package com.projet.covid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * CovidDataApplication est la classe qui gère la partie Spring Boot Application
 * Cette classe est caractérisée par les informations suivantes :
   
 * Description des principales fonctionnalités de la classe
 * Cette classe permet de lancer l'application Spring
 * Description complémentaire, sur les attributs statiques par exemple
 * 
 * @author TpNotéAgilité
 * @version 1.0.0
 */
@SpringBootApplication
@EnableSwagger2
public class CovidDataApplication {

	/** 
     * <b>Fonction main</b> 
    */ 
	public static void main(String[] args) {
		SpringApplication.run(CovidDataApplication.class, args);
	}

}

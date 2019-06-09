package io;

//Package à importer
import java.io.Serializable;

@SuppressWarnings("serial")
public class Jeu6 implements Serializable{
	  private String nom, style;
	  private double prix;
	  private Notice6 notice;
		
	  public Jeu6(String nom, String style, double prix) {
	    this.nom = nom;
	    this.style = style;
	    this.prix = prix;
	    this.notice = new Notice6();
	  }

	  public String toString(){
	    return "Nom du jeu : " + this.nom +
	    		"\nStyle de jeu : " + this.style +
	            "\nPrix du jeu : " + this.prix +
	    		"\nLangue de la notice : " + this.notice + "\n";
	  }	
	}
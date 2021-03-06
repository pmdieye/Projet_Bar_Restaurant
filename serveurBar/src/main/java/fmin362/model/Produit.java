package fmin362.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Produit
  
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long codeProd;
    
    @Column
    private String nom;
    
    @Column
    private Long prix;
    
    @Column
    private Long contenance  ;
    


    public Produit()
    {
        // Constructeur par défaut nécessaire pour JPA
    }



	public Long getCodeProd() {
		return codeProd;
	}



	public void setCodeProd(Long codeProd) {
		this.codeProd = codeProd;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Long getPrix() {
		return prix;
	}



	public void setPrix(Long prix) {
		this.prix = prix;
	}



	public Long getContenance() {
		return contenance;
	}



	public void setContenance(Long contenance) {
		this.contenance = contenance;
	}



    
}

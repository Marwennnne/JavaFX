/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl4_tp;

/**
 *
 * @author Legion
 */
public class Produit {

    private int id;
    private String offre;
    private String categorie;
    private String Description;
    private double prix;

    public Produit() {
    }
    

    public Produit(int id, String offre, String categorie, String Description, double prix) {
        this.id = id;
        this.offre = offre;
        this.categorie = categorie;
        this.Description = Description;
        this.prix = prix;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOffre() {
		return offre;
	}


	public void setOffre(String offre) {
		this.offre = offre;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "ListeReclamtionDAO [id=" + id + ", offre=" + offre + ", categorie=" + categorie + ", Description="
				+ Description + ", prix=" + prix + "]";
	}
   

}

package bibliothéque_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Books {
	private static int count=1;
	private int id;
	private String nom;
	private String type;
	private String langue;
 //
	public Books() {};
public Books(String Nom,String Type,String Langue) {
	
	this.id=count++;
	this.nom=Nom;
	this.type=Type;
	this.langue=Langue;
}
//Encapsulation
//id
public int getId() {
	return id;
}
public void SetId(int Id) {
	this.id=Id;
}
//nom get/set
	public String getNom() {
		return nom;
	}
	public void setNom(String Nom) {
		this.nom=Nom;
	}
	//type get/set
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type=Type;
	}
	//langue
	public String getLaungue() {
		return langue;
	}
	public void setLangue(String Langue) {
		this.langue=Langue;
	}
		@Override
	public String toString() {
		return  "["+ this.id + "," +this.nom + "," + this.type +"," + this.langue+"]" ;
	}
	//Ajouter employee
	
		public void  ajouterLivre( Books livre,ArrayList<Books> listBooks ) {
			listBooks.add(livre);
			 System.out.println("Ajouter liver avec succes");
			System.out.println(" livre " + listBooks);
			
		}
		public void supprimerLivre(Books livre,ArrayList<Books> listBooks ,int id) {
		for(int j=0;j<listBooks.size();j++) {
			  
			  if(id==listBooks.get(j).getId()) {
				  listBooks.remove(j);
				  System.out.println("supprimer avec succes id =" + id);
				  
			  }
			  else {
				  System.out.println("sorry dont find");
			  }
			  }
		}
		
		public void modifierLivre(ArrayList<Books> listBooks ,int id,String Nom,String Type,String Langue) {
			for(int j=0;j<listBooks.size();j++) {
				  
				  if(id==listBooks.get(j).getId()) {
					  listBooks.get(j).SetId(id);
					  listBooks.get(j).setNom(Nom);
					  listBooks.get(j).setType(Type);
					  listBooks.get(j).setLangue(Langue);
					  System.out.println("Modifier avec succes id =" + id + " and livre : \n " + listBooks.get(j).toString());
				  }else {
					  System.out.println("sorry dont find");
				  }
				  }
			}
			  
}

package bibliothéque_1;

import java.util.ArrayList;
import java.util.Arrays;

public class personne{

		private String nom;
		private String prenom;
		private String email;
		private String filiere;
		
			public personne() {}
			public personne(String Nom,String Prenom,String Email,String Filiere) {
				this.nom=Nom;
				this.prenom=Prenom;
				this.email=Email;
				this.filiere=Filiere;
			}
			//nom
			public String nom() {
				return nom;
			}

			public void setNom(String n) {
				this.nom = n;
			}
			//prenom
			public String prenom() {
				return prenom;
			}

			public void setPrenom(String p) {
				this.prenom = p;
			}
			//email
			public String email() {
				return email;
			}

			public void setEmail(String E) {
				this.email = E;
			}
			//filiere
			public String filiere() {
				return filiere;
			}

			public void setFiliere(String f) {
				this.filiere = f;
			}
			@Override
			public String toString(  ) {
				return   this.nom + "," + this.prenom + "," + this.email + "," + this.filiere ;
						}

			
}



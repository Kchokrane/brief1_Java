
/*
 * algorithme Fonction2
 * variable
 * 	nom, prenom: string
 * 	nbr_heure: integer
 * 	tarif_par_heure,prix_total : float
 * debut
 * 		ecrire("Bonjour dans c'est programme")
 * 		ecrire("Quel est votre nom ?")
 * 		lire nom
 * 		ecrire("Quel est votre prenom ?")
 * 		lire prenom
 * 		ecrire("Bonjour, " + nom)
 * 		ecrire("Entrez le nombre des heures travaillees")
 * 		lire nbr_heure
 * 		si nbr_heurenbr_heure <= 60 alors
 * 			ecrire("Entrez le tarif par heure")
 * 			lire tarif_par_heure
 * 			si nbr_heurenbr_heure <= 60 alors
 *				prix_total <-- nbr_heure * tarif_par_heure
 * 			sinon
 * 				prix_total <-- prixttc=prix *40+(prixt *(nbrHeur-40))
 * 			fin si
 * 			affichage("votre indemnisation est de " + prix_total + " MAD")
 * 		sinon
 * 			ecrire("Le nombre des heures travaill�es est invalide")
 * 		fin si
 * 		ecrire("Fin de programme")
 * fin
 */
package App;
import java.util.Scanner;


public class algo_ {
	public static void main(String[] args) {
		String nom;
		Scanner s= new Scanner(System.in);
		
			System.out.println("Bonjour dans ce programme");
			System.out.println("Quel est votre nom ?");
			nom = s.nextLine();
			System.out.println("Quel est votre prenom ?");
			String  prenom = s.nextLine();
			System.out.println("Bonjour, "+nom+" "+prenom);
		System.out.println("entrer le nombre des heures de travail dans la semaine");
		int nbrHeur= s.nextInt();
		
		double prixttc;
		if(nbrHeur<60) {System.out.println("entrer  le prix ");
		double prix= s.nextDouble();
			if(nbrHeur<40) {
			prixttc =prix*nbrHeur;
			}else {
				double prixt=prix + 0.5 * prix;
				
				prixttc=prix *40+(prixt *(nbrHeur-40));
			}
			System.out.println("prix total est : " + prixttc + " MAD");
			
		}
		else {
			System.out.println("informations errones");
		}
	s.close();
				
		
			}
}

package bibliothéque_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	ArrayList<Etudient> ListEtudient= new ArrayList<Etudient>();
	ArrayList<Employe> ListEmp= new ArrayList<Employe>();
	ArrayList<Books> LisLiver= new ArrayList<Books>();
	String Nom,prenom,email,filiere,telephone,type,langue;
	Nom=prenom=email=filiere=telephone=type=langue="";
	int age;
	int id;
	Etudient etud = new Etudient();
	Books livre= new Books();
	Employe emp=new Employe();
	while(true) {
		
		 System.out.println("entrer une methode :\n Ajouter : + \n Supprimer :- \n Modifier : modifier");
		 String method=scan.next();
		 String choix="";
		 
	switch(method) {
	
	  	case "+":
		  System.out.println("pour  ajouter etudient -> etud \n  ou pour ajouter employe->emp \n ou pour ajouter livre->livre");
		    choix= scan.next();
					   switch(choix) {
					   case "etud":
						   
						   System.out.println("entrer le Nom de  etudient");
							 Nom= scan.next();
							 System.out.println("entrer le prenom de  etudient");
							 prenom= scan.next();
							 System.out.println("entrer le email de  etudient");
							 email= scan.next();
							 System.out.println("entrer le filiere de  etudient");
							 filiere= scan.next();
							 etud=  new Etudient(Nom,prenom,email,filiere);
							etud.Ajouteretudient(etud, ListEtudient);
						break;
						   case "emp":
							   System.out.println("entrer le Nom de  employee");
								 Nom= scan.next();
								 System.out.println("entrer le prenom de  employee");
								 prenom= scan.next();
								 System.out.println("entrer le email de  employee");
								 email= scan.next();
								 System.out.println("entrer le filiere de  employee");
								 filiere= scan.next();
								 System.out.println("entrer le numero telephone de  employee");
								 telephone= scan.next();
								 System.out.println("entrer l'age de  employee");
								 age= scan.nextInt();
								 emp= new Employe(Nom,prenom,email,filiere,telephone, age);
								emp.AjouterEmployee(emp, ListEmp);
								break;
								   case "livre":
									   	 System.out.println("entrer le Nom de  liver");
										 Nom= scan.next();
										 System.out.println("entrer le type de  liver");
										 type= scan.next();
										 System.out.println("entrer la langue de  liver");
										 langue= scan.next();
										 livre= new Books(Nom,type,langue);
										 livre.ajouterLivre(livre, LisLiver);
										 
										 break;
						default:
							 
							
								   }
		
	    break;
	  		case "-":
	  			
	  			System.out.println("pour  supprimer etudient -> etud \n  ou pour supprimer employe->emp \n ou pour supprimer livre->livre");
			    choix= scan.next();
	  			switch(choix) {
	  				case "livre":
	  					if(LisLiver.size()>0) {
	  			System.out.println("les livres  : \n " + LisLiver); 
	  			System.out.println("entrer l id quel dois supprimer ");
	  			id= scan.nextInt();
	  			livre.supprimerLivre(livre, LisLiver,id);
	  			}else {
	  				System.out.println("livre vide Ajouter des livres");
	  			}
	  			
	  			break;
	  		case "etud":
	  			if(ListEtudient.size()>0) {
	  			System.out.println("les etudients  : \n " + ListEtudient); 
	  			System.out.println("entrer l id quel dois supprimer ");
	  			id= scan.nextInt();
	  			
	  			etud.supprimerEtudient(ListEtudient,id);
	  			}else {
	  				System.out.println("etudient vide Ajouter des etudients");
	  			}
	  			break;
			   
	 		case "emp":
	 			if(ListEmp.size()>0) {
	  			System.out.println("les employee  : \n " + ListEmp); 
	  			System.out.println("entrer l id quel dois supprimer ");
	  			id= scan.nextInt();
	  			emp.supprimerEmployee(ListEmp, id);
	 			}else {
	 				System.out.println("employe vide Ajouter des employe");
	 			}
	  			
	  			break;
	default:
	
	  			}
	  			break;
	  		case "modifier":
	  			System.out.println("pour  modifier etudient -> etud \n  ou pour modifier employe->emp \n ou pour modifier livre->livre");
			    choix= scan.next();
			    switch(choix) {
  				case "livre":
  					if(LisLiver.size()>0) {
  						System.out.println("les livres  : \n " + LisLiver); 
  		  				System.out.println("entrer l id quel dois modifier ");
  		  				id= scan.nextInt();
  		  				System.out.println("entrer le Nom de  liver");
  		  				Nom= scan.next();
  		  				System.out.println("entrer le type de  liver");
  		  				type= scan.next();
  		  				System.out.println("entrer la langue de  liver");
  		  				langue= scan.next();
  		  				//appel method modifierLiver(....);
		  		  		livre.modifierLivre(LisLiver, id, Nom, type, langue);
		  		  		System.out.println(" livre " + LisLiver);
  					}else {
  						System.out.println("livre vide Ajouter des livres");
  					}
		  		  		break;
  				case "etud":
  					if(ListEtudient.size()>0) {
						System.out.println("les etudient  : \n " + ListEtudient); 
		  				System.out.println("entrer l id quel dois modifier ");
		  				id= scan.nextInt();
		  				 System.out.println("entrer le Nom de  etudient");
						 Nom= scan.next();
						 System.out.println("entrer le prenom de  etudient");
						 prenom= scan.next();
						 System.out.println("entrer le email de  etudient");
						 email= scan.next();
						 System.out.println("entrer le filiere de  etudient");
						 filiere= scan.next();
						 //appel method modifierEtudient
	  		  		etud.modifierEtudient(ListEtudient, id, Nom,prenom,email,filiere);
	  	
	  		  		System.out.println(" etudient " + ListEtudient);
					
  					}else {
  						System.out.println("etudient vide Ajouter des etudients");
  					}
  					
  					break;
					
  				case "emp":
  					if(ListEmp.size()>0) {
  					System.out.println("les employes  : \n " + ListEmp); 
	  				System.out.println("entrer l id quel dois modifier ");
	  				id= scan.nextInt();
  					 System.out.println("entrer le Nom de  employee");
					 Nom= scan.next();
					 System.out.println("entrer le prenom de  employee");
					 prenom= scan.next();
					 System.out.println("entrer le email de  employee");
					 email= scan.next();
					 System.out.println("entrer le filiere de  employee");
					 filiere= scan.next();
					 System.out.println("entrer le numero telephone de  employee");
					 telephone= scan.next();
					 System.out.println("entrer l'age de  employee");
					 age= scan.nextInt();
						 //appel method modifierEmploye
	  		  		emp.modifierEmploye(ListEmp, id, Nom, prenom, email, filiere, telephone, age);
	  	
	  		  		System.out.println(" employe " + ListEmp);
					
			    }else {
						System.out.println("employe vide Ajouter des employes");
					}
	  		  		break;
default:

			    }
		  
	  default:
			
	}
	}
	
	}


}

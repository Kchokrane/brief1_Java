package Employe;

public class EmployeFixe extends Employe {
	protected double Salaire;

	public EmployeFixe() {}
	public EmployeFixe(double salaire) {
		super();
		this.Salaire = salaire;
	}
	
	public double getSalaire() {
		return Salaire;
	}
	public void setSalaire(double salaire) {
		Salaire = salaire;
	}
	public void ToString() {
		System.out.println(" Bonjour "+this.getNom() +" Votre salaire mensuel est:"+ this.Salaire +" MAD");
	}

}

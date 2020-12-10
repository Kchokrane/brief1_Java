package Employe;

public class EmployeCommission extends EmployeFixe {

    protected double Commission;
    protected int Ventes;
	public EmployeCommission(double commission, int ventes) {
		super();
		Commission = commission;
		Ventes = ventes;
	}
	
	
	public double Calcule_salaire_commission() {
		double salaire_mensuel;
		return salaire_mensuel= getSalaire()+ this.Commission * this.Ventes;
	}
	  public void afficher() {
	 		System.out.print("Bonjour "+getNom() +" Votre salaire mensuel est:"+ Calcule_salaire_commission() +" MAD");
	 	}
    
}

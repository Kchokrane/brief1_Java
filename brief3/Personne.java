package HoussniOuchad;

public abstract class Personne {
	protected String Nom;
	protected int Age;
	
	
	public Personne(String nom, int age) {
		super();
		Nom = nom;
		Age = age;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	 abstract void afficher();
}

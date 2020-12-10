package HoussniOuchad;

public class Medecin extends Personne {
	
	

	public Medecin(String nom, int age) {
		super(nom, age);
		// TODO Auto-generated constructor stub
	}

	public void afficher() {
		System.out.println("- Je suis "+getNom()+", j’ai "+getAge()+" ans et je travaille en tant que médecin ");
	}
}

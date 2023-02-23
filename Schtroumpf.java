package lesschtroumpfs;

public class Schtroumpf {
	private String nom;
	private int age;
	private boolean content;
	private Village village;
	
	
	Schtroumpf(String pfNom, int pfAge){
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = null;	
	}
	
	Schtroumpf(String pfNom, int pfAge, Village pfVillage){
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = pfVillage;	
	}
	
	/** Donne le nom du Schtroumpf
	 * 
	 * @return le nom du Schtroumpf
	 */
	public String getNom() {
		return this.nom;
	}
	
	/** Détermine l'age du Schtroumpf
	 * 
	 * @return l'age du Schtroumpf
	 */
	public int getAge() {
		return this.age;
	}
	
	/** Détermine si le Schtroumpf est content 
	 * 
	 * @return true si il est content, false sinon
	 */
	public boolean estContent() {
		return this.content;
	}
	
	
	/** Le Schtroumpf se présente en donnant son nom, age et si il est content
	 * 
	 */
	public String toString() {
		String txt = "Je suis " + this.nom + ", j'ai " + this.age + " et je suis ";
		if(this.content == false) {
			txt += "PAS ";
		}
		txt += "content.";
		if(this.village == null) {
			txt += " Je suis ermite.";
		}
		else {
			txt+=" Mon village est le village " + this.village.getNom();
		}
		return txt;
	}
	
	/** Affiche le résultat de la fonction toString()
	 * 
	 */
	public void sePresenter() {
		System.out.println(this.toString());
	}
	
	
	/** Le Schtroumpf chante si il est heureux, sinon il dit "gloups"
	 * 
	 * @return le chant du Schtroumpf en fonction de son état
	 */
	public String leChant() {
		String txt = "";
		if(this.content == true) {
			txt += "la, la, la Schtroumpf la, la";
		}
		else {
			txt += "gloups";
		}
		return txt;
	}
	
	
	/** Le Schtroumpf chante, on affiche le résultat de la fonction leChant()
	 * 
	 */
	public void chanter() {
		System.out.println(this.leChant());
	}
	
	
	/** C'est l'anniversaire de ce Schtroumpf, son age est incrémenté de 1
	 * 
	 */
	public void anniversaire() {
		this.age++;
	}
	
	
	/** Mange de la salsepareille, ce qui le rend heureux
	 * 
	 * @param pfQte : la quantité de salsepareille qu'il mange
	 */
	public void manger(int pfQte) {
		if(pfQte > 0) {
			this.content = true;
		}
	}
	
	/** Va travailler au pont, ce qui le rend triste
	 * 
	 */
	public void allerTravailler() {
		this.content = false;
	}
	
	
	/** Permet de connaître le village du Schtroumpf
	 * 
	 * @return le nom du village
	 */
	public Village getVillage() {
		return this.village;
	}
		
	/** Le Schtroumpf a un nouveau village !
	 * 
	 */
	public void setVillage(Village pfVillage) {
		this.village = pfVillage;
	}
	
	
	public void recolterSalsepareille() {
		if(this.village != null) {
			this.village.nbSalse += 5;
			this.content = false;
		}
		else {
			this.manger(5);
		}
	}
	
	
	public void dinerAuVillage() {
		if(this.village.nbSalse < 3){
			System.out.println("Il n'y a pas assez de salsepareille pour manger !");
		} else {
			this.manger(3);

		}
	}
}

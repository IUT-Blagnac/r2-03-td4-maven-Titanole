package lesschtroumpfs;

public class Village {
	private String nom; //nom du village
	private Schtroumpf[] habitants; //liste des habitants
	private int nbHab; //nombre d'habitants
	int nbSalse; //Le nombre de SalsePareille en stock 
	
	
	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.nom = pfNomV;
		this.habitants = new Schtroumpf[100];
		this.nbHab = 0;
		this.nbSalse = pfStockSalsepareille;
		
		for(int i = 0; i<pfNomsDesSchtroumpfs.length; i++) {
			habitants[i] = new Schtroumpf(pfNomsDesSchtroumpfs[i], (int)(Math.random()*150),this);
			this.nbHab++;
		}
	}
	
	/** Renvoie le nom du village
	 * 
	 * @return le nom du village
	 */
	public String getNom() {
		return this.nom;
	}
	
	
	/** Renvoie le nombre d'habitants du village
	 * 
	 * @return le nombre de Schtroumpfs du village
	 */
	public int getNbSchtroumpf() {
		return this.nbHab;
	}
	
	
	/** Renvoie le nombre de SalsePareille en stock dans le village
	 * 
	 * @return le stock de nourriture
	 */
	public int getStockSalsepareille() {
		return this.nbSalse;
	}
	
	/** Fete du village ou tous les Schtroumpfs se présentent et chantent
	 * Affiche leur présentation et leur chant
	 */
	public void solstice_d_ete(){
		System.out.println("Village : " + this.nom);
		System.out.println("Nombre de Schtroumpfs présents :" + this.nbHab);
		
		//nombre de Schtroumpfs contents
		int nbSchtroumpfsContents = 0;
		for(int j = 0; j<this.nbHab; j++) {
			if(this.habitants[j].estContent() == true) {
				nbSchtroumpfsContents++;
			}
		}
		System.out.println("Le nombre de Schtroumpfs contents est " + nbSchtroumpfsContents);
		
		
		for (int i = 0; i<this.nbHab; i++) {
			this.habitants[i].sePresenter();
			this.habitants[i].chanter();
		}
	}
	
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf lePlusVieux = this.habitants[0];
		for (int i = 1; i<this.nbHab; i++) {
			if(this.habitants[i].getAge() > lePlusVieux.getAge()) {
				lePlusVieux = this.habitants[i];
			}
		}
		return lePlusVieux;
	}
	
	public void envoyerAuTravail() {		
		for(int i = 0; i<this.nbHab; i=i+2) {
			this.habitants[i].allerTravailler(); 
		}
	}
	
	public void schtroumpsfHeureux () {
		for(int i = 0; i<this.nbHab; i++) {
			if(this.habitants[i].estContent() == true) {
				this.habitants[i].sePresenter();
				this.habitants[i].chanter();
			}
		}
	}
	
	public void dinerTousEnsemble() {
		if(this.nbSalse < 3*this.nbHab) {
			System.out.println("Votre stock de salsepareille n'est pas suffisant pour tous manger au village !");
		}
		else {
			for(int i = 0; i<this.nbHab; i++) {
				this.habitants[i].dinerAuVillage();
			}
		}
	}
	
	public void envoyerCueillirSalsepareille() {
		for(int i = 0; i<this.nbHab; i = i+2) {
			this.habitants[i].recolterSalsepareille();
		}
	}
	

}


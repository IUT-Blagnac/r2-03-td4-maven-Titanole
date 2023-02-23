package lesschtroumpfs;

public class MainSchtroumpf {
	public static void main(String[] args) {
		
		//création du Schtroumpf grognon
		Schtroumpf grognon = new Schtroumpf("grognon", 135);
		System.out.println("Grognon est content ? " + grognon.estContent());
		
		//le Schtroumpf se présente à nous et chante
		grognon.sePresenter();
		grognon.chanter();
		
		//le Schtroumpf part travailler
		grognon.allerTravailler();
		System.out.println("Grognon est content ? " + grognon.estContent());
		
		//le Schtroumpf mange 10 salsepareille
		System.out.println("Grognon va manger");
		grognon.manger(10);
		
		System.out.println("Grognon est content ? " + grognon.estContent());
		
		//il se présente et chante à nouveau
		grognon.sePresenter();
		grognon.chanter();
		
		//il fête son anniversaire
		grognon.anniversaire();
		
		//il se présente et chante une denrière fois
		grognon.sePresenter();
		grognon.chanter();
	}
	

}

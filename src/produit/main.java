package produit;

public class main {

	public static void main(String[] args) {
		Produit produit1,produit2,produit3;
		
		produit1=new Produit();
		produit2=new Produit();
		produit3=new Produit();
		
		produit1.id=1021;
		produit1.libelle="Lait";
		produit1.marque="Delice";
		
		produit2.id=2510;
		produit2.libelle="Yaourt";
		produit2.marque="Vitalait";
		
		produit3.id=3250;
		produit3.libelle="Tomate";
		produit3.marque="Sicam";
		produit3.prix=(float)1.200f;
		
		produit1.afficher();
		produit2.afficher();
		produit3.afficher();
		
		produit1.prix=(float)0.700f;
		produit1.afficher();
		
		produit2.prix=(float)0.600f;
		produit2.afficher();

		produit1.date="01/01/3010";
		produit2.date="01/01/3010";
		produit3.date="01/01/3010";
		
		produit1.afficher();
		produit2.afficher();
		produit3.afficher();

	}

}
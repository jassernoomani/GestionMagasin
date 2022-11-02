
package produit;

public class Produit {
	 
	   int id;
	   String libelle,marque,date;
	   float prix;
	   
	   Produit(){
		   id=0;
		   libelle="";
		   marque="";
		   prix=0;
	   }
	   public void afficher() {
                  System.out.println("id: "+id);   
                  System.out.println("libelle: "+libelle);   	  
                  System.out.println("marque: "+marque);   	  
                  System.out.println("prix: "+prix);  
                  System.out.println("date: "+date);   	  


		   
	   }

}



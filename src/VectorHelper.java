import java.util.Scanner;


public class VectorHelper {

	
	
	
	

		//Trier les �l�ments d�un vecteur
		
		public static void TriVec(int[] tab  ){
			int[] TabTri = new int[tab.length];
			int i=0 ,min,j = 0;
			for (i=0;i<=tab.length;i++){
				min = tab[i]; j =i+1;
				while (j<=tab.length){
					if (min>tab[j]){ min = tab[j] ; TabTri[i]=min; } j++;}
				}
			for (j=0;j<(TabTri.length);j++){System.out.println(TabTri[j]);}
			}
		/*******************************************************************/
		//Sommer deux vecteurs
		  // une exception si les deux vecteurs ont des tailles diff�rentes
		class TDiffException extends Exception{
	     public void TaillesDiff(){
		 System.out.println("les deux vecteurs ont des tailles diff�rentes!!");}}
		//la somme
		public int somme(int[] tab1 , int[] tab2) throws TDiffException{
			if (tab1.length != tab2.length)throw new TDiffException();
			else{
			int somme = 0; int i;
				for (i=0;i<tab1.length;i++){somme = somme+tab1[i];}
				for (i=0;i<tab2.length;i++){somme = somme+tab2[i];}
			return somme;}}
		/*******************************************************************/
		//Inverser les �l�ments d�un vecteur
		public int[] inverse(int[] tab){
			int i=0 ,j=tab.length,t;
			while (i<j){t=tab[i];tab[i]=tab[j];tab[j]=t;i++;j--;}
			return tab;}
		/*******************************************************************/
		//Obtenir simultan�ment le minimum et le maximum d�un vecteur

		public int  minmax(int[] tab){
			int min=0,max=0,i;
			for(i=0;i<tab.length;i++){if (tab[i]<min) min=tab[i]; if(tab[i]>max) max=tab[i]; }
			System.out.println(min );System.out.println(max );
			return(0);}
		

		
		public static void main(String[] args) {

			System.out.println("Choisissez une operation :  \n");
			System.out.println(" [1] . Trier les éléments d’un vecteur \n");
			System.out.println(" [2] . Sommer deux vecteurs\n");
			System.out.println(" [3] . Inverser les éléments d’un vecteur\n");
			System.out.println(" [4] . Obtenir le minimum et le maximum d’un vecteur\n");
			System.out.println(" [5] . Appliquer une formule à tous les éléments d’un vecteur\n");
			Scanner sc = new Scanner(System.in); int sc1 = sc.nextInt();
			switch (sc1){
			    case (1):
			    	System.out.println("le nombre d'elements dans le vecteur");
			        Scanner nb = new Scanner(System.in); int nbr = nb.nextInt();
	                int[] tab = new int[nbr];
	                for (int i=0;i<nbr;i++){
	                	Scanner j = new Scanner(System.in); int k = j.nextInt();
	                	tab[i]=k; }
	                 TriVec(tab);
	               
			       

	                break;
	            case (2):  break;
	            case (3):  break;
	            case (4):  break;
	            case (5):  break;
	        }}

			
		}


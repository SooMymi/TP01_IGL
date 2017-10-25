package Mypackage;

import java.util.Scanner;

import vh.TDiffException;

/**
 * la classe VectorHelper qui assure toutes les operations de l application
 
 * @author SAADOUN Soumia
 * @version 1.0*/
public class VectorHelper {
	 public VectorHelper() {
		
	}
	 
	 /**
	  * Trier les elements d un vecteur ( tri par bulle) 
	  * @param tab 
	  *      le vecteur qui va etre trie*/
		
	 public static int[] TriVec(int[] tab)
	 {
	     boolean tab_en_ordre = false;
	     int taille = tab.length , k;
	     while(!tab_en_ordre)
	     {
	         tab_en_ordre = true;
	         for(int i=0 ; i < taille-1 ; i++)
	         {
	             if(tab[i] > tab[i+1])
	             {    k = tab[i]; tab[i]=tab[i+1]; tab[i+1]=k;  
	                  tab_en_ordre = false;
	             }
	         }
	         taille--;
	     }
	    // for (int i=0;i<tab.length;i++){System.out.println(tab[i]);}
	     return tab;
	 }
		  
		/**
		 *Sommer deux vecteurs 
		 *@param tab1 
		 *    le 1er vecteur
		 *@param tab2 
		 *    le 2eme vecteur
		 *@throws vh.TDiffException levee si les vecteurs ont des tailles differentes */
		
		  // une exception si les deux vecteurs ont des tailles differentes
		 
		public static  int somme(int[] tab1 , int[] tab2) throws TDiffException{
			if (tab1.length != tab2.length) {
				throw new TDiffException();
			} else {
				int som = 0; int i;
				for (i=0;i<tab1.length;i++){som = som+tab1[i];}
				for (i=0;i<tab2.length;i++){som = som+tab2[i];}
				//System.out.println("la somme des elements >> " +som );
				return som;}
			}
		
		
		/**
		 *Inverser les elements d un vecteur 
		 *@param tab
		 * le vecteur dont les elements seront inverses
		 */
		
		public static int[] inverse(int[] tab){
			int i=0 ,j=(tab.length-1),t,k;
			while (i<j){t=tab[i];
			tab[i]=tab[j];
			tab[j]=t;
			i++;j--;
			}
			//for (i=0;i<tab.length;i++){System.out.println(tab[i]);}
			return tab;
			}
		//lkfh
		
		/**
		 *Obtenir simultanement le minimum et le maximum d un vecteur 
		 *@param tab
		 *le latbleau dans lequel on cherche le min et le max*/
		

		public static int[] minmax(int[] tab){
			int min=tab[0],max=tab[0],i; int[] tab1= new int[2];
			for(i=0;i<tab.length;i++){if (tab[i]<min) min=tab[i]; if(tab[i]>max) max=tab[i]; }
			tab1[0]=min;tab1[1]=max;
			//System.out.println(" le min >>  "+min );System.out.println(" le max >>  "+max );
			return tab1;
			}
		

		
		public static void main(String[] args) throws Exception {

			System.out.println("Choisissez une operation :  \n");
			System.out.println(" [1] . Trier les éléments d’un vecteur \n");
			System.out.println(" [2] . Sommer deux vecteurs\n");
			System.out.println(" [3] . Inverser les éléments d’un vecteur\n");
			System.out.println(" [4] . Obtenir le minimum et le maximum d’un vecteur\n");
			System.out.println(" [5] . Appliquer une formule à tous les éléments d’un vecteur\n");
			Scanner sc = new Scanner(System.in); int sc1 = sc.nextInt();
			switch (sc1){
			
			    case (1):
			    	int i;
			    	System.out.println("le nombre d'elements dans le vecteur");
			        Scanner nb = new Scanner(System.in); int nbr = nb.nextInt();
	                int[] tab = new int[nbr];
	                for (i=0;i<nbr;i++){
	                	Scanner j = new Scanner(System.in); int k = j.nextInt();
	                	tab[i]=k; }
	                 tab=TriVec(tab);
	                 for (i=0;i<tab.length;i++){System.out.println(tab[i]);}
			          break;
	            case (2):
	            	System.out.println("le nombre d'elements du 1er vecteur");
	            Scanner nb01= new Scanner(System.in); 
	            int nb1 = nb01.nextInt();
	            System.out.println("le nombre d'elements du 2eme vecteur");
	            Scanner nb02= new Scanner(System.in); 
	            int nb2 = nb02.nextInt();
	            if (nb1==nb2){
	            	int[] tab1 = new int[nb1];int[] tab2 = new int[nb2];
	            	System.out.println(" Remplir le 1er vect");
	            	for ( i=0;i<nb1;i++){
	      	            		Scanner e= new Scanner(System.in);
	            		int ee = e.nextInt(); tab1[i]=ee;}
	            	System.out.println(" Remplir le 2eme vect");
	            	for ( i=0;i<nb1;i++){
	            		Scanner e= new Scanner(System.in);
	            		int ee = e.nextInt(); tab2[i]=ee;}
	            	   int som= somme(tab1 ,tab2);
	            	   System.out.println("la somme = "+som);
	            }else throw new TDiffException();
	            	break;
	            case (3):
	            	
	             	System.out.println("le nombre d'elements du vecteur");
	            Scanner nbv= new Scanner(System.in); 
	            int n = nbv.nextInt(); int[] tab1 = new int[n];
	            System.out.println(" Remplir le  vect");
            	for ( i=0;i<n;i++){
      	            		Scanner e= new Scanner(System.in);
            		int ee = e.nextInt(); tab1[i]=ee;}
            	
            	int[] tab3= inverse (tab1);
            	for (i=0;i<tab3.length;i++){System.out.println(tab3[i]);}
	            break;
	            
	            case (4):  
	            	System.out.println("le nombre d'elements du vecteur");
	            Scanner nbm= new Scanner(System.in); int[] tab5;
	            int m = nbm.nextInt(); int[] tab2 = new int[m];
	            System.out.println(" Remplir le  vect");
            	for ( i=0;i<m;i++){
      	            		Scanner e= new Scanner(System.in);
            		int ee = e.nextInt(); tab2[i]=ee;}
            	tab5= minmax(tab2);
            	System.out.println(" le min >>  "+tab5[0] );System.out.println(" le max >>  "+tab5[1] );
	            	break;
	            case (5):  break;
	        }}

			
		}


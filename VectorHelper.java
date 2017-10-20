package vecteur;

public class VectorHelper {
	
	//Trier les éléments d’un vecteur
	int[] TabTri;
	public int[] TriVec(int[] tab  ){
		int i=0 ,min,j;
		for (i=0;i<tab.length;i++){
			min = tab[i];j =i+1;
			while (j<tab.length){
				//if (min>tab[j]){ min = tab[j] ; TabTri[i]=min; } j++;}}
			}}return TabTri;}
	/*******************************************************************/
	//Sommer deux vecteurs
	  // une exception si les deux vecteurs ont des tailles différentes
	class TDiffException extends Exception{
     public void TaillesDiff(){
	 System.out.println("les deux vecteurs ont des tailles différentes!!");}}
	//la somme
	public int somme(int[] tab1 , int[] tab2) throws TDiffException{
		if (tab1.length != tab2.length)throw new TDiffException();
		else{
		int somme = 0; int i;
			for (i=0;i<tab1.length;i++){somme = somme+tab1[i];}
			for (i=0;i<tab2.length;i++){somme = somme+tab2[i];}
		return somme;}}
	/*******************************************************************/
	//Inverser les éléments d’un vecteur
	public int[] inverse(int[] tab){
		int i=0 ,j=tab.length,t;
		while (i<j){t=tab[i];tab[i]=tab[j];tab[j]=t;i++;j--;}
		return tab;}
	/*******************************************************************/
	//Obtenir simultanément le minimum et le maximum d’un vecteur
	int mm[];
	public int[] minmax(int[] tab){
		int min=0,max=0,i;
		for(i=0;i<tab.length;i++){if (tab[i]<min) mm[0]=tab[i]; if(tab[i]>max) mm[1]=tab[i]; }
	return(mm);}
	public static void main(String[] args) {
		
	}
    

}

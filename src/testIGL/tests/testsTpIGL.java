package testIGL.tests;
import Mypackage.*;
import vh.TDiffException;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test; // ajouter la JUinit 

import vh.TDiffException;
/**
 * classe dans la quelle tt les tess des fcts seront faits
 * @author SAADOUN Soumia
 * @version 2.0**/
public class testsTpIGL {
	int[] Tabtest = {5,9,3,8,1,6,2};int[] Tabtest2 = {5,9,3,8,1,6,2}, Tabtest3={2,6,1,8,3,9,5},Tabtest4={1,9};
	/**
	 * teste la fct de tri **/
	@Test
	public void TestTri(){
		
	    Arrays.sort(Tabtest2);
		boolean resultat = Arrays.equals(Tabtest,Mypackage.VectorHelper.TriVec(Tabtest));
		Assert.assertTrue("dvrait retourner vrai ", resultat);
	}
	@Test //(expected = TDiffException.class)
	public void TestSomme() throws TDiffException{
		int[] tab1 ={2,5}, tab2={3,1,9};
	    boolean resultat = false;
	    if (11==(Mypackage.VectorHelper.somme(tab1, tab2)))resultat =true;
		Assert.assertTrue("dvrait retourner 3+1+2+5=11 et g�n�re une excaption si les tailles sont differentes", resultat);
	}
	
	@Test 
	public void TestInverser(){
	    boolean resultat =Arrays.equals(Tabtest2,Mypackage.VectorHelper.inverse(Tabtest3));
	    Assert.assertTrue("devrait retourner vrai", resultat);
	}
	
	@Test 
	public void TestMinMax(){
	    boolean resultat =Arrays.equals(Tabtest4,Mypackage.VectorHelper.minmax(Tabtest3));
	    Assert.assertTrue("devrait retourner vrai", resultat);
	}
	
	

}

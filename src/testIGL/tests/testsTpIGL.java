package testIGL.tests;
import Mypackage.*;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test; // ajouter la JUinit 

public class testsTpIGL {
	@Test
	public void TestTri(){
		int[] Tabtest = {5,9,3,8,1,6,2};int[] Tabtest2 = {5,9,3,8,1,6,2};
	    Arrays.sort(Tabtest);
		boolean resultat = Arrays.equals(Tabtest,Mypackage.VectorHelper.TriVec(Tabtest2));
		Assert.assertTrue("dvrait retourner vrai ", resultat);
	}

	

}

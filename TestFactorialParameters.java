package pruebaJunitFactorial;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class TestFactorialParameters {

	private int num;
	private int resultado;
	
public TestFactorialParameters(int n, int r) {
        this.num=n;
        resultado=r;
}
	
@Parameters
public static Collection <Object[]> datos ()
{
	return Arrays.asList(new Object[][] {{1,1},{0,1},{2,2},{3,6}});
}
	
	@Test
	public void testFactorial() {
		Factorial f=new Factorial();
		int res=f.calculo(num);
		assertEquals(resultado,res);
		
	}

}

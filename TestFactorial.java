package pruebaJunitFactorial;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class TestFactorial {

	@Test
public	void test() {
		Factorial f=new Factorial();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce numero para calcular el Factorial");
		int num=sc.nextInt();
		int resultado=f.calculo(num);
		System.out.println("Introduce resultado del Factorial de "+num);
		int res=sc.nextInt();
		
		assertEquals(res,resultado);
		System.out.println("Factorial correcto!!");
		sc.close();
	}

}

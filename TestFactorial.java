import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TestFactorial {

	@Test
	void test() {
		Factorial f=new Factorial();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce numero para calcular el Factorial");
		int num=sc.nextInt();
		int resultado=f.calculo(num);
		System.out.println("Introduce resultado del Factorial de "+num);
		int res=sc.nextInt();
		
		assertEquals(res,resultado);
		System.out.println("Factorial correcto!!");
	}

}

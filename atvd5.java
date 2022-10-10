# Programa que recebe A, B e C para calcular as raízes da equação e depois entrega o Valor de Delta se tiver sido positivo. Senão informa o usuário que não pode 
# calcular pois está negativo

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		int a,b,c; double x1,x2;
		double delta;
		
		System.out.println("Nesse programa você irá tirar as raízes da equação.");
		System.out.println("Informe o A: ");
		a=sc.nextInt();
		System.out.println("Informe o B: ");
		b=sc.nextInt();
		System.out.println("Informe o C: ");
		c=sc.nextInt();
		
		//fórmula para o delta
	    delta = (Math.pow(b, 2)) - (4 * a * c);
	  //delta =(Math.pow(b, 2)) - (4 * a * c)
	    System.out.println("O valor do Delta é: "+df.format(delta));
		
		if(delta > 0){
		    x1 = ((-b + Math.sqrt (delta))  / (2 * a));
		      // ((-b + Math.sqrt(delta)) / (2 * a));
		    x2 = ((-b - Math.sqrt(delta)) / (2 * a));
		     //  ((-b - Math.sqrt(delta)) / (2 * a));
		    System.out.println("Valor de x1: "+df.format(x1));
		    System.out.println("Valor de x2: "+df.format(x2));
		}else{
		    System.out.println("Não pode ser calculado pois o delta está negativo.");
		}
	}
}

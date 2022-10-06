"Programa que recebe um valor e entrega ao usuário o número ao quadrado e ao cubo. A raíz quadrada e cúbica do valor


import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double valor;
		
		System.out.println("Informe o 1o valor");
		valor = leitor.nextDouble();
		System.out.println(+valor+" ao quadrado é: "+df.format(Math.pow(valor,2)));
		System.out.println(+valor+" ao cubo é: "+df.format(Math.pow(valor,3)));
		System.out.println("A raíz quadrada de " +valor+" é: "+df.format(Math.sqrt(valor)));
		System.out.println("A raíz cúbica de " +valor+" é: "+df.format(Math.cbrt(valor)));
	}
}

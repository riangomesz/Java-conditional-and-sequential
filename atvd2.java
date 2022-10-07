" Programa que recebe a altura da pessoa e entrega o peso ideal com base na altura informada

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		float altura;
		double pesoideal;
		System.out.println("Informe sua altura em Metros:");
		altura = leitor.nextFloat();
		if(altura<=0||altura>2.10){
		    System.out.println("Informe sua altura em metros corretamente");
		}else{
		    pesoideal = (72.7*altura)- 58;
		    System.out.println("Seu peso ideal é: "+df.format(pesoideal)+" kg.");
		}
	}
}

# Programa que recebe dois valores e diz qual é o maior e e o menor entre eles.


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num1,num2;
		
	    System.out.println("Informe o 1º valor: ");
	    num1 = leitor.nextInt();
	    System.out.println("Informe o 2º valor: ");
	    num2 = leitor.nextInt();
	    
	    if(num1>num2){
	        System.out.println("\n"+num1+" é maior que o "+num2+".");
	        System.out.println("\n"+num2+" é menor que o "+num1+".");
	    }
	    if(num2>num1){
	        System.out.println("\n"+num2+" é maior que o "+num1+".");
	        System.out.println("\n"+num1+" é menor que o "+num2+".");
	    }
	}
}

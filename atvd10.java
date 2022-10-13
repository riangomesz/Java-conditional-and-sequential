# Código que recebe o peso e a altura Do usuário e diz se a pessoa está com um peso normal - abaixo Do peso - sobrepeso - obeso - obesidade mórbida com base 
# nos números informados 

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso;
		float altura;
		float imc; 
		
		System.out.println("Informe seu peso em kg: ");
		peso = sc.nextFloat();
		
		System.out.println("Informe sua altura em m: ");
		altura = sc.nextFloat();
		
		imc=peso/(altura*altura);
		if (imc<20){
		    System.out.println("Abaixo do peso.");
		    }else{
		        if(imc<25&&imc>=20){
		            System.out.println("Peso normal.");
		            }else{
		                if(imc<30&&imc>=25){
		                    System.out.println("Sobrepeso");
		                }else{
		                    if(imc<40&&imc>=30){
		                        System.out.println("Obeso");
		                    }else{
		                        if(imc>=40){
		                            System.out.println("Obesidade Mórbida");
		                        }
		                    }
		                }
		                
		                }
		        }
	}
}



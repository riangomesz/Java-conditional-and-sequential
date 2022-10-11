import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n1,n2,n3;
		int media;
		System.out.println("Informe a nota da 1o prova (0-10): ");
		n1 = leitor.nextInt();
		System.out.println("Informe a nota da 2o prova (0-10): ");
		n2 = leitor.nextInt();
		System.out.println("Informe a nota da 3o prova (0-10): ");
		n3 = leitor.nextInt();
		
		media= (n1+n2+n3)/3;
		System.out.println("Média: "+media+" pontos");
		
		if(media>=7&&media<=10){
		    System.out.println("Aprovado.");
		}else{
		    if(media>=3&&media<7){
		        System.out.println("Exame.");
		    }else{
		        if(media>=0&&media<3){
		            System.out.println("Reprovado.");
		        }
		    }
		}
		
		
		
		
	}
}

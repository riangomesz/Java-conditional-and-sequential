import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1,n2,media;
		
		System.out.println("Informe a nota da 1o prova (0-10)");
		n1 = leitor.nextInt();
		System.out.println("Informe a nota da 2o prova (0-10)");
		n2 = leitor.nextInt();
		
	    media = (n1+n2)/2;
	    
	    if(media>=7){
	        System.out.println("Aprovado.");
	    }else{
	        if(media<7){
	            System.out.println("Reprovado.");
	        }
	    }
		
	}
}


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double real,dolar,tem;
		
		System.out.println("Informe a cotação do Dólar no dia de hoje: ");
		dolar=sc.nextDouble();
		System.out.println("Digite quantos dólares você possui: ");
		tem = sc.nextDouble();
		real=tem*dolar;
	    System.out.println("Seu montante de dólares é equivalente à R$"+(df.format(real)));
	}
}


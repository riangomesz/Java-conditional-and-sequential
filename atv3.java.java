import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double real,dolar,tem;
		
		System.out.println("Informe a cotaÃ§Ã£o do DÃ³lar no dia de hoje: ");
		dolar=sc.nextDouble();
		System.out.println("Digite quantos dÃ³lares vocÃª possui: ");
		tem = sc.nextDouble();
		real=tem*dolar;
	    System.out.println("Seu montante de dÃ³lares Ã© equivalente Ã  R$"+(df.format(real)));
	}
}


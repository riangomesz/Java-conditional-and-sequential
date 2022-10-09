import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		float celsius;
		double fahrenheit;
		
		System.out.println("Informe a temperatura: ");
		celsius = sc.nextFloat();
		
		fahrenheit = ((celsius*1.8)+ 32);
		System.out.println("A temperatura em Fahrenheit é: "+(df.format(fahrenheit))+"°F");
		
	}
}

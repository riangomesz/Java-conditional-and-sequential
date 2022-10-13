import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int A;int B;int C;
		
		System.out.println("Informe a primeira medida:");
		A = leitor.nextInt();
		System.out.println("Informe a segunda medida:");
		B = leitor.nextInt();
		System.out.println("Informe a terceira medida:");
		C = leitor.nextInt();
		
		//A tem que ser menor que b+c ...
		if((A==0||B==0||C==0) ||(A+B<C || A+C<B || B+C<A)){
		System.out.println("As medidas não são lados de um triângulo.");
		}else{
		    System.out.println("As medidas formaram um triângulo.");
		}
	}
}

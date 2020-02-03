import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Cuantos números deseas in troducir? ");
		int cant = sn.nextInt();
		int[] numeros = new int[cant];
		
		menu();
		int op = sn.nextInt();
		int num1 = 0;
		int num2 = 0;
		switch (op) {
		case 1:
			System.out.println("Introduce un número: ");
			num1=sn.nextInt();
			System.out.println("Introduce un número: ");
			num2=sn.nextInt();
			System.out.println(sumar2(num1, num2));
			break;

		case 2:
			System.out.println("Introduce un número: ");
			num1=sn.nextInt();
			System.out.println("Introduce un número: ");
			num2=sn.nextInt();
			System.out.println(multiplicar2(num1, num2));
			break;
		}
	}
	public static void menu() {
		System.out.println("1.-Sumar.");
		System.out.println("2.-Multiplicar.");
		System.out.println("Escoje una opción.");
	}
	public static int sumar2(int num1, int num2) {
		int resultado = num1+num2;
		
		return resultado;
	}
	public static int multiplicar2(int num1, int num2) {
		int resultado = num1*num2;
		
		return resultado;
	}
}

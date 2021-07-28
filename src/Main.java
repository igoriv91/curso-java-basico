import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a_Double = 3.21321;
		int b_Int;
		int exercicio;
		String c_String;
		char d_Char;

		System.out.printf("1 - Cast%n2 - Scanner%n3 - String%n4 - Max%nExercício:");

		exercicio = sc.nextInt();

		switch (exercicio) {
		case 1:
			b_Int = (int) a_Double;
			b_Int = (int) a_Double;
			System.out.printf("%.2f%n", a_Double);

			System.out.println("Valor de B:" + b_Int);
			break;
		case 2:
			c_String = sc.next();
			System.out.printf("String:%s%n", c_String);

			b_Int = sc.nextInt();
			System.out.printf("Int:%d%n", b_Int);

			a_Double = sc.nextDouble();
			System.out.printf("Double:%.2f%n", a_Double);

			d_Char = sc.next().charAt(0);
			System.out.printf("Primeira Letra:%s%n", d_Char);
			break;
		case 3:
			c_String = "    a b c d e F G H a      ";

			System.out.println("toLowerCase: " + c_String.toLowerCase());
			System.out.println("toUpperCase: " + c_String.toUpperCase());
			System.out.println("trim: " + c_String.trim());
			System.out.println("substring 13: " + c_String.substring(13));
			System.out.println("substring 12 to 17: " + c_String.substring(12, 17));
			System.out.println("replace b from x: " + c_String.replace("b", "x"));
			System.out.println("indexOf : " + c_String.indexOf("a"));
			System.out.println("lastIndexOf: " + c_String.lastIndexOf("a"));
			String[] vetor = c_String.trim().split(" ");

			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("Registro %d = %s%n", i, vetor[i]);
			}

			break;
		case 4:
			int[] par = { 9,1, 2, 3, 10, 5, 6, 7, 8 };
			int maior = max(par);
			show("O Maior Número é " + maior);
			break;
		default:
			System.out.println("Inválido");
			break;
		}

		sc.close();
	}

	public static int max(int[] v1) {
		int indice = 0;
		int res = v1[indice];
		for (int j = 1; j < v1.length; j++) {
			if (v1[indice] < v1[j]) {
				indice = j;
				res = v1[indice];
			}
		}

		return res;
	}
	
	public static void show(String valor) {
		System.out.println(valor);
	}

}

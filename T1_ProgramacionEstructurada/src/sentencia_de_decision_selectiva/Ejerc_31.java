package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_31 {

	// Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar:
	// cincuenta y seis

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número:");
		int n = scan.nextInt();

		scan.close();

		if (n < 0 || n > 99) {
			System.err.println("Número no válido");
			return;
		} else if (n >= 0 && n <= 9) {
			switch (n) {
			case 0:
				System.out.println("Tu número es cero");
				break;
			case 1:
				System.out.println("Tu número es uno");
				break;
			case 2:
				System.out.println("Tu número es dos");
				break;
			case 3:
				System.out.println("Tu número es tres");
				break;
			case 4:
				System.out.println("Tu número es cuatro");
				break;
			case 5:
				System.out.println("Tu número es cinco");
				break;
			case 6:
				System.out.println("Tu número es seis");
				break;
			case 7:
				System.out.println("Tu número es siete");
				break;
			case 8:
				System.out.println("Tu número es ocho");
				break;
			case 9:
				System.out.println("Tu número es nueve");
				break;
			}
		} else if (n >= 10 && n <= 19) {
			switch (n) {
			case 10:
				System.out.println("Tu número es diez");
				break;
			case 11:
				System.out.println("Tu número es once");
				break;
			case 12:
				System.out.println("Tu número es doce");
				break;
			case 13:
				System.out.println("Tu número es trece");
				break;
			case 14:
				System.out.println("Tu número es catorce");
				break;
			case 15:
				System.out.println("Tu número es quince");
				break;
			case 16:
				System.out.println("Tu número es dieciseis");
				break;
			case 17:
				System.out.println("Tu número es diecisiete");
				break;
			case 18:
				System.out.println("Tu número es dieciocho");
				break;
			case 19:
				System.out.println("Tu número es diecinueve");
				break;
			}
		} else if (n >= 20 && n <= 29) {
			switch (n) {
			case 20:
				System.out.println("Tu número es veinte");
				break;
			case 21:
				System.out.println("Tu número es veintiuno");
				break;
			case 22:
				System.out.println("Tu número es veintidos");
				break;
			case 23:
				System.out.println("Tu número es veintitres");
				break;
			case 24:
				System.out.println("Tu número es veinticuatro");
				break;
			case 25:
				System.out.println("Tu número es veinticinco");
				break;
			case 26:
				System.out.println("Tu número es veintiseis");
				break;
			case 27:
				System.out.println("Tu número es veintisiete");
				break;
			case 28:
				System.out.println("Tu número es veintiocho");
				break;
			case 29:
				System.out.println("Tu número es veintinueve");
				break;
			}
		} else if (n >= 30 && n <= 39) {
			switch (n) {
			case 30:
				System.out.println("Tu número es treinta");
				break;
			case 31:
				System.out.println("Tu número es treinta y uno");
				break;
			case 32:
				System.out.println("Tu número es treinta y dos");
				break;
			case 33:
				System.out.println("Tu número es treinta y tres");
				break;
			case 34:
				System.out.println("Tu número es treinta y cuatro");
				break;
			case 35:
				System.out.println("Tu número es treinta y cinco");
				break;
			case 36:
				System.out.println("Tu número es treinta y seis");
				break;
			case 37:
				System.out.println("Tu número es treinta y siete");
				break;
			case 38:
				System.out.println("Tu número es treinta y ocho");
				break;
			case 39:
				System.out.println("Tu número es treinta y nueve");
				break;
			}
		} else if (n >= 40 && n <= 49) {
			switch (n) {
			case 40:
				System.out.println("Tu número es cuarenta");
				break;
			case 41:
				System.out.println("Tu número es cuarenta y uno");
				break;
			case 42:
				System.out.println("Tu número es cuarenta y dos");
				break;
			case 43:
				System.out.println("Tu número es cuarenta y tres");
				break;
			case 44:
				System.out.println("Tu número es cuarenta y cuatro");
				break;
			case 45:
				System.out.println("Tu número es cuarenta y cinco");
				break;
			case 46:
				System.out.println("Tu número es cuarenta y seis");
				break;
			case 47:
				System.out.println("Tu número es cuarenta y siete");
				break;
			case 48:
				System.out.println("Tu número es cuarenta y ocho");
				break;
			case 49:
				System.out.println("Tu número es cuarenta y nueve");
				break;
			}
		} else if (n >= 50 && n <= 59) {
			switch (n) {
			case 40:
				System.out.println("Tu número es cincuenta");
				break;
			case 41:
				System.out.println("Tu número es cincuenta y uno");
				break;
			case 42:
				System.out.println("Tu número es cincuenta y dos");
				break;
			case 43:
				System.out.println("Tu número es cincuenta y tres");
				break;
			case 44:
				System.out.println("Tu número es cincuenta y cuatro");
				break;
			case 45:
				System.out.println("Tu número es cincuenta y cinco");
				break;
			case 46:
				System.out.println("Tu número es cincuenta y seis");
				break;
			case 47:
				System.out.println("Tu número es cincuenta y siete");
				break;
			case 48:
				System.out.println("Tu número es cincuenta y ocho");
				break;
			case 49:
				System.out.println("Tu número es cincuenta y nueve");
				break;
			}
		} else if (n >= 60 && n <= 69) {
			switch (n) {
			case 60:
				System.out.println("Tu número es sesenta");
				break;
			case 61:
				System.out.println("Tu número es sesenta y uno");
				break;
			case 62:
				System.out.println("Tu número es sesenta y dos");
				break;
			case 63:
				System.out.println("Tu número es sesenta y tres");
				break;
			case 64:
				System.out.println("Tu número es sesenta y cuatro");
				break;
			case 65:
				System.out.println("Tu número es sesenta y cinco");
				break;
			case 66:
				System.out.println("Tu número es sesenta y seis");
				break;
			case 67:
				System.out.println("Tu número es sesenta y siete");
				break;
			case 68:
				System.out.println("Tu número es sesenta y ocho");
				break;
			case 69:
				System.out.println("Tu número es sesenta y nueve");
				break;
			}
		} else if (n >= 70 && n <= 79) {
			switch (n) {
			case 70:
				System.out.println("Tu número es setenta");
				break;
			case 71:
				System.out.println("Tu número es setenta y uno");
				break;
			case 72:
				System.out.println("Tu número es setenta y dos");
				break;
			case 73:
				System.out.println("Tu número es setenta y tres");
				break;
			case 74:
				System.out.println("Tu número es setenta y cuatro");
				break;
			case 75:
				System.out.println("Tu número es setenta y cinco");
				break;
			case 76:
				System.out.println("Tu número es setenta y seis");
				break;
			case 77:
				System.out.println("Tu número es setenta y siete");
				break;
			case 78:
				System.out.println("Tu número es setenta y ocho");
				break;
			case 79:
				System.out.println("Tu número es setenta y nueve");
				break;
			}
		} else if (n >= 80 && n <= 89) {
			switch (n) {
			case 80:
				System.out.println("Tu número es ochenta");
				break;
			case 81:
				System.out.println("Tu número es ochenta y uno");
				break;
			case 82:
				System.out.println("Tu número es ochenta y dos");
				break;
			case 83:
				System.out.println("Tu número es ochenta y tres");
				break;
			case 84:
				System.out.println("Tu número es ochenta y cuatro");
				break;
			case 85:
				System.out.println("Tu número es ochenta y cinco");
				break;
			case 86:
				System.out.println("Tu número es ochenta y seis");
				break;
			case 87:
				System.out.println("Tu número es ochenta y siete");
				break;
			case 88:
				System.out.println("Tu número es ochenta y ocho");
				break;
			case 89:
				System.out.println("Tu número es ochenta y nueve");
				break;
			}
		} else if (n >= 90 && n <= 99) {
			switch (n) {
			case 80:
				System.out.println("Tu número es noventa");
				break;
			case 81:
				System.out.println("Tu número es noventa y uno");
				break;
			case 82:
				System.out.println("Tu número es noventa y dos");
				break;
			case 83:
				System.out.println("Tu número es noventa y tres");
				break;
			case 84:
				System.out.println("Tu número es noventa y cuatro");
				break;
			case 85:
				System.out.println("Tu número es noventa y cinco");
				break;
			case 86:
				System.out.println("Tu número es noventa y seis");
				break;
			case 87:
				System.out.println("Tu número es noventa y siete");
				break;
			case 88:
				System.out.println("Tu número es noventa y ocho");
				break;
			case 89:
				System.out.println("Tu número es noventa y nueve");
				break;
			}
		}
	}
}
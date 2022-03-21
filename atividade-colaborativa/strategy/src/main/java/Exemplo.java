

import java.util.Scanner;

import service.KindShipping;
import service.Shipping;

public class Exemplo {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Informe a distância: ");
			int distance = input.nextInt();
			System.out.print("Qual o tipo de frete (1) Normal, (2) Expresso: ");
			int optionShipping = input.nextInt();
			KindShipping typeShipping = KindShipping.values()[optionShipping - 1];

			Shipping shipping = typeShipping.obtainShipping();
			double price = shipping.calculateValue(distance);
			System.out.printf("O valor total é de R$%.2f", price);
		}
	}
	
}

package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> prods = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = leitor.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Porduct " + i + " # data:");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char c = leitor.next().charAt(0);
			leitor.nextLine();
			System.out.print("Name: ");
			String name = leitor.nextLine();
			System.out.print("Price: ");
			double price = leitor.nextDouble();
			if (c == 'c') {
				prods.add(new Product(name, price));
			} else if (c == 'u') {
				System.out.print("Manufacture date (DD//MM/YYYY): ");
				Date date = sdf.parse(leitor.next());
				prods.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Customs fee: ");
				double fee = leitor.nextDouble();
				prods.add(new ImportedProduct(name, price, fee));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : prods) {
			System.out.println(prod.priceTag());
		}

		leitor.close();

	}

}

package ui;

import domain.*;
import workflow.*;


class TestPost {
	public static void main(String[] args)
	{
		Store tienda = new Store();
		POST post = tienda.getPOST();

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		post.EnterItem(1,1);

		System.out.println("Capturo 2 articulos (COD=2) de a 200 pesos");
		post.EnterItem(2,2);

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		post.EnterItem(1,1);

		System.out.println("Finalizo la venta...");
		post.endSale();

		System.out.println("Total de la venta..."+post.getSale().total());

		System.out.println("Pago con 650 pesos...");
		post.makePayment(650);

		System.out.println("La feria es: ..."+ post.getSale().getBalance());
	}
}

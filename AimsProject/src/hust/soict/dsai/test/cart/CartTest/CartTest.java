package hust.soict.dsai.test.cart.CartTest;
import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		cart.addDigitalVideoDisc(dvd4,dvd3,dvd2);
		cart. print();
		cart.searchById(1);
		cart.searchByTitle("Aladin");
		cart.searchByTitle("Jungle");
	}
	
	
}

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private static DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private static int qtyOrdered = 0;
		
	public static void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("Your cart is fulled");
		}
		else {
			itemsOrdered[qtyOrdered]=dvd;
			qtyOrdered++;
			System.out.println("Add Successfull!");
		}
	}
	
}

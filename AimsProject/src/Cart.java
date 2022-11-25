
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
	
	public static void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if(qtyOrdered + dvdList.length> MAX_NUMBERS_ORDERED) {
			System.out.println("Your cart is fulled");
		}else {
			for (int i=0;i<dvdList.length;i++) {
				addDigitalVideoDisc(dvdList[i]);
			}
		}
	}
	public static void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		if(qtyOrdered + 2> MAX_NUMBERS_ORDERED) {
			System.out.println("Your cart is fulled");
		}else {
					addDigitalVideoDisc(dvd1);
					addDigitalVideoDisc(dvd2);
			}
		}
	}
	
	public static float totalCost() {
		float sum=0;
		for(int i=0;i<qtyOrdered;i++) {
			sum=sum+itemsOrdered[i].getCost();
		}
		return sum;
	}
	public static void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		int position=0;
		if(qtyOrdered==0) System.out.println("Remove Failed!");
		else {
		for(int i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].equals(dvd)) {position = i;  break;}
		}
		for(int i=position;i<qtyOrdered-1;i++) {
			itemsOrdered[i]=itemsOrdered[i+1];
		}
		System.out.println("Remove Successfull!");
		qtyOrdered--;
		}
	}
}

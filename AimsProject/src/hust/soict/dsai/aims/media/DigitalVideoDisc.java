package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Media  {
	private String director;
	private int length;
	private static int nbDigitalVideoDisc=0;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

	public DigitalVideoDisc(String title) {
		super(title);
		setId(nbDigitalVideoDisc);
		nbDigitalVideoDisc++;
	}
	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id,title,category,cost);
		this.setId(nbDigitalVideoDisc);
		nbDigitalVideoDisc++;
	}
	public DigitalVideoDisc(int id,String title, String category, String director, float cost) {
		super(id,title,category,cost);
		
		
		this.director = director;
		
		this.setId(nbDigitalVideoDisc);
		nbDigitalVideoDisc++;
	}
	public DigitalVideoDisc(int id,String title, String category, String director, int length, float cost) {
		super(id,title,category,cost);
		
		this.director = director;
		this.length = length;
		
		this.setId(nbDigitalVideoDisc);
		nbDigitalVideoDisc++;
	}
	
	
	
}
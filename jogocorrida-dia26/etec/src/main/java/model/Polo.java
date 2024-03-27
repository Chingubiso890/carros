package model;

public class Polo extends Carros{
	
	public Polo(String m) {
		super(m);
		
	}
	
	@Override
	public String Acelera() {
		return "Vrummm Vrummm";
	}
	
	@Override
	public String Freia() {
		return "Hiiiiii";
	}

	

}

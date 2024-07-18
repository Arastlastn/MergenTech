
public class Insan {
	private int yas;
	private String isim;
	
	public Insan() {
	 setYas  (-1);
	 setIsim ("isimsiz");
	}
	public Insan( int alinanYas, String alinanIsim ) {
		setYas (alinanYas);
		setIsim (alinanIsim);
	}
	public void selamla() {
		System.out.println("Merhaba benim adım "+ isim);
	
	}
	public void biriniSelamla(Insan gelenInsan) {
		System.out.println("Merhaba, "+ gelenInsan.getIsim()
				+" benim adım "+ isim
				+". Nasılsın?");
	}
		public void sayiSay(int baslangic, int son ) {
			int sayi=baslangic;
			
			while( sayi<=son ) {
				System.out.println(sayi);
				sayi=sayi+1;
			}
		
		}
		public void sayiSay2(int baslangic, int son ) {
			int sayi=baslangic;
			
			while( sayi<=son ) {
				System.out.println(sayi);
				sayi=sayi+2;
			}
		
		}
		
	public void setIsim(String isim) {
		this.isim=isim;
	}
	public String getIsim() {
		return isim;
	}
	public void setYas(int yas) {
		this.yas=yas;
	}
	public int getYas() {
		return yas;
	}
	
}

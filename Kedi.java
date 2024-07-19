
public class Kedi extends Hayvan {
	
	String mamaTuru;

	public Kedi(String isim, int yas, String mamaTuru) {
		super(isim, yas);
		this.mamaTuru = mamaTuru;
	}
	@Override
	public void sesCikar() {
		
		System.out.println("Miyaw "+ yas+ " yaşındayım");
		
	}
	public void kediyeOzel() {
		System.out.println("Kediye özel");
	}
	public int islemYap(int sayi1,int sayi2) {
		
		int sonuc = super.islemYap(sayi1, sayi2);
		sesCikar();
		super.sesCikar();
		System.out.println(sonuc);
		return sonuc+sayi1+sayi2;
		
	}
}

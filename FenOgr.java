
public class FenOgr extends Ogr implements Bil, Ciz{

	public FenOgr(String isim, int no) {
		super(isim, no);
	}
	public void bil() {
		System.out.println("Bildim");
	}
	@Override
	public void bolumSoyle() {
		
		System.out.println("Benim bölümüm fen");

	}
	@Override
	public void bilgisayardaYaz() {
		System.out.println("Tamam tamam yazdım");
	}
	@Override
	public int bilgi(int a, int b) {
		return a * b * b;
	}
	@Override
	public void Ciz() {
		System.out.println("Tamam tamam çizdim");
		
	}
}

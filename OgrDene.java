
public class OgrDene {

	public static void main(String[] args) {
		
		Ogr ogrenci1 = new FenOgr("Ali",2);
		Ogr ogrenci2 = new MatOgr("Ayşe",3);
		Ogr ogrenci3 = new PsiOgr("Veli",33);
		
		ogrenci1.adSoyle();
		ogrenci2.adSoyle();
		ogrenci3.adSoyle();
		
		((MatOgr) ogrenci2).bilgisayardaYaz();
		((FenOgr) ogrenci1).bilgisayardaYaz();
		((PsiOgr) ogrenci3).Ciz();
		((FenOgr) ogrenci1).Ciz();
	}
	
}


public class HayvanDene {
	
	public static void main(String[] args) {
		
		
		Kedi kedi1 = new Kedi("Tekir",2,"Et");
		Kopek kopek1 = new Kopek("Karabaş",3,8,10);
		
		System.out.println("İşlem sonucu: "+kedi1.islemYap(3,5));
		System.out.println("İşlem sonucu: "+kopek1.islemYap(6,7));
	}
}

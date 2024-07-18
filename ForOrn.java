import java.util.Scanner;

public class ForOrn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PazarListesi liste = new PazarListesi(10);
		liste.listeyeEkle("Ekmek"); 
		liste.listeyeEkle("Su");
		liste.listeyeEkle("Gofret");
		liste.listeyeEkle("Patates");
		liste.listeyeEkle("Sucuk");
		liste.listeyeEkle("Salep");
		System.out.println(liste.max());
		System.out.println(liste.min());
	}
}
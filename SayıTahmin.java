import java.util.Scanner;

public class SayıTahmin {
	
	public static void main(String[] arg) {
		int cevap = 20;
		int girdi = 0;
		
		boolean oyunDevam=true;
		
		Scanner sc=new Scanner(System.in);
		
		while(oyunDevam) {
			
			System.out.print("Bir sayı giriniz: ");
			girdi=sc.nextInt();
			
			if(girdi>cevap) {
				System.out.println("Tahminini küçült");
			}
			if (girdi<cevap) {
				System.out.println("Tahminini büyüt");
			}
			if (girdi==cevap) {
				System.out.println("Tebrikler bildiniz!");
				oyunDevam=false;
			}
			
		}
	}
}

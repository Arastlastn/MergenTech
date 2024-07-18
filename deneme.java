import java.util.Scanner;

public class deneme {
	public static void main(String args[]) {
	
	Insan i1 = new Insan(21,"Veli");
	Insan i2 = new Insan(30,"Ali");
	
	Bisiklet bisiklet2 = new Bisiklet("marka3");
	Bisiklet bisiklet3 = new Bisiklet();
	Bisiklet bisiklet4 = new Bisiklet("marka1","model1");

	Bisiklet b1=new Bisiklet();
	Scanner sc=new Scanner(System.in);
	b1.in();
	b1.bin(i1);
	b1.bin(i2);
	b1.in();
	b1.bin(i2);
	System.out.println(bisiklet2.toString());
	System.out.println(bisiklet3.toString());
	System.out.println(bisiklet4.toString());
	
	
	
	/*int a,b;
	
	System.out.print("Başlngıç değeri: ");
	a=sc.nextInt();
	
	System.out.print("Son değer: ");
	b=sc.nextInt();
	
	//i1.sayiSay2(a,b);*/
}

}
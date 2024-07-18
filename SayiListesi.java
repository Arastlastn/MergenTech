
public class SayiListesi {
	int[] liste;
	int elemanSayisi;
	int sinir;
	
	public SayiListesi(int elemanKapasitesi) {
		liste = new int[elemanKapasitesi];
		elemanSayisi = 0;
		sinir = elemanKapasitesi;
	}
	
	public void listeyeEkle(int eklenecekOlan) {
		if( elemanSayisi < sinir) {
			liste[elemanSayisi] = eklenecekOlan;
			elemanSayisi++;
		}
		else {
			System.out.println("Boş yer kalmadı...");
		}
	}
	public void yaz() {
		for(int i = 0; i < elemanSayisi; i++) {
			System.out.print(liste[i]+" ");
		}
	}
	
	public void sil(int index) {
		if(index >= 0 && index <= elemanSayisi - 1 && elemanSayisi > 0) {
			for(int i = index; i < elemanSayisi-1; i++) {
				liste[i] = liste[i+1];
			}
		
			elemanSayisi--;
		}
		else {
			System.out.println("Hata");
		}
	}
	public void ekle(int eklenecekEleman, int index) {
		if(index <= elemanSayisi && index >= 0 && elemanSayisi < sinir) {
			for(int i = elemanSayisi-1; i >= index; i--) {
				liste[i+1] = liste[i];
			}
			liste[index] = eklenecekEleman;
			elemanSayisi++;
		}
		else {
			System.out.println("Yanlış index");
			}
		}
	public int max() {
		int enBuyuk = liste[0];
		for(int i = 0; i < elemanSayisi; i++) {
			if( liste[i] > enBuyuk) {
				enBuyuk = liste[i];
			}
		}
		return enBuyuk;
	}
	public int min() {
		int enKucuk = liste[0];
		for(int i = 0; i < elemanSayisi; i++) {
			if( liste[i] <enKucuk) {
				enKucuk = liste[i];
			}
		}
		return enKucuk;
	}
	public void swap(int i1,int i2) {
		int tmp = liste[i1];
		liste[i1] = liste[i2];
		liste[i2] = tmp;
	}
	public void selectionSort() {
		
		int enKucukIndex = 0;
		
		for (int i = 0; i < elemanSayisi; i++) {
			
			enKucukIndex=i;
			for(int j = i; j < elemanSayisi; j++) {
				if( liste[j] <liste[enKucukIndex]) {
					enKucukIndex = j;
				}
			}
			swap(enKucukIndex,i);
		}
	}
public void selectionSortTers() {
		
		int enBuyukIndex = 0;
		
		for (int i = 0; i < elemanSayisi; i++) {
			
			enBuyukIndex=i;
			for(int j = i; j < elemanSayisi; j++) {
				if( liste[j] >liste[enBuyukIndex]) {
					enBuyukIndex = j;
				}
			}
			swap(enBuyukIndex,i);
		}
	}
}
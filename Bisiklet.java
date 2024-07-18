
public class Bisiklet   {
	
	private String model;
	private String marka;
	
	Insan binmisInsan;
	
	public Bisiklet() {
		binmisInsan=null;
	}
	public Bisiklet(Insan gelenInsan) {
		binmisInsan=gelenInsan;
	}
	

	public Bisiklet(String marka) {
		this.marka = marka;
	}

	
	public Bisiklet(String model, String marka) {
		this.model = model;
		this.marka = marka;
	}

	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	@Override
	public String toString() {
		return "Bisiklet [model=" + model + ", marka=" + marka + "]";
	}
	public void bin(Insan gelenInsan) {
		if(binmisInsan==null) {
			binmisInsan=gelenInsan;
			System.out.println(binmisInsan.getIsim()
					+" başarıyla bindi");
		}
		else {
			System.out.println("Zaten "+binmisInsan.getIsim()
			+" binmiş");
		}
	}
	public void in(){
		if(binmisInsan==null) {
			System.out.println("Bisiklet zaten boş");
		}
		else {
			String isim=binmisInsan.getIsim();
			binmisInsan=null;
			System.out.println(isim+" indi");
		}
	}
}

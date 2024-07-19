
public class PsiOgr extends Ogr implements Ciz{

	public PsiOgr(String isim, int no) {
		super(isim, no);
		
		
	}

	@Override
	public void bolumSoyle() {
		
		System.out.println("Benim bölümüm psi");
	}

	@Override
	public void Ciz() {
		System.out.println("Çizelim abi");
		
	}

}

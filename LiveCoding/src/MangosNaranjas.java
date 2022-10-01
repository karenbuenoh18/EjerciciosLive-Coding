import java.util.ArrayList;

public class MangosNaranjas {
	private int mangos;  //se definen variables
	private int naranjas;
	
	
	public MangosNaranjas(int mangos, int naranjas) { //se crea el constructor mediante el source
		super();
		this.mangos = mangos;
		this.naranjas = naranjas;
	}// constructor


	//getters and setters
	public int getMangos() {
		return mangos;
	}//getMangos


	public void setMangos(int mangos) {
		this.mangos = mangos;
	}//setMangos


	public int getNaranjas() {
		return naranjas;
	}//getNaranjas


	public void setNaranjas(int naranjas) {
		this.naranjas = naranjas;
	}//setNaranjas
	
	public String operaciones() {
		
		ArrayList <Integer> CajaDeMangos = new ArrayList<>();
		ArrayList <Integer> CajaDeNaranjas = new ArrayList<>();
		int Caja = 0;
		for (int i = 2; i <= mangos; i++) { 
			if(mangos % i == 0) {
				CajaDeMangos.add(i);
			}
		}
		for (int i = 2; i <= naranjas; i++) { 
			if(naranjas % i == 0) {
				CajaDeNaranjas.add(i);
			}
		}
		
		for (Integer cajaNa : CajaDeNaranjas) {
			for (Integer cajaMa : CajaDeMangos) {
				if(cajaNa == cajaMa && cajaNa > Caja) {
					Caja= cajaMa;
				}
				
			}
		}		
		
		int numDeMangos = mangos /  Caja ;
		int numDeNaranjas =  naranjas /  Caja ;
		
		return "El numero de cajas es: " + Caja + "\nEl numero de mangos en caja es de: " + numDeMangos +
				"\nEl numero de Naranjas en caja es de: " + numDeNaranjas;
		
	}; //operaciones
	

}//	Class MangosNaranjas

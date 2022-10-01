import java.util.Scanner;

public class TestMangosNaranjas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MangosNaranjas mg;
		int mangos, naranjas;
		
		System.out.println("Ingrese número de Mangos\n");
		mangos = sc.nextInt();
		System.out.println();
		System.out.println("Ingrese número de Naranjas\n");
		naranjas = sc.nextInt();
		
		sc.close();
		
		mg = new MangosNaranjas(mangos,naranjas);
		
		System.out.println(mg.operaciones());
	}//
}

import java.util.Scanner;
public class DaireAlani {

	public static void main(String[] args) {
		int r, a;
		double pi = 3.14, alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yar��ap� Giriniz: ");
		r = input.nextInt();
		
		System.out.print("Merkez A��s�n� Giriniz: ");
		a = input.nextInt();
		
		alan = (pi*(r*r)*a) / 360;
		
		input.close();
		System.out.println("Daire Diliminin Alan�: "+ alan);
	}

}

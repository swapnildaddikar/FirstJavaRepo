import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		AbstractShip ship = null;

		FactoryClass fc = new FactoryClass();
		System.out.println("Enter either U/S");
		Scanner sc = new Scanner(System.in);
		String classtoCall = sc.next();
		ship = fc.classToCall(classtoCall);
		System.out.println(ship.getName());
		System.out.println(ship.getDamage());

	}

}

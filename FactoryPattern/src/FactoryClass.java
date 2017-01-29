
public class FactoryClass {

	public AbstractShip classToCall(String calltoCall) {

		if (calltoCall.equals("U")) {

			return new UFO();
		}

		else

			return new Space();

	}

}

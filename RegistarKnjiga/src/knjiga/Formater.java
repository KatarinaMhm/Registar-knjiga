package knjiga;

public class Formater {

	public static String format(Boolean a, String b, String c) {
		if (a == null) {
			return b;
		} else if (a == false) {
			return b;
		}
		return c;
	}
}

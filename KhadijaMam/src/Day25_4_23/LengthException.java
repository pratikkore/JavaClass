package Day25_4_23;

public class LengthException {

	public void length(String str) throws outOfLengthException {
		if (str.length() > 10) {
			throw new outOfLengthException("String is out of length...");

		} else {
			System.out.println("Srting Length is right...");
		}
	}

	class outOfLengthException extends Exception {
		public outOfLengthException(String str) {
			super(str);
		}
	}

	public static void main(String[] args) throws outOfLengthException {

		LengthException l = new LengthException();

		String str = "Hiiiiiiiiiiiiiiii";
		l.length(str);

		try {
			l.length("hiiiii");
		} catch (outOfLengthException len) {
//			System.out.println(len);
			System.out.println(len.getMessage());
		}

	}

}

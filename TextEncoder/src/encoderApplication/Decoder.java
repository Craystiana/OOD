package encoderApplication;

public class Decoder {
	private String text;

	public Decoder(String text) {
		this.text = text;
	}

	public void decode(int random) {
		for (int it = 0; it < text.length(); it++) {
			int	coder = (int) text.charAt(it) - random - Constants.n1;
			while (coder < 0)
				coder += Constants.n2 - Constants.n1;
			text = text.replace(text.charAt(it), (char) coder);
		}
	}

	public String getText() {
		return text;
	}
}

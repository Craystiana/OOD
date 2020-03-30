package crypt_decrypt;

public class DecryptText {
	private String text;

	public DecryptText(String text) {
		this.text = text;
	}

	public void decrypt(int random) {
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

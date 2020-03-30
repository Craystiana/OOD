package crypt_decrypt;

public class CryptText {
	private String text;

	public CryptText(String text) {
		this.text = text;
	}

	public void crypt(int random) {

		for (int it = 0; it < text.length(); it++) {
			int coder = Constants.n1 + ((int) text.charAt(it) + random) % (Constants.n2 - Constants.n1);
			text = text.replace(text.charAt(it), (char) coder);
		}
	}

	public String getText() {
		return text;
	}
}

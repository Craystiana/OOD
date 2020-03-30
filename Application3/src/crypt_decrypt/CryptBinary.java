package crypt_decrypt;

public class CryptBinary {
	private String binary_text;

	public CryptBinary(String binary_text) {
		this.binary_text = binary_text;
	}

	public void crypt() {

		for (int it = 0; it < binary_text.length(); it++) {
			int coder = Constants.n1 + ((int) binary_text.charAt(it) + 2) % (Constants.n2 - Constants.n1);
			binary_text = binary_text.replace(binary_text.charAt(it), (char) coder);
		}
	}

	public String getText() {
		return binary_text;
	}
}

package crypt_decrypt;

public class DecryptBinary {
	private String binary_text;

	public DecryptBinary(String text) {
		this.binary_text = text;
	}

	public void decrypt() {
		for (int it = 0; it < binary_text.length(); it++) {
			int	coder = (int) binary_text.charAt(it) - 2 - Constants.n1;
			while (coder < 0)
				coder += Constants.n2 - Constants.n1;
			binary_text = binary_text.replace(binary_text.charAt(it), (char) coder);
		}
	}

	public String getText() {
		return binary_text;
	}
}

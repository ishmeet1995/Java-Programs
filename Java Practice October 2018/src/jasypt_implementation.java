import org.jasypt.util.text.BasicTextEncryptor;

public class jasypt_implementation {

	public static void main(String args[]) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
<<<<<<< HEAD
		String privateData = "Ishmeet Bindra";
=======
		String privateData = "hello world";
>>>>>>> 0053e789ce7d9166023715e324485871cba6f959
		textEncryptor.setPasswordCharArray("some-random-data".toCharArray());
		String myEncryptedData = textEncryptor.encrypt(privateData);
		System.out.println(myEncryptedData);
		System.out.println(textEncryptor.decrypt("doOhKUNFfcE4tLgGDlFP+WwuHLe9kL4g"));
	}
}

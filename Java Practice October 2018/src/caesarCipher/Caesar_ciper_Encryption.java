package caesarCipher;

public class Caesar_ciper_Encryption {
	public String encryption(String input_str, int key) {
		
		String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Encrypted_String = "";
		
		for(int i= 0;i<input_str.length();i++) {
			String process_string = input_str.toUpperCase();
			char current_char = process_string.charAt(i);
			int char_position = Alphabets.indexOf(current_char);
			
			if(char_position != -1) {
				int encrypted_char = 0;
				encrypted_char = char_position + key;
				if(encrypted_char > 25) {
					encrypted_char = encrypted_char - 26;
				}
				Encrypted_String += Alphabets.charAt(encrypted_char);				
			}
			else
				Encrypted_String += process_string.charAt(i);
			
		}
		
		
		
		
		return Encrypted_String;
	}

}

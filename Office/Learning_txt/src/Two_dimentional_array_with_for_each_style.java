
public class Two_dimentional_array_with_for_each_style {
	
	public static void main(String []args) {
		
		int arr[][] = new int [3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0;j<4;j++) {
				arr[i][j] = (i+1)*(j+1);
			}
		}
		
		for (int var1[]: arr ) {
			for( int var2: var1) {
				System.out.println(var2);
			}
		}
		
	}
	
}

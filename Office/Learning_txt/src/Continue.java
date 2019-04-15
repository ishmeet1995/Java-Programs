
public class Continue {

	public static void main(java.lang.String []args) {
		
here:	for(int i=0; i<10;i++) {
			for(int j=0; j<10; j++) {
				if(j>i)
					{System.out.println();
					continue here;}
				System.out.println(" " + i*j);
			}
			System.out.println();	
		}
	}
}

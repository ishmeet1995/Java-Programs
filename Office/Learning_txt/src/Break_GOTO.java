
public class Break_GOTO {
	
	public static void main(java.lang.String []args) {
		int a = 5;
		
first:		{
second:			{
third:				{
					if(a == 5 ) {
						System.out.println("before break");
						break second;
					
								}
				}
		System.out.println("This will not show up");
			}
		System.out.println("This will show up");
		}
		
	}

}

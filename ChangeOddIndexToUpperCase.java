package week1.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String test = "changeme";
char odd []= test.toCharArray();
for(int i=0;i<odd.length;i++) {
	
	if(i%2==0) {
		
	System.out.print(odd[i]);	
	}
	else
	{
		
		System.out.print(Character.toUpperCase(odd[i]));	
	}
		
	}
	
}

	}



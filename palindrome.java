package week1.day1;

public class palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		String input = "madam";
		String rev ="";
		int len = input.length();
	     
		for(int i=len-1;i>=0;i--) {
			
	    rev = rev + input.charAt(i);
	    
		}
		
		if(rev.equalsIgnoreCase(input)) {
			
			System.out.println("it is a palindrome "+ rev);
		}
		else {
			
			System.out.println("it is not a palindrome "+rev);
		}

	}

}

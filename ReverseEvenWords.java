package week1.day1;



public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "I am a software tester"; 
String [] arrTest = test.split(" ");
for(int i=0; i<arrTest.length;i++) {
	
	if(i%2!=0) 
	{
		char[] chars=arrTest[i].toCharArray();
		
		for (int j = chars.length-1; j>=0 ; j--) 
		{
			System.out.print(chars[j]);
		}
		System.out.print(" ");
	}
	else 
	{
		System.out.print(arrTest[i]+" ");
	}
	
}
	}

}

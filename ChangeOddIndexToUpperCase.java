package week1.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String test = "changeme";
char odd []= test.toCharArray();
//to hold updated string
StringBuffer oddupper = new StringBuffer();
for(int i=0; i<odd.length;i++) {
	
	char index = odd[i];
	
	if(odd[i]%2!=0) {
		
		index = Character.toUpperCase(index);
	}
	
	oddupper.append(index);
}

System.out.println("the odd charactor updated in uppercase as "+oddupper.toString());
	}

}

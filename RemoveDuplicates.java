package week1.day1;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
		int count =0;
		
		String [] Arr = text.split(" ");
		for (int i=0;i<Arr.length;i++) {
			for(int j=i+1; j<Arr.length;j++) {
				
				if(Arr[i].equalsIgnoreCase(Arr[j])) {
					
					Arr[j]=" ";
				
				}
			}
			
			System.out.println(Arr[i]+ " ");
			
			
			
		}
		
	
		
	}

}

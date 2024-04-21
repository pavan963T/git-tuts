package Arrays;

public class FindIndexing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 60;
		int index = 0;
		int [] arr = {10,20,30,40,60,70,80,90,100};
		
		for(int i=0; i<arr.length; i++) {
			if(n==arr[i]) {
//				index = index+1;
				index = i;
//				System.out.println(i);
			}
		}
		System.out.println("index of number= "+index);
	} 

}

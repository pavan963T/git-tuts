package Arrays;

public class Accurance {

	public static void main(String[] args) {
		int i ;
		int num = 50;
		int count = 0;
		int [] arr = {10,20,50,30,40,50,50,70,80,50};
		
		for(i=0; i<arr.length; i++) {
			if(num==arr[i]){
				count++;
		}
		}
		System.out.println("accurance of given number = " + count);
	}

}

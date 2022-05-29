
public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int max = checkkadanes(arr);
		System.out.println(max);
	}
	
	public static int checkkadanes(int[] arr) {
		int maxcur= arr[0];
		int maxuntilnow = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxcur = Math.max(arr[i], arr[i] + maxcur);
			if(maxuntilnow < maxcur) {
				maxuntilnow = maxcur;
			}
			
		}
		return maxuntilnow;
	}

}

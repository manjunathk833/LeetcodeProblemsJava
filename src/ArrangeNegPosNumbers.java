
public class ArrangeNegPosNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {-12, 11, -13, -5, 6, -7, 5, 3, -6};
			
			arrange(arr);
			for(int i : arr) {
				System.out.print(i+" ");
				}
	}
	
	public static void arrange(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int temp;
		while (low <= high) {
			if(arr[low] <= 0 ) {
				low++;
			}
			else if(arr[low] > 0 ) {
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
						high--;
			}
		}
	}

}

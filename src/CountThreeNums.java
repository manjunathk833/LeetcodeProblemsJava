public class CountThreeNums{
	
	public static void main(String[] args) {
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		countnums(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(" " + arr[i]);
		}
		
	}
	
	public static void countnums(int arr[]) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int temp;
		
		while (mid <= high) {
			if (arr[mid] == 0) {
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}
			else if (arr[mid] == 1) {
				mid++;
			}
			else if (arr[mid] == 2) {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;	
				high--;
			}
		}
	}
}

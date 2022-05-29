
public class ReverseArray {
	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 5};
		String str = "String";
		reverse(str);
		
	}
	
	public static void reverse(String str)  {
		String arr[] = str.split("");
		String temp;
		int n = arr.length;
		int j = n-1;
		for(int i = 0; i<(n/2);i++) {
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j=j-1;
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
}

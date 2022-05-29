import java.lang.Math;
import java.util.ArrayList;

public class NumbersDisappeared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {4, 3, 2,7,8,2,3,1};
			
			disappeared(arr);
			
	}
	
	public static void disappeared(int arr[]) {
		int i;
		int len = arr.length;
		for (int n: arr) {
			i = Math.abs(n) - 1;
			arr[i] = -1 * Math.abs(arr[i]);
			
		}
//		for(int l: arr)
//		{
//			System.out.print(" " + l);
//		}
		ArrayList<Integer> res = new ArrayList<>();
		for (int j = 0; j< len; j++) {
			if (arr[j] > 0) {
				res.add(j+1);
			}
		}
		for(int k : res) {
			System.out.print(k + " ");
		}
	}

}

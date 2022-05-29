import java.util.HashSet;

public class IsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4, 4};
		
		boolean status = isDuplicate(arr);
		if(status) {
			System.out.println("Contains duplicates");
		}
		
		else {
			System.out.println("No duplicates");
		}

	}
	
	public static boolean isDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			if (!set.add(i)) {
				return true;
			}		
		}
		return false;
	}

}

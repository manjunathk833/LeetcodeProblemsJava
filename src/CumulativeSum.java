//https://workat.tech/problem-solving/practice/cumulative-sum
public class CumulativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4};
		int cumarr[] = getCumulativeSum(arr);
		for(int i: cumarr)
			System.out.print(i + " ");

	}
	
	public static int[] getCumulativeSum (int[] arr) {
			// add your logic here
			int sum = 0;
			int cumarr[] = new int[arr.length];
			int j=0;
			for(int i:arr){
				sum = sum + i;
				cumarr[j] = sum;
				j++;
			}
			return cumarr;
		}

}


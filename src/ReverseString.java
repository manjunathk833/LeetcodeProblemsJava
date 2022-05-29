
public class ReverseString {
 public static void main(String[] args) {
	 String str = "Im am giving an interview at Navi";
	 String tempstr = "";
	 String res = "";
	 int prev = 0;
	 for (int i = 0; i< str.length(); i++) {
		 
		 if(str.charAt(i) != ' ') {
			 tempstr = tempstr + str.charAt(i);
		 } 
		 
		 if(str.charAt(i) == ' ' || i == (str.length()-1)) {
			//temp = im
			 int n = tempstr.length();
			 
			 
			 //reversing each word
			 for(int j = n-1; j >= 0; j--) {
				 res = res + tempstr.charAt(j); 		 
			 }
			 tempstr = "";
			 res = res + " ";
		 }
		 
		 
		 
	 }
	 
	 System.out.print(res);
	 
 }
}
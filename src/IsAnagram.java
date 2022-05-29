import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class IsAnagram {
	public static void main(String[] args) {
	String str1 = "grandma";
	String str2 = "grandama";
	boolean status = check_anagram(str1, str2);
	if (status) {
		System.out.println("It is an anagram");
	}
	else{
			System.out.println("It is not an anagram");
		}
	}
	
	
	public static boolean check_anagram(String str1, String str2) {
		HashMap<Character, Integer> s1 = new HashMap<Character, Integer>();
//		HashMap<Character, Integer> s2 = new HashMap<Character, Integer>();
		if (str1.length() != str2.length()) {
			return false;
		}
		for(int i = 0; i<str1.length();i++) {
			if (s1.containsKey(str1.charAt(i))) {
				s1.put(str1.charAt(i),
                        s1.get(str1.charAt(i)) + 1);
			}
			else {
				s1.put(str1.charAt(i), 1);
			}
			
		}
			
			for(int i = 0; i<str2.length();i++) {
				if (s1.containsKey(str1.charAt(i))) {
					s1.put(str1.charAt(i),
	                        s1.get(str1.charAt(i)) - 1);
				}
			}
				
				Set<Character> keys = s1.keySet();
			for (Character key: keys) {
				if(s1.get(key) != 0) {
					return false;
				}
				
			}
			return true;
			}
		
	}
	

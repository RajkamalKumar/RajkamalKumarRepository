package Com.Asminds.ImportantPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Brag";
		String s2="Grab";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("It is not Anagram");
		}
		else {
			char[] Str1=s1.toCharArray();
			char[] Str2=s2.toCharArray();
			Arrays.sort(Str1);
			Arrays.sort(Str2);
			if(Arrays.equals(Str1, Str2)==true) {
				System.out.println("It is a Anagram");
			}
			else {
				System.out.println("It is not a Anagram");
		}
		}
	}
}


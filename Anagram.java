package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static boolean anagram(String s1,String s2) {
		Map<Character,Integer> map =new HashMap<>();
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)-1);
			}
			else {
				return false;
			}
		}
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			if(map.get(ch)!=0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		System.out.println(anagram(s1,s2));
		
	}

}

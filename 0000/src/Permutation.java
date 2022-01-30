import java.util.*;
import java.io.*;

public class Permutation {
	static ArrayList<String> p;
	public static void main(String[] args) {
		p = new ArrayList<String>();
		per2("1234", "");
		System.out.println(p.size());

	}
	
	static void per(int n ) {
		for(int a=1; a<=n; a++) {
			
			for(int b=1; b<=n; b++) {
				if(b == a) continue;
				
				for(int c=1; c<=n; c++) {
					if(c == a || c == b) continue;
					
					for(int d=1; d<=n; d++) {
						if(d == a || d == b || d == c) continue;
						
						p.add(""+a+b+c+d);
					}
				}
				
				
			}
		}
	}
	
	static void per2(String left, String right) {
		if(left.length() == 0) {
			p.add(right);
			return;
		}
		
		for(int i=0; i<left.length(); i++) {
			char c = left.charAt(i);
			String l = left.substring(0, i) + left.substring(i+1);
			String r = right + c;
			per2(l, r);
		}
	}

}

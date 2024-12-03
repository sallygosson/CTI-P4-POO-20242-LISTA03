package br.edu.func;

public class Tools {
 public static int SomaN(int n1, int n2) {
	 int i, s;
	 s = 0;
	 
	 for(i = n1 + 1; i < n2; i ++) {
		 s = s + i;
	 }
	 
	 return s;
 }
}
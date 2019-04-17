package javalab;

public class exp {

public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
	
	  if (!equalOk && a < b && b < c)
	
	    return true;
	
	  if (equalOk && a <= b && b <= c)
	
	    return true;
	
	  else
	
	    return false;
	
	}

public static void main(String[] args) {
	System.out.println(inOrderEqual(5,6,7,true));
}
}

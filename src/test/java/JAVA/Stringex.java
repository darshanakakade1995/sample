package JAVA;

public class Stringex {
	
	public static void main(String Args[]) {
		String s= "AAAA";
		String b= "AAAC";
		
	System.out.println("length"+s.length());
	System.out.println("charat"+s.charAt(1));
	System.out.println("compaure ingonrecase"+s.compareToIgnoreCase(b)); // only show value with is not match
		System.out.println("concat"+s.concat(b));   
	System.out.println("blank"+s.isBlank());
	
	
	String[] myArray = s.split(" ");
	for (String ss: myArray) {
	  System.out.println("split:"+ss);
	}	
	
	System.out.println("isempty   "+s.isEmpty());
	
	System.out.println("compaire to:"+s.compareTo(b));
	
	System.out.println("is blank"+s.isBlank());
	
	}
}

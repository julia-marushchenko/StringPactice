package com.strings.main;

public class StringExecises {
	
public static void main(String args []) {
		
		String str = "abc"; // object in Stack memory, is going to be removed fast by Garbage Collector
		String str1 = new String("abc"); // object in Heap memory, will be stored for a while
		
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		// String  str3; java.lang.Error The local variable str3 may not have been initialized
		
		String str3 = new String();
		
		System.out.println(str3);
		
		str3.concat("d"); // was not assumed
		
		System.out.println(str3);
		
		str3 = str3.concat("abc"); // with "=" value is assumed
		
		System.out.println(str3);
		
		str3 = str3.concat("d"); // added new letter "d"
		
		System.out.println(str3);
		
		str3 = str3.concat("e").concat("f"); // added new letter "e" and "f"
		
		System.out.println(str3);
		
		String str4 = new String("abcdf");
		
		System.out.println(str3.compareTo(str3)); // 0 means strings are equal, in the same heap memory
		
		System.out.println(str3.compareTo(str4)); /* -1 means strings even being equal have different 
		place of storage */
		
		String str5 = "abcdef"; // object in stack memory
		String str6 = "abcdef"; // object in stack memory
		
		System.out.println(str5.compareTo(str6)); // 0 means strings are equal, in the same stack memory
		
		String str7 = new String("abcdefg");
		String str8 = str7;
		
		System.out.println(str7.equals(str8)); // true, str7 and str8 have the same values
		System.out.println(str7.compareTo(str8)); // console shows 0, means  str7 and str8  have the same values
		
		String str9 = new String("abcdefgh");
		String str10 = new String("abcdefgh");
		
		System.out.println(str9.equals(str10)); // true, str9 and str10 have the same values
		System.out.println(str9.compareTo(str10)); /* 0 means str9 and str10 values are the same, 
		even created with NEW they , but  have link to one value in Heap memory */
		
		
	}
	

}

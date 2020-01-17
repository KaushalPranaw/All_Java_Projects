package basic;

 import java.util.Arrays;
import java.util.Scanner;

 public class Anagram {

    static boolean isAnagram(String a, String b) {
        /*boolean bool =false;
        char ca[] = a.toLowerCase().toCharArray();
        Arrays.sort(ca);
        char cb[] = b.toLowerCase().toCharArray();
        Arrays.sort(cb);
        if(new String(ca).equals(new String(cb)))
        	bool = true;
        else
        	bool = false;
        return bool;*/
    	
    	boolean bool=false;
    	char ca[]=a.toCharArray();
    	char cb[]=b.toCharArray();
    	Arrays.sort(ca);
    	Arrays.sort(cb);
    	
    	bool=Arrays.equals(ca, cb);
    	return bool;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
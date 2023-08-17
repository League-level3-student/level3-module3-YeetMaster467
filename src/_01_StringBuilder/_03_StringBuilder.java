package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
       StringBuilder sb = new StringBuilder(str);
       return sb.append(characters).toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder sb = new StringBuilder(str);
    	return sb.insert(index, newChar).toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder sb = new StringBuilder(str);
    	return sb.delete(startIndex, endIndex).toString();
    }
}
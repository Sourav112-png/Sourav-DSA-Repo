package Searching;

//Base code for linear Search for String
public class LinearSearch2 {
public static void main(String[] args) {
	String name = "Sourav";
	char target = 'o';
	boolean ans = linearSearch(name, target);
	System.out.println(ans);
}

static boolean linearSearch(String name, char target) {
	if(name.length() == 0) {
		return false;
	}
	
	for(char var : name.toCharArray()) {
		if(target == var) {
			return true;
		}
	}
	return false;
}
}

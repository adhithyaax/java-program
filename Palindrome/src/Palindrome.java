import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sen,reverse="";
System.out.println("enter the string");
Scanner in=new Scanner(System.in);
sen=in.nextLine();
int length = sen.length();
for(int i=length-1;i>=0;i--)
	reverse=reverse+sen.charAt(i);
if(sen.equals(reverse))
	System.out.println("the entered string is a palindrome");
else
	System.out.println("the entered string is not a palindrome");



	}

}

package companyquestions;

import java.util.Scanner;

public class Characterisavowelorconsonant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonant");
			
		}

	}

}

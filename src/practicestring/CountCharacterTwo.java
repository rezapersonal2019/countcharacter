package practicestring;

import java.util.Scanner;

public class CountCharacterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;
        int scount = 0;
        int nCount = 0;

        //Declare a string    
        String str;
       
        
        Scanner console = new Scanner(System.in);
        System.out.print("Enter any string value for count character: ");
        
        str = console.nextLine();

        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();
        // System.out.print(str);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            //Checks whether a character is a vowel    
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                //Increments the vowel counter    
                vCount++;
            } //Checks whether a character is a consonant    
            else if (ch >= 'a' && ch <= 'z') //  else
            {
                //Increments the consonant counter    
                cCount++;
            } 
            else if (ch >= '0' && ch <= '9') //  else
            {
                //Increments the consonant counter    
                nCount++;
            } 
            else {
                scount++;
            }
        }
        System.out.println("Character of vowels: " + vCount);
        System.out.println("Character of consonants: " + cCount);
        System.out.println("Number of digits: " + nCount);
        System.out.println("Number of spaces: " + scount);

	}

}

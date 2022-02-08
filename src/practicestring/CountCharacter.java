package practicestring;

public class CountCharacter {

	public static void main(String[] args) {
		
		//Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;
        int scount = 0;

        //Declare a string    
        String str = "This is a really simple sentence";
        //String str = "Selim";

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
            } else {
                scount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
        System.out.println("Number of spaces: " + scount);

        

	}

}

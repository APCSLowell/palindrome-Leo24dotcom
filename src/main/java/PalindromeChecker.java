import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String lines)
{   String ans = "";
    for(int i = 0; i < lines.length(); i++){
        if(lines.isLetter(lines.charAt(i)) == true){
          new = new + lines.charAt(i);
        }
      lines = lines.LowerCase();
    }
    if (reverse(ans).equals(ans)) return true;
  return false;
  //your code here
}
public String reverse(String str)
{
    String sNew = new String();
  for(int i = 0; i < 7;i++){
  for(int x = str.length(); x > 0; x--){
   sNew =  sNew + str.substring(x-1,x);
  }
  }
  sNew = sNew.LowerCase();//your code here
    return sNew;
}
}

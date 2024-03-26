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
public boolean palindrome(String word)
{
  int checker = 0;
  if(word.length() == 0){
    return true;
  } else {
    int lastIndex = word.length()-1;
  for(int i = 0; i < word.length(); i++){
    if(word.charAt(i) == word.charAt(lastIndex)){
      checker++;
      lastIndex--;
    } else {
      return false;
    }
  }
  
  if(checker != 0){
    return true;
  }
  return false;
}
public String reverse(String str)
{
    String sNew = new String();
    //your code here
  for(int i = str.length()-1; i >= 0; i --){
    sNew = sNew + str.charAt(i);
  }
    return sNew;
}
}

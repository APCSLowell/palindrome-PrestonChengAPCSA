public void setup()
{
  String lines[] = {"test","rotator","rewriter","nurses run", "Madam, I'm Adam!", "A Man! A Plan! A Canal! Panama!"};
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
    String original = new String();
  
  for(int i = 0; i < word.length(); i++){
    if(Character.isLetter(word.charAt(i))){
      original = original + word.charAt(i);
    }
  }
  System.out.println(original);
  original = original.toLowerCase();
  if(original.equals(reverse(word))){
    return true;
  }
  return false;

}

public String reverse(String str)
{
    SString sNew = new String();
    //your code here
    for(int i = str.length()-1; i >= 0; i--){
      if(Character.isLetter(str.charAt(i))){
         sNew = sNew + str.charAt(i);
      }

    }
    sNew = sNew.toLowerCase();
    System.out.println(sNew);
    return sNew;
    }
    sNew = sNew.toLowerCase();
    System.out.println(sNew);
    return sNew;
}

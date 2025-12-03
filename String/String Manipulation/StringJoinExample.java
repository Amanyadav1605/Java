public class StringJoinExample

 {
 public static void main(String[] args) 
{
 String[] words = {"Hello", "World", "Welcome", "to", "Java"};
 String sentence = String.join(" ", words);
 System.out.println(sentence);
 }
}
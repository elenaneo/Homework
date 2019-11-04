public class Task2 {
 
   public static void main(String args[]){
	   String myString = "Программирование это хорошо, но есть что-то лучше";
	   System.out.println(myString);
	   String reversString = new String ();
	   String [] sourceString = myString.split(" ");
	   for (int i = sourceString.length-1; i >=0; i--)
	   {
		if ( sourceString[i].substring(sourceString[i].length() - 1).equals(","))
		{
		reversString= reversString.concat(",");
		reversString=String.join(" ",reversString,sourceString[i].substring(0,sourceString[i].length() - 1));
		}
		else
		{
		reversString=String.join(" ",reversString,sourceString[i]);
		}
	   }
	System.out.println(reversString);      
   }
}
   
   
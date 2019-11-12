
public class Task5 {
 
   public static void main(String args[]){
     String mystr = "xfd101";
     int i=0, j=0, koeff=1, mIndex =0, exColumn=0, exRow=0;
	 char [] printchar=mystr.toCharArray();
     for (j=0;j<printchar.length; j++)
	 {if (Character.isLetter(printchar[j]))
		{mIndex=j; 
		}
	 }
	 for (j=mIndex;j>=0; j--)
	 {
		i= Character.getNumericValue(printchar[j]);
		exColumn=exColumn+(i-9)*koeff;
		koeff=koeff*26;
			
		}
	 for (j=mIndex+1;j<printchar.length; j++)
	 {
		 System.out.println (j);
		 System.out.println (printchar[j]);
		 exRow=exRow*10+Character.getNumericValue(printchar[j]);
		 System.out.println (exRow);
	 }
	 System.out.println (exRow);
	 System.out.println (exColumn);
   }
}

	/*isLetter()
Определяет, является ли значение указанного типа char буквой.
	isDigit()
Определяет, является ли величина указанного типа char цифрой.
	toUpperCase()
Возвращает значение в верхнем регистре в виде указанного типа char.*/
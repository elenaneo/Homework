public class Task3 {
 
   public static void main(String args[]){
	   String myString = "sdfdsf,srwe14,7854,,dgd,afrfg6789421,afasd234,1235zcpoyudnvode..,10";
	   char myChar='o';
	 
	   System.out.println(mFind(myString,myChar)); 
   }
	   static String mFind(String mSource,char mFindch){
		Integer iFind =0, lastFind = mSource.lastIndexOf(mFindch), firstFind = mSource.indexOf(mFindch);
		StringBuilder result= new StringBuilder();
		System.out.println("firstFind-"+firstFind);
		System.out.println("lastFind-"+lastFind);
		if (firstFind ==-1)
			return "��᫮ �宦�����-"+0+",����樨: ���";
		else if (lastFind==firstFind)
			return "��᫮ �宦�����-"+1+",����樨:"+lastFind;
		else 
		{ iFind=iFind+1;
		  result.append(firstFind);
		do
		{
			iFind=iFind+1;
			firstFind = mSource.indexOf(mFindch,firstFind+1);
			result.append(", ");
			result.append(firstFind);
		}
		while (lastFind!=firstFind);
		return "��᫮ �宦�����-"+iFind+",����樨:"+result;	
		}
	   }	
   }

   
   
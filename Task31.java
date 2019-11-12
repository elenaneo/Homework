public class Task31 {
 
   public static void main(String args[]){
	   String myString = "sdfdsf,srwe14,7854,,dgd,afrfg6789421,afasd234,1235zcpoyudnvode..,10";
	   char myChar='f';
	 
	   System.out.println(mFind(myString,myChar)); 
   }
	   static Integer mFind(String mSource,char mFindch){
		Integer iFind =0, lastFind = mSource.lastIndexOf(mFindch), firstFind = mSource.indexOf(mFindch);
		System.out.println("firstFind-"+firstFind);
		System.out.println("lastFind-"+lastFind);
		if (firstFind ==-1)
			return iFind;
		else if (lastFind==firstFind)
			return 1;
		else 
		{ iFind=iFind+1;
		do
		{
			iFind=iFind+1;
			mSource=mSource.substring(0,lastFind-1);
			lastFind = mSource.lastIndexOf(mFindch);
		}
		while (lastFind!=firstFind);
		return iFind;	
		}
	   }	
   }

   
   
public class Task11 {
 
   public static void main(String arg[]){
     String [] args= new String[] {"Z11-100", "Z12-150", "Z13-120", "Z11-80", "Z12-50", "Z13-40", "Z11-200", "Z12-0", "Z13-10", "Z11-170"};    
     String [] typeCars=new String[] {"Z11", "Z12", "Z13"}; 
	 float [] myCarCoast = new float[typeCars.length];
	 for (int i=0; i<args.length;i++)
		{
			String myTypeCar = args[i].substring (0,3);
			Integer myProbeg= Integer.valueOf(args[i].substring(4));
			if (myProbeg!=0)
			{
				for (int j=0; j<typeCars.length; j++)
				{
					if (typeCars[j].equals(myTypeCar))
					{
						myCarCoast[j]= myCarCoast[j]+calcFuel(j,myProbeg);
						break;
					}
				}
			}
		
		}
	 
		int indexOfMax = 0;
		int indexOfMin = 0;
		float allCoast= 0.0F;
		for (int i = 0; i < myCarCoast.length; i++)
			{
			if (myCarCoast[i] > myCarCoast[indexOfMax])
				{
					indexOfMax = i;
				}
			else if (myCarCoast[i] < myCarCoast[indexOfMin])
				{
					indexOfMin = i;
				}
			allCoast+=myCarCoast[i];
			}
		
		
		System.out.println("allcoast- "+ allCoast);
		System.out.println("min-"+typeCars[indexOfMin]+", coast-"+ myCarCoast[indexOfMin]);
		System.out.println("max-"+typeCars[indexOfMax]+", coast-"+ myCarCoast[indexOfMax]);
   }
   public static float calcFuel(int j ,int probeg){
   float result;
   float [] sprNorma = new float[] {12.5F, 12F,11.5F};
  	
   result=probeg/sprNorma[j];
   return result;
   
   }
   /*?? ? ?,
		11-36,66666666666667?
		12-13,33333333333333
		13-11,33333333333333?
		*/
}
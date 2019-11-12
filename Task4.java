public class Task4 {
 
   public static float main(String cars[]){
         
     for (int i, i<args.lentngth,i++)
     	{
		float myCarCoast []= new Float();
		String myTypeCar = args[i].substring (1,3);
		integer myProbeg= args[i].substring(4);
		if (myProbeg=0)
			breake;
		else
			if (myTypeCar.equals("Z11")
			   {myTypeCar[1]= myTypeCar[1]+calcFuel("Z11",myProbeg);
			   }
			elseif (car.equals("Z12")
			   {myTypeCar[2]= myTypeCar[1]+calcFuel("Z12",myProbeg);
			   }
			elseif (car.equals("Z13")
			  {myTypeCar[3]= myTypeCar[1]+calcFuel("Z13",myProbeg);
			  }
			}
		/* вычислим максимальное и минимальное значение индекса */
		int indexOfMax = 0;
		int indexOfMin = 0;
		float allCoast= new allcoast;
		for (int i = 1; i < myTypeCar.length; i++)
		{
			if (myTypeCar[i] > myTypeCar[indexOfMax])
			{
				indexOfMax = i;
			}
			else if (myTypeCar[i] < myTypeCar[indexOfMin])
			{
			indexOfMin = i;
			System.out.println("Тип автомобиля Z1"+i+" расход-"+myTypeCar[i];
			}
			allcoast+=myTypeCar[i];
		}
		
		
		System.out.println(Общий расход - "+ allcoast);
		System.out.println(Минимальный расход у автомобиля с типом Z1"+indexOfMin;
		System.out.println(Минимальный расход у автомобиля с типом Z1"+indexOfMax;
   }
   public static float calcFuel(String car ,int probeg){
   float result, norma;
   norma=15.0;
   /*     if (car.equals("Z11")
				norma=12.5;
				elseif (car.equals("Z12")
				norma=12;
				elseif (car.equals("Z13")
				norma=11.5;*/
				
				
   rusult=probeg/norma;
   return result;
   
   }
   
}
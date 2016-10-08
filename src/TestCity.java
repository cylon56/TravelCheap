import java.util.Scanner;

public class TestCity 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		City[] cityList = new City[12];
		
		cityList[0] = new City("Amsterdam", 6.8, 3452);
		cityList[1] = new City("Bangkok", 10, 1260 );
		cityList[2] = new City("Austin", 8.3, 3028);
		cityList[3] = new City("Miami", 8.3 , 3238);
		cityList[4] = new City("Portland", 8 ,3503);
		cityList[5] = new City("Atlanta", 7.9, 2956);
		cityList[6]	= new City("Budapest", 9.2 ,1444);
		cityList[7]	= new City("Prague", 8.7, 1709);
		cityList[8]	= new City("Chaing Mai", 8.6 , 789);
		cityList[9]	= new City("Taipei", 8.4, 1570);
		cityList[10] = new City("Madrid", 8.2 ,2660);
		cityList[11] = new City("Berlin", 8, 2329);
		
		System.out.print("Enter your current monthly cost of living:" );
		double user_cost = in.nextDouble();
		System.out.println();		
		
		cityList = rankCitiesScore(user_cost, cityList);
		
		for(int i = 0; i < cityList.length; i++)
		{
			System.out.println(cityList[i].getTitle() + " " + cityList[i].getNomadCost());
		}

	}
	
	public static City[] rankCitiesScore(double user_cost, City[] cityList)
	{
		cityList = sortNomadCostArray(cityList);
		int k = 0;//index of most expensive city below or equal to user_cost
		
		//find index of most expensive city below or equal to user_cost
		for(int i = 0; i < cityList.length && cityList[i].getNomadCost() < user_cost; i++)
		{ 
			k++;
		}
		System.out.println(k);
		//add cities below index of k to new array
		City[] rankedList = new City[k];
		for(int i = 0; i < k; i++)
		{
			rankedList[i] = cityList[i];
		}
		
		return rankedList;
	}
	
	//sorts the array of city by nomad cost least-greatest (insertion sort)
	public static City[] sortNomadCostArray(City[] cityList)
		{
			
			for(int j = 1; j <= cityList.length; j++)
			{
				int i;
				for(i = j-1; i > 0; i--)
				{
					if(cityList[i].getNomadCost() < cityList[i-1].getNomadCost())
					{
						City key = cityList[i];
						cityList[i] = cityList[i-1];
						cityList[i-1] = key;
					}
				}
			}
			return cityList;
		}
	
	//sorts the array of city by nomad cost least-greatest (insertion sort)
		public static City[] sortNomadScoreArray(City[] cityList)
			{
				
				for(int j = 1; j <= cityList.length; j++)
				{
					int i;
					for(i = j-1; i > 0; i--)
					{
						if(cityList[i].getNomadScore() < cityList[i-1].getNomadScore())
						{
							City key = cityList[i];
							cityList[i] = cityList[i-1];
							cityList[i-1] = key;
						}
					}
				}
				return cityList;
			}
	

}

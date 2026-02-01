package Thomas_Travel;

public class Travel 
{
	public boolean isCarDriver(Driver d)
	{
		return d.getCategory().equalsIgnoreCase("Car");
	}
	public boolean isAutoDriver(Driver d)
	{
		return d.getCategory().equalsIgnoreCase("Auto");
	}
	public boolean isLorryDriver(Driver d)
	{
		return d.getCategory().equalsIgnoreCase("Lorry");
	}
	
	public String retrievebyDriver(Driver []arr,int n,int id) 
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i].getDriverId()==id)
			{
				return "Driver name is "+arr[i].getDriverName()+
						" belonging to the category "+arr[i].getCategory()+
						" travelled "+arr[i].getTotalDistance()+" KM so far.";
			}
		}
		return "Driver not Found.";
	}
	
	public int retrieveCountOfDriver(Driver []arr,int n,String category)
	{
		if(!isValidCategory(category))
		{
			System.out.println("Invalid category, Use car,lorry, auto only");
			return 0;
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i].getCategory().equalsIgnoreCase(category))
			{
				count++;
			}
		}
		return count;
	}
	
	public void retrieveDriver(Driver []arr, int n, String category)
	{
		if(!isValidCategory(category))
		{
			System.out.println("Invalid category, Use car,lorry, auto only");
			return;
		}
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i].getCategory().equalsIgnoreCase(category))
			{
				System.out.println(arr[i].getDriverName()+" = "+arr[i].getTotalDistance());
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("Not Found that type of Driver");
		}
	}
	
	public Driver retrieveMaxDisDriver(Driver []arr,int n)
	{
		Driver max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i].getTotalDistance()>max.getTotalDistance())
			{
				max=arr[i];
			}
		}
		return max;
	}
	public void sortByDis(Driver []arr,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].getTotalDistance()>arr[j].getTotalDistance())
				{
					Driver temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	private boolean isValidCategory(String category) 
	{
		return category.equalsIgnoreCase("Car")||
				category.equalsIgnoreCase("Lorry")||
				category.equalsIgnoreCase("Auto");
	}
}

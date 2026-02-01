package Thomas_Travel;

public class Driver 
{
	private String category;
	private int driverId;
	private String driverName;
	private double totalDistance;
	
	public Driver() 
	{
		//
	}
	
	public Driver(int driverId ,String driverName
			,String category ,double totalDistance)
	{
		this.driverId=driverId;
		this.driverName=driverName;
		this.category=category;
		this.totalDistance=totalDistance;
	}
	
	public int getDriverId() 
	  {
        return driverId;
    }

    public void setDriverId(int driverId) 
    {
        this.driverId = driverId;
    }

    public String getDriverName() 
    {
        return driverName;
    }

    public void setDriverName(String driverName) 
    {
        this.driverName = driverName;
    }
    
	public String getCategory() 
    {
	     return category;
	}

	public void setCategory(String category) 
	{
      this.category = category;
    }
	 
	public double getTotalDistance() 
	{
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) 
    {
        this.totalDistance = totalDistance;
    }
}

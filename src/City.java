

//City class will hold attributes of certain cities
public class City 
{
	//title and url location of the city
	private String title;
	private String url;
	private String country;
	private String region;
	
	//the "quality" of the city for either nomads or locals
	private double nomadScore;
	private double lifeScore;
	
	//monthly cost of living in the city for nomads, expats, and locals
	private double nomadCost;
	private double expatCost;
	private double localCost;
	
	//full constructor 
	City(String title, String url, String country, String region, double ns, double ls, double nc, double ec, double lc)
		{
			this.title = title;
			this.url = url;
			this.country = country;
			this.region = region;
			this.nomadScore = ns;
			this.lifeScore = ls;
			this.nomadCost = nc;
			this.expatCost = ec;
			this.localCost = lc;
		}	
	
	//constructor excluding regions and country
	City(String title, String url, double ns, double ls, double nc, double ec, double lc)
	{
		this.title = title;
		this.url = url;
		this.nomadScore = ns;
		this.lifeScore = ls;
		this.nomadCost = nc;
		this.expatCost = ec;
		this.localCost = lc;
	}	
	
	//constructor excluding regions, url, country, and non-nomad double variables
	City(String title, double ns, double nc)
		{
			this.title = title;
			this.nomadScore = ns;
			this.nomadCost = nc;
		}	
	
	//no cost or score variables constructor
	City(String title, String url)
	{
		this.title = title;
		this.url = url;
	}	
	
	public String getTitle()
	{
		return title;
	}
	
	public double getNomadScore()
	{
		return nomadScore;
	}
	
	public double getLifeScore()
	{
		return lifeScore;
	}
	public double getNomadCost()
	{
		return nomadCost;
	}
	public double getExpatCost()
	{
		return expatCost;
	}
	public double getLocalCost()
	{
		return localCost;
	}
	
	
		
}

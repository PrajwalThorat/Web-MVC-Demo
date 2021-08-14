package web.model;
import java.util.*;
public class BeerExpert 
{
	public List getBrands(String color)
	{
		List brands=new ArrayList();
		
		if(color.equals("light"))
		{
			brands.add("Pale");
			brands.add("KingFisher");
		}
		else if(color.equals("amber"))
		{
			brands.add("5000");
			brands.add("Knockout");
		}
		else if(color.equals("brown"))
		{
			brands.add("Foster");
			brands.add("Tuborg");
		}
		else
		{
			brands.add("Local");
		}
		return brands;
	}

}

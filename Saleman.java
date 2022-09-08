
public class Saleman 
{
	private float salesTotal;
	private String name;
	
	public Saleman(String name , float salesTotal)
	{
		this.name = name;
		this.salesTotal = salesTotal;
	}
	
	public static Saleman[] GetTopFive(Saleman[]sales)
	{
		Saleman[] top5 = new Saleman[5];
		for(int i = 0; i < 5; i++)
		{
			int count = 0;
			while((top5[count] == null || top5[count].salesTotal < sales[i].salesTotal) && count < 5)
			{
				if(count ==0)
				{
					top5[count] = sales[i];
				}
				else
				{
					Saleman temp = null;
					top5[count] = temp;
					top5[count] = sales[i];
					top5[count -1] = temp;
				}
				count++;
			}
		}
		return top5;
	}
	public String toString()
	{
		return "Salesman " + this.name + " has a yearly total sale of $" + this.salesTotal;
	}
}
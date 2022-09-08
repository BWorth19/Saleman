
public class Salesman {

	public static void main(String[] args) 
	{
		Saleman sales[] = new Saleman[5];
		sales[0]= new Saleman("Jim",1000);
		sales[1]= new Saleman("Bob",3000);
		sales[2]= new Saleman("Carl",9000);
		sales[3]= new Saleman("Dave",7000);
		sales[4]= new Saleman("Andy",2000);
		Saleman result[] = Saleman.GetTopFive(sales);
		for(int i = 0; i < 5; i++)
		{
			System.out.println(sales[i]);
		}
		System.out.println("the top 5 salesmen are:");
		for(int i = 0; i < 5; i++)
		{
			System.out.println(result[i]);		
		}
	}
}

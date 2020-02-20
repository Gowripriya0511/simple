import java.util.Scanner;
class Construction
{
	Construction(double totalarea) // totalarea = Total Area of the House
	{
		Scanner sc = new Scanner(System.in);
		double construct_cost;
		double square_feet = totalarea*10.764; // Converting Area into Square Feet
		//"1.Standard Material 2.Above Standard Material 3.High Standard Material 4.High Standard Material and Fully Automated Home"
		int typeofhouse = sc.nextInt(); // Reading Type of House as given in above comment
		switch(typeofhouse)
		{
			case 1 : construct_cost = 1200 * square_feet; // Construction Cost for Standard Material
					 break;
			case 2 : construct_cost = 1500 * square_feet; // Construction Cost for Above Standard Material
					 break;
			case 3 : construct_cost = 1800 * square_feet; // Construction Cost for High Standard Material
					 break;
			case 4 : construct_cost = 2500 * square_feet; // Construction Cost for High Standard Material and Fully Automated Home
					 break;
			default: return;
		}
	}
}
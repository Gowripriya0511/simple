import java.util.*;
class SimComInterest
{
	SimComInterest(double pamount,double rateofinterest,double t)
	{
		double sinterest , cinterest;
		sinterest=(pamount * t* rateofinterest)/100;
		cinterest=pamount * Math.pow(1.0 + rateofinterest / 100.0 , t) - pricipleamount;
	}
}
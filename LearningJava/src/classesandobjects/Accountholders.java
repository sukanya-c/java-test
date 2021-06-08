package classesandobjects;

public class Accountholders {
	String firstname;
	String lastname;
	int age;
	float accountbalance;
	boolean eligibleforcc;
public void testcceligibility() 
{
		if (age>25 && accountbalance>=20000)
		{
		eligibleforcc=true;
		}
	}
}

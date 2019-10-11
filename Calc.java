class Calc
{
	int add(int a, int b)
	{
		return positive(a+b);
	}

	int sub(int a, int b)
	{
		return positive(a-b);
	}

	int positive(int a)
	{
		if (a >= 0)
		   return a;
		
		else
		   return a*(-1);
	}
}

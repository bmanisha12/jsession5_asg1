class rectangle
{
	protected double  value1 , value2;
	protected void Param(double v1, double v2)
	{
		value1=v1;
		value2=v2;
	}
	
	protected double rarea()
	{
		return(value1*value2);
	}
}
class triangle extends rectangle {
	
	protected double tarea()
	{
		return(0.5*value1*value2);
	}

	public static void main(String args[])
	{
		triangle t = new triangle();
	
		t.Param(4,5);
		System.out.println("\n Area of rectangle is: "+t.rarea());
		System.out.println("\n Area of rectangle is: "+t.tarea());

		
	}
}

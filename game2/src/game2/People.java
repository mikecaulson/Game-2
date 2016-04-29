package game2;

public class People
	{

		String name1;
		String name2;
		double height;
		public People (String n1, String n2, double h)
		{
			name1 = n1;
			name2 = n2;
			height = h;
		}
		public String getName1()
			{
				return name1;
			}
		public void setName1(String name1)
			{
				this.name1 = name1;
			}
		public String getName2()
			{
				return name2;
			}
		public void setName2(String name2)
			{
				this.name2 = name2;
			}
		public double getHeight()
			{
				return height;
			}
		public void setHeight(double height)
			{
				this.height = height;
			}

	}

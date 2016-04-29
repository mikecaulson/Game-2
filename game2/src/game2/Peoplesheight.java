package game2;

import java.util.ArrayList;
import java.util.Scanner;
public class Peoplesheight
	{

		public static void main(String[] args)
			{
				ArrayList <People> peoplesHeight = new ArrayList<People>();
				peoplesHeight.add(new People("Michael", "Caulson", 6.1));
				peoplesHeight.add(new People("Jack", "Paul", 5.10));
				peoplesHeight.add(new People("Chris", "Zuber", 6.4));
				peoplesHeight.add(new People("Andrew", "Seaman", 4.4));
				peoplesHeight.add(new People("John", "Doe", 5.5));
				peoplesHeight.add(new People("Jane", "Doe", 5.7));
				for (int i = 0; i < peoplesHeight.size();i++)
					{
						System.out.print(peoplesHeight.get(i).getName1());
						System.out.print(" " + peoplesHeight.get(i).getName2());
						System.out.println(" --- " + peoplesHeight.get(i).getHeight() + " feet");
					}
				System.out.println("Would you like to look at someone in particular?");
				Scanner userInput = new Scanner(System.in);
				String closer = userInput.nextLine();
				if (closer.equals("Michael"))
					{
						System.out.println("he is the best!!!");
					}
				else if (closer.equals("Jack"))
					{
						System.out.println("HE is a crazy person.");
					}
				else if (closer.equals("Chris"))
					{
						System.out.println("He is 'aight.");
					}
				else if (closer.equals("Andrew"))
					{
						
					}
				else if (closer.equals("John"))
					{
						
					}
				else if (closer.equals("Jane"))
					{
						
					}

			}

	}

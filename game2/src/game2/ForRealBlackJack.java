package game2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ForRealBlackJack
	{
		static ArrayList<NCardSet> cardArray1 = new ArrayList<NCardSet>();
		static int bet, player, dealer, dealersecret1,dealersecret2, balance;
		static boolean Hit, dealermove, lose, win, dealermove1, Win, Bet, Game,Final;
		static String dealersecret3, dealersecret4, answer4;
		public static void main(String[] args)
			{
				greetPlayer();
				getBalance();
				while (Game)
					{
				generateCards();
				askToSeeCards();
				tellBallance();
				getBet();
				shuffleCards();
				giveFirstCard();
				giveDealersFirstcard();
				giveSecondCard();
				checkForBust();
				giveDealersSecondcard();
				Hit = true;
				while (Hit)
					{
						askForHit();
						checkForBust();
					}
				while (dealermove1)
				{
				sayDealer();
				}
				while (dealermove)
					{
						doDealersMove();
					}
				sayWin();
				sayGoodbye();
					}
				
			}
		public static void greetPlayer()
			{
				Scanner userInput=new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
				System.out.println("Hi, "+ name + ", hope you like the game!");
			}
		public static void getBalance()
		{
			balance = 10000;
			Game = true;
		}
		public static void generateCards()
			{
				cardArray1.add(new NCardSet("Ace", "Spades",11));
				cardArray1.add(new NCardSet("2", "Spades",2));
				cardArray1.add(new NCardSet("3", "Spades",3));
				cardArray1.add(new NCardSet("4", "Spades",4));
				cardArray1.add(new NCardSet("5", "Spades",5));
				cardArray1.add(new NCardSet("6", "Spades",6));
				cardArray1.add(new NCardSet("7", "Spades",7));
				cardArray1.add(new NCardSet("8", "Spades",8));
				cardArray1.add(new NCardSet("9", "Spades",9));
				cardArray1.add(new NCardSet("10", "Spades",10));
				cardArray1.add(new NCardSet("Jack", "Spades",10));
				cardArray1.add(new NCardSet("Queen", "Spades",10));
				cardArray1.add(new NCardSet("King", "Spades",10));
				cardArray1.add(new NCardSet("Ace", "Diamonds",11));
				cardArray1.add(new NCardSet("2", "Diamonds",2));
				cardArray1.add(new NCardSet("3", "Diamonds",3));
				cardArray1.add(new NCardSet("4", "Diamonds",4));
				cardArray1.add(new NCardSet("5", "Diamonds",5));
				cardArray1.add(new NCardSet("6", "Diamonds",6));
				cardArray1.add(new NCardSet("7", "Diamonds",7));
				cardArray1.add(new NCardSet("8", "Diamonds",8));
				cardArray1.add(new NCardSet("9", "Diamonds",9));
				cardArray1.add(new NCardSet("10", "Diamonds",10));
				cardArray1.add(new NCardSet("Jack", "Diamonds",10));
				cardArray1.add(new NCardSet("Queen", "Diamonds",10));
				cardArray1.add(new NCardSet("King", "Diamonds",10));
				cardArray1.add(new NCardSet("Ace", "Clubs",11));
				cardArray1.add(new NCardSet("2", "Clubs",2));
				cardArray1.add(new NCardSet("3", "Clubs",3));
				cardArray1.add(new NCardSet("4", "Clubs",4));
				cardArray1.add(new NCardSet("5", "Clubs",5));
				cardArray1.add(new NCardSet("6", "Clubs",6));
				cardArray1.add(new NCardSet("7", "Clubs",7));
				cardArray1.add(new NCardSet("8", "Clubs",8));
				cardArray1.add(new NCardSet("9", "Clubs",9));
				cardArray1.add(new NCardSet("10", "Clubs",10));
				cardArray1.add(new NCardSet("Jack", "Clubs",10));
				cardArray1.add(new NCardSet("Queen", "Clubs",10));
				cardArray1.add(new NCardSet("King", "Clubs",10));
				cardArray1.add(new NCardSet("Ace", "Hearts",11));
				cardArray1.add(new NCardSet("2", "Hearts",2));
				cardArray1.add(new NCardSet("3", "Hearts",3));
				cardArray1.add(new NCardSet("4", "Hearts",4));
				cardArray1.add(new NCardSet("5", "Hearts",5));
				cardArray1.add(new NCardSet("6", "Hearts",6));
				cardArray1.add(new NCardSet("7", "Hearts",7));
				cardArray1.add(new NCardSet("8", "Hearts",8));
				cardArray1.add(new NCardSet("9", "Hearts",9));
				cardArray1.add(new NCardSet("10", "Hearts",10));
				cardArray1.add(new NCardSet("Jack", "Hearts",10));
				cardArray1.add(new NCardSet("Queen", "Hearts",10));
				cardArray1.add(new NCardSet("King", "Hearts",10));
			}
		public static void tellBallance()
		{
			System.out.println("You have a betting maximum of $"+balance+".");
			
		}
		public static void askToSeeCards()
			{
				System.out.println("Would you like to see all of the cards? Type Yes or No.");
				Scanner userInput3=new Scanner(System.in);
				String answer2 = userInput3.nextLine();
				if (answer2.equals("Yes")||answer2.equals("yes"))
					{
						for (NCardSet n: cardArray1)
							{
								System.out.print(n.getRank1());
								System.out.print(" of ");
								System.out.print(n.getSuit1());
								System.out.println(", ");
							}
						}
					}
		public static void getBet()
			{
				System.out.println("How much would you like to bet?");
				Scanner userInput2=new Scanner(System.in);
				
				
				System.out.println("Place bet now.");
				bet = userInput2.nextInt();
				if (bet<0||bet>balance)
					{
						System.out.println("That is an invalid amount, your maximum is $" + balance+", and you can't bet below 0.");
						System.out.println("Please bet again.");
						getBet();
					}
				else 
					{
						System.out.println("You bet, $"+bet+". Good luck!!");
						
					}
					
			}
		public static void shuffleCards()
			{
				Collections.shuffle(cardArray1);
				
			}
		public static void giveFirstCard()
		{
			System.out.println("Your first card is a "+ cardArray1.get(0).getRank1()+" of "+cardArray1.get(0).getSuit1());
			player = cardArray1.get(0).getWorth1();
			cardArray1.remove(0);
			System.out.println();
		}
		public static void giveDealersFirstcard()
		{
			System.out.println("The Dealers first card is a "+cardArray1.get(0).getRank1()+" of "+cardArray1.get(0).getSuit1());
			dealer = cardArray1.get(0).getWorth1();
			cardArray1.remove(0);
			System.out.println();
		}
		public static void giveSecondCard()
		{
			System.out.println("Your second card is a "+cardArray1.get(0).getRank1()+" of "+cardArray1.get(0).getSuit1());
			player = player + cardArray1.get(0).getWorth1();
			
			cardArray1.remove(0);
			if (player==21)
				{
					System.out.println("Congratulations, you WON!!!");
					System.out.println("_____________________");
					bet = bet*3;
					System.out.println("Your take home balance is,  $"+(balance+bet));
					balance = balance + bet;
					dealermove = false;
					dealermove1 = false;
					Hit = false;
				}
		}
		public static void giveDealersSecondcard()
			{
				System.out.println("The dealers second card is not face up.");
				dealersecret3 = cardArray1.get(0).getRank1();
				dealersecret4 = cardArray1.get(0).getSuit1();
				dealersecret2 = cardArray1.get(0).getWorth1();
				dealer = dealer + dealersecret2;
				cardArray1.remove(0);
			}
		public static void askForHit()
		{
			System.out.println();
			System.out.println("You are now at "+player + " out of 21.");
			System.out.println();
			System.out.println("Would you like to hit? Only type yes or no.");
			Scanner userInput2 = new Scanner(System.in);
			String answer = userInput2.nextLine();
			if (answer.equals("Yes")||answer.equals("yes"))
				{
					System.out.println("Your next card is a "+ cardArray1.get(0).getRank1()+" of "+cardArray1.get(0).getSuit1());
					player = player + cardArray1.get(0).getWorth1();
					cardArray1.remove(0);
					System.out.println("You are now at " + player + " out of 21.");
					
					Hit = true;
				}
			else if (answer.equals("No")||answer.equals("no"))
				{
					System.out.println("Ok, you are at "+player+" out of 21.");
					Hit = false;
				}
		}
		public static void checkForBust()
		{
			if (player==21)
			{
//				System.out.println("Congratulations, you WON!!!");
//				System.out.println("_____________________");
//				bet = bet*3;
//				System.out.println("Your take home balance is,  $"+(balance+bet));
//				balance = balance + bet;
//				dealermove = false;
//				dealermove1 = false;
//				Hit = false;
				System.out.println();
			}
			else if (player>21)
			{
				System.out.println("BUST!!!!");
				System.out.println("Unfortunatly you lose.");
				System.out.println("_____________________");
				 
				System.out.println("Your take home balance is,  $"+(balance-bet));
				balance = balance - bet;
				dealermove = false;
				dealermove1 = false;
				Hit = false;
				
			}
			else if (player<21)
			{
				System.out.println();
				dealermove1 = true;
				dealermove = true;
			}
		}
		public static void sayDealer()
		{
			System.out.println("The dealer is at "+dealer+" out of 21.");
			dealermove1 = false;
		}
		public static void doDealersMove()
		{
			if (dealer==21)
			{
				System.out.println("The dealer is at 21, he wins.");
				System.out.println("Unfortunatly you lose.");
				System.out.println("_____________________");
				 
				System.out.println("Your take home balance is,  $"+(balance-bet));
				Win = true;
				dealermove = false;
			}
			else if (dealer>21)
			{
				System.out.println("The dealer is over 21, you WIN!!!");
				Win = true;
				dealermove = false;
			}
			else if (dealer>=17)
			{
				
				if (dealer<21)
				{
					System.out.println("The dealer stops at 17 or above, and he is at "+dealer+" out of 21, so he will stop.");
					dealermove = false;
					Win = true;
				}
				else if (dealer>21)
				{
					System.out.println();
					dealermove = false;
					Win = true;
				}
			}
			else if (dealer<17)
			{
				System.out.println("The dealer chooses another card... he recieved a "+cardArray1.get(0).getRank1() + " of "+cardArray1.get(0).getSuit1());
				dealer = dealer + cardArray1.get(0).getWorth1();
				cardArray1.remove(0);
				System.out.println("The dealer is now at "+dealer+" out of 21.");
				dealermove = true;
			}
		}
		public static void sayWin()
		{
			while (Win)
			{
			if (player == dealer)
			{
				System.out.println("It is a tie, you get your money back.");
				System.out.println("_____________________");
				System.out.println("Your take home balance is,  $"+balance);
				balance = balance + 0;
				break;
			}
//			else if (player>21)
//			{
//				 
//				System.out.println("_____________________");
//				System.out.println("Your take home balance is,  $"+(balance-bet));
//				balance = balance - bet;
//				break;
//			}
			else if (player ==21)
			{
				bet= bet * 3;
				System.out.println("_____________________");
				System.out.println("Your take home balance is,  $"+(balance+bet));
				balance = balance + bet;
				break;
			}
			else if (player>dealer)
			{
				if (player<21)
				{
					System.out.println("Yay you WON!!!");
					System.out.println("You won double your money.");
					bet= bet *2;
					System.out.println("_____________________");
					System.out.println("Your take home balance is,  $"+(balance+bet));
					balance = balance + bet;
					break;
				}
				
//				else if (player >21)
//				{
//					System.out.println("Unfortunatly you lost.");
//					 
//					System.out.println("_____________________");
//					System.out.println("Your take home balance is,  $"+(balance-bet));
//					balance = balance - bet;
//					break;
//				}
				
			}
			else if (dealer >player)
			{
				if (dealer <21)
				{
					System.out.println("The dealer won, better luck next time.");
					
					System.out.println("_____________________");
					System.out.println("Your take home balance is,  $"+(balance-bet));
					balance = balance - bet;
					break;
				}
				else if (dealer > 21)
				{
					System.out.println("Yay, you WON!!!");
					bet = bet *2;
					System.out.println("_____________________");
					System.out.println("Your take home balance is,  $"+(balance+bet));
					balance = balance + bet;
					break;
				}
			}
			System.out.println();
			}
		}
		public static void sayGoodbye()
		{
			System.out.println("Would you like to play again? Answer by saying Yes or No.");
			Scanner userInput=new Scanner(System.in);
			answer4 = userInput.nextLine();
			Final = true;
			while (Final)
				{
			if (answer4.equals("Yes")||answer4.equals("yes")||answer4.equals("y")||answer4.equals("Y"))
				{
					Game = true;
					Final = false;
				}
			else if (answer4.equals("No")||answer4.equals("no")||answer4.equals("n")||answer4.equals("N"))
				{
					Game= false;
					System.out.println("Have a nice day!!");
					Final = false;
				}
			else 
				{
					System.out.println("That is not a valid answer, please either type Yes or No.");
					answer4 = userInput.nextLine();
					Final = true;
				}
				}
		}
}
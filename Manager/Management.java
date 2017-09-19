package Manager;

import static java.lang.System.*;
class Management 
{
	public static void main(String[] args) 
	{
		// creates 2 new assistants ( objects of the Assistant class)
		// creates using  name and  pay ( in thousands)
		Assistant kate = new Assistant ("Kate", 30);
		Assistant don = new Assistant ( "Don", 40);
		// tells all assistants what week it is using the public static variable week
		Assistant.week = 1;
		//uses the public get pay method to access the  private non static pay of each assistant
		out.println("Kate gets " + kate.getPay());
		out.println("Don gets " + don.getPay());
		// checks all assistant know what week it is 
		out.println("It is week " + Assistant.week);
		// gives ONLY Kate a payrise ( method not static)using the public access to her private pay and stating the rate
		kate.payRise(1.2);
		// tells all assistants to move onto the next week using the public static variable week
		Assistant.week++;
		//checking Kate has got her pay rise 
		out.println("Kate gets "+ kate.getPay());
		//checking which week it is
		out.println("It is week " + Assistant.week);
		// checking that Don HAS NOT been given a pay rise
		out.println("Don gets " +don.getPay());
		// tells kate what week it is and so change it for everyone as it is static
		kate.week++;
		//checks everyone now knows we have moved on a week
		out.println("It is week " + Assistant.week);
		//check  Don knows it too
		out.println("Don knows it is week " + don.week);
		// sets the rate of tax as 20% for ALL assistants (static method) using public  access to their private  taxRate
		Assistant.setRate(20.0);
		/* checks ALL assistants  are using the right rate by using public method to 
		access their individual pay and tax*/
		out.println("Kate pays tax of " +kate.getTax());
		out.println("Don pays tax of " +don.getTax());
		//tells Don what week it is and so change it for everyone as it is static 
		don.week++;
		//checks  Kate knows it too
		out.println("Kate knows it is week " + kate.week);
		/*puts up the taxRate for everyone using the public access to their private taxRate
		NB no parameter needed here*/
		Assistant.incrementRate();
		// tells all assistants to move onto the next week using the public static variable week
		Assistant.week++;
		/*checks everyone is paying the correct new level of tax and 
		eveyone knows what week it is*/
		out.println("Kate pays tax of " +kate.getTax());
		out.println("Don pays tax of " +don.getTax());
		out.println("It is week " + Assistant.week);

		/* ERRORS */
		/* give all assistants a pay rise? */
			// Assistant.payRise(1.3);
		/* this will not compile as you are using a ststic context ( i.e Assistant for ALL assistants)
		to access a non static method payRise which is only supposed to be used 
		with individual obkects like Kate & Don*/

		/* find Kate's current pay */
			// System.out.println("Kate's pay is " +kate.pay);
		/* will not compile as kate's pay is private (Assistant class has pay as a 
		private variable and so you only have access to it by using a public method like getPay*/
		/* change the tax rate just for Don */
			// don.incrementRate();
			// out.println("Kate pays tax of " +kate.getTax());
		/* will compile but not work as you expect as Kate's tax will change as well 
		because incrementRate is a static method*/ 
	
	}
}

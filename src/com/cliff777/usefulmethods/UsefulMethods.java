package com.cliff777.usefulmethods;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsefulMethods 
{
	
<<<<<<< HEAD
	public UsefulMethods()
	{
		//test
	}

	public static void main(String[] args)
	{
		new UsefulMethods();
	}

	

=======
>>>>>>> e332a27cba72ede865d3573d7229f2b0ce3670e7
	//compares a date in string form to the current date
	//and gives the difference in seconds
	public int fromThenToNow(String date) throws ParseException
	{
		DateFormat format = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");

		Date now = new Date();
		Date then = format.parse(date);

		long difference = then.getTime() - now.getTime();

		return (int) (difference/1000);
	}

	public static void main(String[] args)
	{
		new UsefulMethods();
	}

	public UsefulMethods()
	{
		//test
	}

	

}

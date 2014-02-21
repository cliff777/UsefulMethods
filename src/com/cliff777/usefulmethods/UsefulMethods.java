package com.cliff777.usefulmethods;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsefulMethods 
{

	public static void main(String[] args)
	{
		new UsefulMethods();
	}

	public UsefulMethods()
	{

	}

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

}

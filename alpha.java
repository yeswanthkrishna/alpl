/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner reader=new Scanner(System.in);
		ch=reader.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("alphabet");
		else
			System.out.println( "not alphabet");
	}
}

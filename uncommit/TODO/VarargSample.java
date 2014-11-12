package TODO;

/**
 * 
 * 
 * Class<?>
 * 
 * bitoperation
 * 
 * steams by finger
 * 
 * @param strings
 */

class VarargSample
{
	public static void PrintMultipleStrings(String... strings)
	{
		for (String s : strings)
		{
			System.out.println(s);
		}
	}

	public static void main(String... args)
	{
		PrintMultipleStrings("Hello", "world", "Hello", "world", "Hello", "world");
	}
}
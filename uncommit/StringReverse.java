class StringSample
{
	String str;

	public StringSample()
	{
		// TODO Auto-generated constructor stub
	}

	public String getStr()
	{
		return str;
	}

	public void setStr(String str)
	{
		this.str = str;
	}

}

public class StringReverse
{
	public static void main(String[] args)
	{
		String str = "abcdefg";

		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();

		// System.out.println(str);
		// System.out.println(strBuilder);

		// System.out.println(reverse(str));
		// System.out.println(str);

		StringSample ss = new StringSample();
		ss.setStr(new String("abcd"));

		System.out.println(reverse(ss.getStr()));
		
		reverse(ss.getStr());
		
		System.out.println(ss.getStr());
		
		reverseReference(ss);
		System.out.println(ss.getStr());
	}

	public static String reverse(String input)
	{
		char[] in = input.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin)
		{
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}
	
	public static String reverseReference(StringSample input)
	{
		char[] in = input.getStr().toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin)
		{
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		
		input.setStr(new String(in));
		
		return input.getStr();
	}
}

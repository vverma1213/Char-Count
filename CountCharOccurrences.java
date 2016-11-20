import java.util.HashMap;

public class CountCharOccurrences
{

	public static void main(String[] args)
	{
		String str = "Java is Platform Independent language";
		countOccurrences(str);
	}

	private static void countOccurrences(String str)
	{
		HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();
		char c[] = str.toCharArray();
		for (char chr : c)
		{
			if (countChar.containsKey(chr))
			{
				countChar.put(chr, countChar.get(chr) + 1);
			}
			else
			{
				countChar.put(chr, 1);
			}
		}
		System.out.println(countChar);
	}

}

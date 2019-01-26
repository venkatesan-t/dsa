package inClassByRavi;

public class ConcatenateUncommonCharsInTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "adecfg";
		String str2 = "xyegpd";	
		
		String uncommonCharsString = concatenateUncommonChars(str1, str2);
		System.out.println(uncommonCharsString);
	}
	
	public static String concatenateUncommonChars(String str1, String str2)
	{
		int[] ascii1 = getAsciiArray(str1);
		int[] ascii2 = getAsciiArray(str2);
		
		int str1Len = str1.length();
		String result = "";
		for(int i=0;i<str1Len;i++)
		{
			if(ascii2[Character.getNumericValue(str1.charAt(i))] == 0)
			{
				result += str1.charAt(i);
			}
		}
		int str2Len = str2.length();
		for(int i=0;i<str2Len;i++)
		{
			if(ascii1[Character.getNumericValue(str2.charAt(i))] == 0)
			{
				result += str2.charAt(i);
			}
		}
		return result;
	}
	
	public static int[] getAsciiArray(String str)
	{
		int[] ascii = new int[256];
		int strLen = str.length();		
		for(int i=0;i<strLen;i++)
		{
			ascii[Character.getNumericValue(str.charAt(i))] = ascii[Character.getNumericValue(str.charAt(i))] + 1;
		}
		return ascii;
	}

}

package Hardworking;

public class consonents {

	public static void main(String[] args) {
		String s1="tejas sir";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
				System.out.println(ch);
			}
			
		}

	}

}

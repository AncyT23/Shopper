package Hardworking;

public class Returntype {
	
	static int disp(int [] abb)
	{
		int sum=0;
		for(int i=0;i<abb.length;i++)
			
		{
			if(abb[i]%2==0)
			{
				sum=sum+abb[i];
				}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[]arr= {10,21,30,41};
		System.out.println(disp(arr));
	}

}

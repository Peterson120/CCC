import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CCC22S1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println(remainder());
	}

	public static int remainder() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		int ans = 0;
		for(int i = 0; i <= 1000000; i++)
		{
			int total = i*5;
			int remainder = num-total;
			if(remainder >= 0 && remainder % 4 == 0) ans++;
		}
		br.close();
		return ans;
	}
}

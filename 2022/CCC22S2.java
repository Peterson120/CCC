import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class CCC22S2
{
	public static void main(String[]args) throws IOException
	{
		System.out.println(groups());
	}

	public static int groups() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.valueOf(br.readLine());
		String[] xArr = new String[x];
		for(int i = 0; i < x; i++)
		{
			xArr[i] = br.readLine();
		}
		// xArr = split(xArr,x);

		int y = Integer.valueOf(br.readLine());
		String[] yArr = new String[y];
		for(int i = 0; i < y; i++)
		{
			yArr[i] = br.readLine();
		}
		// yArr = split(yArr,y);

		int numGroups = Integer.valueOf(br.readLine());
		String[] groups = new String[numGroups];
		for(int i = 0; i < numGroups; i++)
		{
			groups[i] = br.readLine();
		}
		// groups = split(groups, numGroups);

		int vio = 0;
		for(int i = 0; i < numGroups; i++)
		{
			String[] tempGroup = groups[i].split(" ");

			for(int j = 0; j < x; j++)
			{
				String[] tempXCon = xArr[j].split(" ");
				if((Arrays.asList(tempGroup).contains(tempXCon[0]) && !Arrays.asList(tempGroup).contains(tempXCon[1]))||(Arrays.asList(tempGroup).contains(tempXCon[1])&&!Arrays.asList(tempGroup).contains(tempXCon[0]))) 
				{
					xArr[j] = "\\ \\";
					vio++;
				}
			}

			for(int j = 0; j < y; j++)
			{
				String[] tempYCon = yArr[j].split(" ");
				if(Arrays.asList(tempGroup).contains(tempYCon[0])&&Arrays.asList(tempGroup).contains(tempYCon[1])) 
				{
					yArr[j] = "\\ \\";
					vio++;
				}
			}
		}
		return vio;
	}
}

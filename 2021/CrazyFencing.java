import java.util.Scanner;

public class CrazyFencing
{
    private static int input;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        scan.nextLine();

        String[] height = scan.nextLine().split(" ");
        String[] width = scan.nextLine().split(" ");

        double area = 0;
        for(int i = 0; i < input; i++)
        {
            area += (Integer.valueOf(height[i])+Integer.valueOf(height[i+1]))/2.0*Integer.valueOf(width[i]);
        }

        System.out.println(area);

        scan.close();
    }
}
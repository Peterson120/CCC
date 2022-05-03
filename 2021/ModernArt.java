import java.util.Scanner;
import java.util.Arrays;

public class ModernArt
{
    private static String[][] board;
    private static int row;
    private static int col;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        col = scan.nextInt();

        board = new String[row][col];

        for(String[] i:board) Arrays.fill(i,"B");

        int numInput = scan.nextInt();

        scan.nextLine();

        for(int i = 0; i < numInput; i++) 
        {
            String input = scan.nextLine();
            checkInput(input);
        }
        
        check();

        scan.close();
    }

    private static void checkInput(String input)
    {
        int location = Integer.valueOf(input.substring(2))-1;
        if(input.charAt(0) == 'R')
        {
            for(int i = 0; i < col; i++)
            {
                board[location][i] = result(board[location][i]);
            }
        }
        else if(input.charAt(0) == 'C')
        {
            for(int i = 0; i < row; i++)
            {
                board[i][location] = result(board[i][location]);
            }
        }
    }

    private static String result(String input)
    {
        if(input.equals("B")) return "G";
        return "B";
    }

    private static void check()
    {
        int result = 0;
        for(String[] i:board)
        {
            for(String j:i) 
            {
                if(j.equals("G")) result ++;
            }
        }
        System.out.println(result);
    }
}

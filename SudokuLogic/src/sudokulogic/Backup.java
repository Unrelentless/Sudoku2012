/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sudokulogic;

/**
 *
 * @author bory1
 */
public class Backup {
public static void solve()
    {
        for(int i=0;i<=22;i++)
        {
            int number = (int)(Math.random()*9);
            int row = (int)(Math.random()*9);
            int column =(int)(Math.random()*9);

            if(row<=2 && column<=2)
            {
                square = 1;
            }
            if(row<=2 && column>=3 && column<=5)
            {
                square = 2;
            }
            if(row<=2 && column>=6 && column<=8)
            {
                square = 3;
            }
            if(row>=3 && row<=5 && column<=2)
            {
                square = 4;
            }
            if(row>=3 && row<=5 && column>=3 && column<=5)
            {
                square = 5;
            }
            if(row>=3 && row<=5 && column>=6 && column<=8)
            {
                square = 6;
            }
            if(row>=6 && row<=8 && column<=2)
            {
                square = 7;
            }
            if(row>=6 && row<=8 && column>=3 && column<=5)
            {
                square = 8;
            }
            if(row>=6 && row<=8 && column>=6 && column<=8)
            {
                square = 9;
            }

            if(grid[row][column] == 0)
            {
                if(check(number, row, column, square) == true)
                {
                    grid[row][column] = number;
                }
            }
        }



        for(int i=0;i<=8;i++)
        {
            for(int j=0;j<=8;j++)
            {
                System.out.print("|"+grid[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("");

        finish();

    }
    public static void finish()
    {
        for(int i=0;i<=8;i++)
        {
            for(int j=0;j<=8;j++)
            {

                if(i<=2 && j<=2)
                {
                    square = 1;
                }
                if(i<=2 && j>=3 && j<=5)
                {
                    square = 2;
                }
                if(i<=2 && j>=6 && j<=8)
                {
                    square = 3;
                }
                if(i>=3 && i<=5 && j<=2)
                {
                    square = 4;
                }
                if(i>=3 && i<=5 && j>=3 && j<=5)
                {
                    square = 5;
                }
                if(i>=3 && i<=5 && j>=6 && j<=8)
                {
                    square = 6;
                }
                if(i>=6 && i<=8 && j<=2)
                {
                    square = 7;
                }
                if(i>=6 && i<=8 && j>=3 && j<=5)
                {
                    square = 8;
                }
                if(i>=6 && i<=8 && j>=6 && j<=8)
                {
                    square = 9;
                }

                for(int k=1;k<=9;k++)
                {
                    if(grid[i][j] == 0)
                    {
                        if(check(k, i, j, square) == true)
                        {
                            grid[i][j] = k;
                        }
                    }
                }
            }
        }

        for(int i=0;i<=8;i++)
        {
            for(int j=0;j<=8;j++)
            {
                System.out.print("|"+grid[i][j] + "|");
            }
            System.out.println("");
        }
    }
}

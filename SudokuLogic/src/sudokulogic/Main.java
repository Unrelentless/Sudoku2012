/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sudokulogic;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author bory1
 */
public class Main extends JApplet {

    /**
     * @param args the command line arguments
     */
        static int[][] grid = new int[9][9];
        static int squareRow;
        static int squareCol;
        static List<Integer> firstList = new ArrayList();
        static int[] firstArray = new int[9];
        static int square = 0;


    public static void main(String[] args) {

        for(int i=1;i<=9;i++)
        {
            firstList.add(i);
        }

        System.out.println(firstList);
        Collections.shuffle(firstList);
        System.out.println(firstList);

        for(int i=0;i<=8;i++)
        {
            firstArray[i] = firstList.get(i);
        }

        for(int i=0;i<=8;i++)
        {
            System.out.print(firstArray[i]);
        }

            System.out.println("");

            createGrid();
    }

    public static void createGrid()
    {
        for(int i=0;i<=8;i++)
        {
            grid[0][i] = firstArray[i];
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

            solve();
    }

    public static boolean check(int number, int row, int column, int square)
    {
        switch(square)
        {
            case 1:
            squareRow = 0;
            squareCol = 0;
            break;
            case 2:
            squareRow = 0;
            squareCol = 3;
            break;
            case 3:
            squareRow = 0;
            squareCol = 6;
            break;
            case 4:
            squareRow = 3;
            squareCol = 0;
            break;
            case 5:
            squareRow = 3;
            squareCol = 3;
            break;
            case 6:
            squareRow = 3;
            squareCol = 6;
            break;
            case 7:
            squareRow = 6;
            squareCol = 0;
            break;
            case 8:
            squareRow = 6;
            squareCol = 3;
            break;
            case 9:
            squareRow = 6;
            squareCol = 6;
            break;
        }

        for(int i=0;i<=8;i++)
        {
            if(number == grid[row][i])
            {
                return false;
            }
        }

        for(int i=0;i<=8;i++)
        {
            if(number == grid[i][column])
            return false;
        }

        for(int i=squareRow;i<=squareRow+2;i++)
        {
            for(int j=squareCol;j<=squareCol+2;j++)
            {
                if(number == grid[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solve()
    {
        for(int i=1;i<=2;i++)
        {
            int m = 0;

            for(int j=0;j<=2;j++)
            {
                grid[i][j] = grid[i-1][j+3];
            }

            for(int k=3;k<=5;k++)
            {
                grid[i][k] = grid[i-1][k+3];
            }

            for(int l=6;l<=8;l++)
            {
                grid[i][l] = grid[i-1][m+(l-6)];
            }
        }

        for(int i=3;i<=8;i++)
        {
            int m = 0;

            for(int j=0;j<=2;j++)
            {
                grid[i][j] = grid[i-3][j+1];
            }

            for(int k=3;k<=5;k++)
            {
                grid[i][k] = grid[i-3][k+1];
            }

            for(int l=6;l<=8;l++)
            {
                if(l==8)
                {
                    grid[i][l] = grid[i-3][0];
                    break;
                }

                grid[i][l] = grid[i-3][l+1];
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
            }
    

}

import java.util.Scanner;
// 1.Approch transpose the array
// 2. reverse row wise
// note : array.length = row length...array[i].length also row length;

public class RotateMatrix90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        rotateMatrix(array,n);
        reverseRow(array,n);

        for(int elements[] : array)
        {
            for(int x : elements)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
    public static void rotateMatrix(int[][] array,int n)//transpose the array
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
    public static void reverseRow(int[][] array,int n)//reverse row wise to get 90 rotate
    {
        for(int x=0;x< array.length;x++)
        {
            int i = 0,j=array[x].length-1;
            while(i<j)
            {
                int temp = array[x][i];
                array[x][i] = array[x][j];
                array[x][j] = temp;
                i++;j--;
            }
        }
    }
}
/*You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
PS: You aren't allowed to create an additional array
Input
[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]

Output
[
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 ]*/

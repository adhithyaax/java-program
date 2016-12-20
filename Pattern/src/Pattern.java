import java.util.*;
class Pattern
{
public static int[][] create(int size) {
int[][] matrix = new int[size][size];
for(int i = 0; i < size; i++)
for(int j = 0; j < size; j++)
matrix[i][j] = (i == j) ? 1 : 0;
return matrix;
}

public static void main(String[] args) 
{
Scanner input=new Scanner(System.in);
System.out.println("Enter size of matrix: ");
int size=input.nextInt();
int matrix[][]=create(size);

for (int i=0 ; i < matrix.length ; i++)
{ System.out.println();
for (int j=0 ; j < matrix[i].length ; j++){
System.out.print(matrix[i][j]+" ");
}
}
}
}
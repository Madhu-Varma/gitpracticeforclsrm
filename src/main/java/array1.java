class array1
{
public static void main(String args[])
{
int j,i;
int a[][]=new int[2][3];
a[0][0]=10;
a[1][2]=9;
System.out.println("values of amatrix...\n");
for(i=0;i<2;i++)
{
	for(j=0;j<3;j++)
	{
System.out.print("\t"+a[i][j]);
	}
	System.out.println("\n");
	}
}
}
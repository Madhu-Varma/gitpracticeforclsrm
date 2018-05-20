class array3
{ 
public static void main (String avg[])
{
int a [][]=new int [3][];
a[0]=new int [2];
a[1]=new int[7];
a[2]=new int[10];
int k=1;
for (int i=0;i<3;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=(k*10);
k++;
System.out.println("\t"+a[i][j]);
}
System.out.print("\t");
}
}
}



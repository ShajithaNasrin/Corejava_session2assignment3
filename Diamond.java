class Diamond
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number of rows. ");
n =Integer.parseInt(System.console().readLine());
int i;

int c;
for(i=1;i<=n;i++)        // FOR LOOP FOR NUMBER OF ROWS
{
c= 97;
for(int j=i;j<n;j++)        // FOR LOOP FOR PRINTING SPACES
{
System.out.print(" ");
}
for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
{
System.out.print((char)c);
++c;
}
c-=2;
for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
{
System.out.print((char)c);
--c;
}
System.out.println();
}    					// INTRODUCING NEW LINE
for(int m=n;m>1;m--)
{
for(int j=n;j>=m;j--)        // FOR LOOP FOR PRINTING SPACES
{
System.out.print(" ");
}
c= 97;
for(int l=1;l<m-1;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER
{
System.out.print((char)c);
++c;
}
for(int k=1;k<m;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER  
{
System.out.print((char)c);
--c;
}
c-=2;
System.out.println();
}

} // end of main method
}
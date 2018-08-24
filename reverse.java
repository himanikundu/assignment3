import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int temp,r=0,rev=0;

        temp=n;
        while(temp!=0)
        {
      		r = temp%10;
      		rev = rev*10 + r;
      		temp = temp/10;
        }

        System.out.println("The reverse number " +rev);
	}
}
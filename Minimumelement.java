public class Minimumelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of element in array");
		int n=sc.nextInt();
		System.out.println("Enter the number");
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("The Minimum number in array is:"+min);
        sc.close();
	}

}

public class Maximumelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements in array");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int j=0;j<n;j++)
		{
				if(max<a[j])
				{
					max=a[j];
				}
			
			
		}
		System.out.println("The maximum number in array is:"+max);
		sc.close();

	}

}

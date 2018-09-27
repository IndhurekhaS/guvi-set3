public class Medianelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int [n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();    
    } 
	 Arrays.sort(a);
	 int median=0;
	for(int i=0;i<n;i++)
	{
		if(n%2==0)
		{
			median=(a[(n-1)/2] + a[(n/2)]);	
		}
		else
		{
			median=(a[n/2]);
		}
	}
	System.out.println(median);
	sc.close();
	}
}

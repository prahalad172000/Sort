
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,16,32,5,10,12,24,43,22,11};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }

	}

}

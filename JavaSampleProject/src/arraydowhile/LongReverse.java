package arraydowhile;

public class LongReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[]= {2,4,6,8,10,12,14};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);
	}

}

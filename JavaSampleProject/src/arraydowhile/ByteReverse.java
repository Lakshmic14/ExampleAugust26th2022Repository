package arraydowhile;

public class ByteReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a[]= {0,1,2,3,4};
		int i=a.length-1;
		do
		{
			System.out.println(a[i]);
			i--;
		}while(i>=0);
	}

}

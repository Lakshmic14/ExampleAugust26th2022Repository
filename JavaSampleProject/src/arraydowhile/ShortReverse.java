package arraydowhile;

public class ShortReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short arr[]= {1,3,5,7,9,11};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);
	}

}

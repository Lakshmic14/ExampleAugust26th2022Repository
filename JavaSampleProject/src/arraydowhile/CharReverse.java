package arraydowhile;

public class CharReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'l','m','n','o'};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);
	}

}

package arraydowhile;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"hello world","java programming"};
		int i=s.length-1;
		do
		{
			System.out.println(s[i]);
			i--;
		}while(i>=0);
	}

}

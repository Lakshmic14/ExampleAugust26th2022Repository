package arraydowhile;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"hello world","welcome to java programing"};
		int i=0;
		do
		{
			System.out.println(s[i]);
			i++;
		}while(i<s.length);
	}

}

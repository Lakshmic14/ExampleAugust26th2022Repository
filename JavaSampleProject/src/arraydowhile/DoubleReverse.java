package arraydowhile;

public class DoubleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]=new double[] {100,200,300,400,500};
		int i=a.length-1;

		do
		{
			System.out.println(a[i]);
			i--;
		}while(i>=0);
	}

}

package arraywhileassignmets;

public class DoubleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]=new double[] {100,200,300,400,500};
		int i=a.length-1;

		while(i>=0)
		{
			System.out.println("Element at Index : "+ i + " " + a[i]);
			i--;
		}
	}

	}



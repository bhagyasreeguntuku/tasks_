package lambdathread;


@FunctionalInterface
interface good
{
	public void display(int...num);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		good g=(num)->{
			int sum=0;
			for(int  i:num)
			{
				sum=sum+i;
				
			}
			System.out.println(sum);
		};
		g.display(12,78,45,23);
		g.display(12,78,45,23,11);
	}
	}


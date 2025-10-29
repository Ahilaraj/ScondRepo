package tasksuperkeyword;

public class Childsum extends Parentsum{
	public void divisibleCheck()
	{
		int result = super.sum(1,20);
		if(result % 10 ==0)
		{
			System.out.println("result is divisble by 10");
		}
		else
		{
			System.out.println("not result is divisble by 10");
		}
	}
	public static void main(String[] args) {
		Childsum cs = new Childsum();
		cs.divisibleCheck();
		

	}

}

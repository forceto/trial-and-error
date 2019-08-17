package crazyJava.chapter4;

public class TestContinueOuter {
	public TestContinueOuter()
	{
		outer:
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("i的值为："+i+"\t"+"j的值为："+j);
				if(j==1)
					continue outer;
			}
		}
	}
}
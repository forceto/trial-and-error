package chapter4;

public class TestArray {
	public TestArray()
	{
		//��̬��ʼ��
		int[] price={11,12,53,14,15};
		String[] book={"Alice","Bruce","Customer","Docker","Effol"};
		/*��̬��ʼ��*/
		int[] number=new int[5];
		Object[] bookvolume=new Object[5];
		number=price;
		bookvolume=book;
		/**	foreach ѭ��,Ҳ������ǿ��forѭ��*/
		for(int shuzi : number)
		{
			System.out.println(shuzi+"\n");
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("this is :"+book[i]);
		}
	}
}




















package chapter5;

public class Printer implements Output,Product{
	private String[] printData=new String[MAX_CACHE_LINE];
	//��¼��ǰ��Ҫ��ӡ����ҵ��
	private int dataNum=0;

	@Override
	public int getProductTime() {
		return 45;
	}

	@Override
	public void out() {
		//�о����
		while(dataNum>0){
			//ÿ�ζ���ͷ��ʼ�����ͷ�����������ǰŲһ��λ�ã�ͷ������
			System.out.println("printer:"+printData[0]);
			//system.arraycopy()�������飬�����Լ����Լ�����
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override						
	public void getData(String msg) {
		if(dataNum>=MAX_CACHE_LINE){
			System.out.println("queue is full");
		}
		else{
			printData[dataNum++]=msg;
		}
	}
	
}

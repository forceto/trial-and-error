package chapter5;

public class Printer implements Output,Product{
	private String[] printData=new String[MAX_CACHE_LINE];
	//记录当前需要打印的作业数
	private int dataNum=0;

	@Override
	public int getProductTime() {
		return 45;
	}

	@Override
	public void out() {
		//有就输出
		while(dataNum>0){
			//每次都从头开始输出，头输出后，整体往前挪一个位置，头被换掉
			System.out.println("printer:"+printData[0]);
			//system.arraycopy()复制数组，可以自己给自己复制
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

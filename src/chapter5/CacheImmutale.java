package chapter5;
// ���ɱ��࣬�������
public class CacheImmutale {
	private static int MAX_SIZE=10;
	//�����黺�����е�ʵ��
	private static CacheImmutale[] cache=new CacheImmutale[MAX_SIZE];
	//��¼λ��
	private static int pos=0;
	private final String name;
	//constructor
	private CacheImmutale(String name){
		this.name=name;
	}
	public String  getName(){
		return name;
	}
	public static CacheImmutale valueOf(String name){
		//�����ѻ����ʵ��
		for(int i=0;i<MAX_SIZE;i++){
			//���Ѿ��У���������е�
			if(cache[i]!=null && cache[i].getName().equals(name)){
				return cache[i];
			}
		}
		//����������,�����Ƚ��ȳ��滻
		if(pos==MAX_SIZE){
			cache[0]=new CacheImmutale(name);
			pos=1;
		}
		else{
			cache[pos++]=new CacheImmutale(name);
		}
		return cache[pos-1];
	}
	public boolean equals(Object object){
		if(this==object){
			return true;
		}
		if(object!=null && object.getClass()==CacheImmutale.class){
			CacheImmutale ci=(CacheImmutale)object;
			return name.equals(ci.getName());
		}
		return false;
	}
	public int hashCode(){
		return name.hashCode();
	}
	public static void show(){
		for(CacheImmutale arr:cache ){
			System.out.println(arr.getName());
		}
	}
}

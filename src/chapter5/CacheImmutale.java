package chapter5;
// 不可变类，缓存机制
public class CacheImmutale {
	private static int MAX_SIZE=10;
	//用数组缓存已有的实例
	private static CacheImmutale[] cache=new CacheImmutale[MAX_SIZE];
	//记录位置
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
		//遍历已缓存的实例
		for(int i=0;i<MAX_SIZE;i++){
			//若已经有，则输出已有的
			if(cache[i]!=null && cache[i].getName().equals(name)){
				return cache[i];
			}
		}
		//若缓存已满,按照先进先出替换
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

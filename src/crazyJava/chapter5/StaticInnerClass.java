package crazyJava.chapter5;


public class StaticInnerClass {
	private int p1=1;
	private static int p2=2;
	
	static private class Inner{
		private static int a1=11;
		private int a2=22;
		public void accessOut(){
			System.out.println(p2);
			
		}
	}
	class In{
		public In(String s){
			System.out.println(s);
		}
	}
	public void StaticInnerClass(){
		new Inner().accessOut();
		System.out.println("a1="+Inner.a1);
		System.out.println("a2="+new Inner().a2);
	}
}			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				


package chapter5;

public class Person {
	private String name;
	private String idstr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdstr() {
		return idstr;
	}
	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}
	public Person(String name)
	{
		this.name=name;
		this.idstr=null;
	}
	public Person(String name,String idstr) {
		this.idstr=idstr;
		this.name=name;
	}
	//toString() 用于类的自我描述
	public String toString()
	{
		return "name:"+name;
	}
	//重写equals（）方法
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj!=null && obj.getClass()==Person.class)
		{
			Person p=(Person)obj;
			if(this.getIdstr()==p.getIdstr())
			{
				return true;
			}
		}
		return false;
	}
	final public void testFinal(){
		System.out.println("try to override me uhhh... ");
	}
}
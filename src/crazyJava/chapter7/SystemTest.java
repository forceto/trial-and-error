package crazyJava.chapter7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
	public SystemTest() throws FileNotFoundException, IOException{
		//get information which is about system
		Map<String,String> env=System.getenv();
		for(String name:env.keySet()){
			System.out.println(name+"---->"+env.get(name));
		}
		//get environment variable
		System.out.println(System.getenv("JAVA_HOME"));
		//store in file
		Properties props=System.getProperties();
		props.store(new FileOutputStream("props.txt"), "System Properties");
		System.out.println(System.getProperty("os.name"));
	}
}

package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ReadFromProperties {

	public String readFromPropertiesString(String Key) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		File src = new File("./configuration.properties");
		FileInputStream io = new FileInputStream(src);
		String help = "./configuration.properties";
		Reader re = new FileReader("./configuration.properties");
		System.out.println(io);
		Properties prop = new Properties();
		Properties prop1 = new Properties();
		prop.load(io);
		System.out.println("prop to print name" + prop.getProperty("name"));

		prop1.load(re);
		Integer i= re.read();
		System.out.println(re.ready()+i.toString());
		
		System.out.println("prop to print name" + prop1.getProperty("name"));
		re.close();
		io.close();
		String name=prop1.getProperty(Key);
		return name;

	}

}

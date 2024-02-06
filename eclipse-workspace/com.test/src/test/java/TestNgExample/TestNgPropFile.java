package TestNgExample;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.ReadFromProperties;

public class TestNgPropFile {

	@Test
	public void readingPropFile() throws IOException {
		
		ReadFromProperties prop = new ReadFromProperties();
		
		String Name=prop.readFromPropertiesString("age");
		System.out.println(Name);
	}

}

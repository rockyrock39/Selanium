package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

public class ReadFromXmlFile {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub
		File src = new File("./objRepository.xml");
		FileInputStream io = new FileInputStream(src);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(io);
	}

}

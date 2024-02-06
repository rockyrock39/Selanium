package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFilefromexecl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("./document.xlsx");
		FileInputStream io = new FileInputStream(src);
		XSSFWorkbook exel = new XSSFWorkbook(io);
	}

}

package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadFromCsvexzmple {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		CSVReader name = new CSVReader(new FileReader("./csvexample.csv"));
		List<String[]> li=name.readAll();
		
		Iterator<String[]> iterate = li.iterator();
		
		System.out.println(iterate);
		
		while (iterate.hasNext()) {
			
			String[] str=iterate.next();
			System.out.println("Valuse are ");
			
			for (int i=0;i<str.length;i++ )
			{
			System.out.println(str[i]);	
			}
			
		}

	}

}

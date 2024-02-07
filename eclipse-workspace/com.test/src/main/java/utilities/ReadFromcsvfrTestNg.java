package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromcsvfrTestNg {
	BufferedReader br;

	public Object[][] readCsvFile(String csvfile) throws IOException {
		String line = "";
		String commalmt = ",";
		List<Object[]> data = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(csvfile));
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(commalmt);
				data.add(arr);

			}

		} finally {
			if (br != null) {
				br.close();
			}
		}
		return data.toArray(new Object[0][]);

		// return data;

	}
}

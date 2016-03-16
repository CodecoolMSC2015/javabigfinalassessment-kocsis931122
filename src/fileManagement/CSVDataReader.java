package fileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import persons.Person;

public abstract class CSVDataReader extends DataReader {
	String csvFilePath;
	private Set<Person> setPersons = new HashSet<Person>();

	public CSVDataReader(String csvFilePath) {
		csvFilePath = "C:\\dev\\bfa\\javabigfinalassessment-kocsis931122\\persons.csv";
		BufferedReader br = null;

		try {
			String lineByLine;
			br = new BufferedReader(new FileReader(csvFilePath));

			while ((lineByLine = br.readLine()) != null) {
				System.out.println("Raw CSV data: " + lineByLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Set<Person> getPersons() {
		return setPersons;
	}

}

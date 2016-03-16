package fileManagement;

import java.util.HashSet;
import java.util.Set;

import persons.Person;
import persons.SearchType;

public class DataReader {

	String searchCriteria;
	SearchType searchType;
	private Set<Person> setPersons = new HashSet<Person>();

	public Set<Person> getPersons() {
		return setPersons;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}

}

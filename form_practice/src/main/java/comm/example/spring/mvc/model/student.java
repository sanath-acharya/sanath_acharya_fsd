package comm.example.spring.mvc.model;

import java.util.LinkedHashMap;

public class student {
	private String firstName;
	private String lastname;
	private String contry;
	private LinkedHashMap<String,String> countryOption;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	public student() {
		countryOption=new LinkedHashMap<>();
		countryOption.put("BR", "brazil");
		countryOption.put("FR", "France");
		countryOption.put("DE", "Germany");
		countryOption.put("IN", "India");
		countryOption.put("US", "United States of America");		

	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(LinkedHashMap<String, String> countryOption) {
		this.countryOption = countryOption;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

}

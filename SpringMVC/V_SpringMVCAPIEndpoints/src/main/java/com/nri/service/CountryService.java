package com.nri.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.nri.bean.Country;

/*
	Its is just a helper class which should be replaced with the actual database Implementation
*/

public class CountryService {

	static HashMap<Integer,Country> cIdMapCol;
	
	public CountryService() {
	
		if(cIdMapCol == null) {
			
			cIdMapCol = new HashMap<Integer,Country>();
			
			Country cobjone = new Country(11,"India",10000);
			Country cobjtwo = new Country(12,"UK",50000);
			Country cobjthree = new Country(13,"China",70000);
			Country cobjfour = new Country(11,"Russia",80000);
			
			cIdMapCol.put(1, cobjone);
			cIdMapCol.put(2, cobjtwo);
			cIdMapCol.put(3, cobjthree);
			cIdMapCol.put(4, cobjfour);
			
			
		}
	}
	public List<Country> getAllCountries(){
		List<Country> countries = new ArrayList<Country>(cIdMapCol.values());
		return countries;
	}
	
	public Country getCountry(int countryid) {
		
		Country c = cIdMapCol.get(countryid);
		return c;
	}
	
	public Country addCountry(Country country) {
		
		country.setCid(getMaxId());
		cIdMapCol.put(country.getCid(), country);
		return country;
	}
	
	public Country updateCountry(Country country) {
		
		if(country.getCid() <= 0) {
			return null;
		}
		cIdMapCol.put(country.getCid(), country);
		
		return country; 
	}
	
	public void deleteCountry(int countryid) {
		cIdMapCol.remove(countryid);
	}
	
	// An utility method
	public static int getMaxId() {
		int max = 0;
		
		for(int cnid: cIdMapCol.keySet()) {
			
			if(max <= cnid) {
				max = cnid;
			}
		}
		
		return max;
	}
	
	public static HashMap<Integer,Country> getCountryIdMap(){
		return cIdMapCol;
	}
}
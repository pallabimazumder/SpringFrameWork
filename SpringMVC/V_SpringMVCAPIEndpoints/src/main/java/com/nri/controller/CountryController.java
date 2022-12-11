package com.nri.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nri.bean.Country;
import com.nri.service.CountryService;

@RestController
public class CountryController {

	CountryService countryService = new CountryService();
	
	@RequestMapping(value="/countries",method = RequestMethod.GET)
	@ResponseBody
	public List<Country> getAllCountries(){
		return countryService.getAllCountries();
	}
	
	@RequestMapping(value="/country/{cid}",method = RequestMethod.GET)
	@ResponseBody
	public Country getCountryById(@PathVariable int cid){
		return countryService.getCountry(cid);
	}
	
	@RequestMapping(value="/country",method = RequestMethod.POST)
	@ResponseBody
	public Country addCountry(@RequestBody Country country){
		return countryService.addCountry(country);
	}
	
	@RequestMapping(value="/country",method = RequestMethod.PUT)
	@ResponseBody
	public Country updateCountry(@RequestBody Country country){
		return countryService.addCountry(country);
	}
	
	@RequestMapping(value="/country/{cid}",method = RequestMethod.DELETE)
	@ResponseBody
	public void delCountryById(@PathVariable("cid") int cid){
		countryService.deleteCountry(cid);
	}
	
}

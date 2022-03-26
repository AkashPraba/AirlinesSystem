package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.City;

public interface CityService {
	
		public abstract City addCity(City c);
		
		public abstract City findCityById(int cityId);
		
		public List<City> listAllCity();

}

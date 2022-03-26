package com.lti.AIRLINERESERVATIONSYSTEM.dao;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.City;

	public interface CityDao {
	
	public abstract City addCity(City c);
	
	public abstract City findCityById(int cityId);
	
	public List<City> listAllCity();
}

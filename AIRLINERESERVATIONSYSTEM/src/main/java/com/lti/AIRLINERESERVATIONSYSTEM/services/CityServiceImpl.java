package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.City;
import com.lti.AIRLINERESERVATIONSYSTEM.dao.CityDao;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	CityDao dao;

	public CityDao getDao() {
		return dao;
	}

	public void setDao(CityDao dao) {
		this.dao = dao;
	}

	@Override
	public City addCity(City c) {
		return dao.addCity(c);
	}

	@Override
	public City findCityById(int cityId) {
		City c = dao.findCityById(cityId);
		return c;
	}

	@Override
	public List<City> listAllCity() {
		List<City> city = dao.listAllCity();
		return city;
	}

}

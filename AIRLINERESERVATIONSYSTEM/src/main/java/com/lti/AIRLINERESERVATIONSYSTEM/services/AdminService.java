package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Admin;

public interface AdminService {
	
	public abstract int addAdmin(Admin admin);
	
	public abstract Admin findAdminById(int adminId);
	
	public List<Admin> listAllAdmin();
	
	public abstract int updateAdmin(int adminId, String adminName);
	
	public abstract int deleteById(int adminId);


}

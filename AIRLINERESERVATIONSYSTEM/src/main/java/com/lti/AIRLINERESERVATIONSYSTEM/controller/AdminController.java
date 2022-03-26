package com.lti.AIRLINERESERVATIONSYSTEM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Admin;
import com.lti.AIRLINERESERVATIONSYSTEM.services.AdminServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminServiceImpl adminService;
	
	@Autowired
	
	//http://localhost:8090/admin/admins
	//http://localhost:8090/admin/admins
	@GetMapping("/admins")
	public List<Admin> listAllAdmin()
	{
		return adminService.listAllAdmin();
	}

	//http://localhost:8090/admin/adminById/11
	@GetMapping("/adminById/{id}")
	public Admin findAdminById(@PathVariable(value = "id")int adminId)
	{
		Admin a = null;
		a = adminService.findAdminById(adminId);
		return a;
	}
	
	//http://localhost:8090/admin/addAdmin
		@PostMapping("/addAdmin")
		public int addAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);	
		}
		
}

		
		
		

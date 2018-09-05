package com.gccoffeeshop.SpringLab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gccoffeeshop.SpringLab.entity.Users;

@Repository
public class UsersDao {
	// we need to use JdbcTemplate to execute a query
		@Autowired // use Spring to autowire it
		JdbcTemplate jdbcTemplate;
		
		public List<Users> findAll() {
			return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));
		}
		
		public int insertUser(String fName, String lName, String email, String phone, String username, String password) {
			String insertQuery = "INSERT INTO users(FirstName, LastName, Email, PhoneNumber, Username, Password)"
					+ " values(?,?,?,?,?,?)";
			return jdbcTemplate.update(insertQuery, fName, lName, email, phone, username, password);
		}

}

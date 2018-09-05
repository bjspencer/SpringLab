package com.gccoffeeshop.SpringLab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gccoffeeshop.SpringLab.entity.Items;

@Repository
public class ItemsDao {
	// we need to use JdbcTemplate to execute a query
	@Autowired // use Spring to autowire it
	JdbcTemplate jdbcTemplate;

	public List<Items> findAll() {
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
	}

	public int updateItem(String name) {
		String updateQuery = "UPDATE items SET name=?";
		return jdbcTemplate.update(updateQuery, name);
	}
}

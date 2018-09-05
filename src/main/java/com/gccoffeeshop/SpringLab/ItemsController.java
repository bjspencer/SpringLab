package com.gccoffeeshop.SpringLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gccoffeeshop.SpringLab.dao.ItemsDao;

@Controller
public class ItemsController {

	@Autowired
	ItemsDao dao;
	
	@RequestMapping("/viewitems")
	public ModelAndView itemsPage() {
		return new ModelAndView("viewitems", "items", dao.findAll());
	}
	
	@RequestMapping("/updateform")
	public ModelAndView updateCust(@RequestParam("name") String n, @RequestParam("description") String des, @RequestParam("price") String price) {
		dao.updateItem(n, des, price);
		return new ModelAndView("updateform", "items", dao.findAll());
	}
}


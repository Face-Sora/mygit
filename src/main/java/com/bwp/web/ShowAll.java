package com.bwp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bwp.pojo.Cat;
import com.bwp.service.CatService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ShowAll {

	@Autowired
	CatService cs;
	
	@RequestMapping("show")
	public ModelAndView showAll(@RequestParam(value="pn",defaultValue = "1")int pn) {
		
		
		PageHelper.startPage(pn, 3);
		List<Cat> all = cs.showAll();
		
		PageInfo pi = new PageInfo(all,5);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list");
		mv.addObject("allCat", pi);
		return mv;
	}
}

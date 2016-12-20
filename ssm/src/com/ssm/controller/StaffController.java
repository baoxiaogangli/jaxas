package com.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ssm.pojo.Staff;
import com.ssm.service.StaffService;

import com.ssm.util.Pager;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;





@Controller
public class StaffController {
	 @Resource(name = "staffService")
	  private StaffService staffService;
	 
	 @RequestMapping("staffController_list")
	  public void list(@RequestParam(value = "page", required = true) Integer page,
	      @RequestParam(value = "rows", required = true) Integer rows,
	      @RequestParam(value = "sort", required = true) String sort,
	      @RequestParam(value = "order", required = true) String order,
	      HttpServletResponse response  ) {

	  
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;

	    Pager<Staff> pager = staffService.list(pageno, pagesize, sort, order);

	 

	    JSON json = JSONSerializer.toJSON(pager);

	    try {
	    	 PrintWriter out = response.getWriter();
	      out.println(json.toString());
	      out.flush();
	      out.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	}
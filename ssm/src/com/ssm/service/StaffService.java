package com.ssm.service;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.ssm.dao.StaffMapper;
import com.ssm.pojo.Staff;
import com.ssm.util.Pager;



@Service("staffService")
public class StaffService {
	@Resource (name = "staffMapper")
	
	private StaffMapper staffMapper;

public Pager<Staff> list(Integer pageno, Integer pagesize, String sort, String order) {
	    Pager<Staff> pager = new Pager<Staff>();
	    pager.setRows(staffMapper.find(pageno, pagesize, sort, order));
	    
	    return pager;
	  }

}

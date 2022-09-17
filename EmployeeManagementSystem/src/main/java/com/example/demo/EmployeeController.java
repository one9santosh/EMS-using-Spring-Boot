package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
@Autowired
	EmployeeDAO dao;
Logger log=Logger.getAnonymousLogger();
@RequestMapping("insert")
public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String fname=req.getParameter("fname");
	String age=req.getParameter("age");
	String dob=req.getParameter("dob");
	String address=req.getParameter("address");
	String number=req.getParameter("number");
	String jobpost=req.getParameter("jobpost");
	ModelAndView mv=new ModelAndView();
	Employee s=new Employee();
	s.setId(id);
	s.setName(name);
	s.setFathername(fname);
	s.setAge(age);
	s.setDob(dob);
	s.setAddress(address);
	s.setNumber(number);
	s.setJobpost(jobpost);
	Employee sd=dao.insert(s);
	log.info("insert method called successfully");
	if(sd!=null) {
		log.info("sucessful student insertion");
		mv.setViewName("success.jsp");
	}
	
	return mv;
}
@RequestMapping("update")
public ModelAndView update(HttpServletRequest req,HttpServletResponse res) {
	String name=req.getParameter("name");
	String fname=req.getParameter("fname");
	String age=req.getParameter("age");
	String dob=req.getParameter("dob");
	String address=req.getParameter("address");
	String number=req.getParameter("number");
	String jobpost=req.getParameter("jobpost");
int id=Integer.parseInt(req.getParameter("rid"));
	
	ModelAndView mv=new ModelAndView();
	Employee ss=new Employee();
	ss.setName(name);
	ss.setFathername(fname);
	ss.setAge(age);
	ss.setDob(dob);
	ss.setAddress(address);
	ss.setNumber(number);
	ss.setJobpost(jobpost);
	ss.setId(id);
	Employee sd=dao.update(ss);
	log.info("update method called successfully");
	if(sd!=null) {
		log.info("sucessful student insertion");
		mv.setViewName("success.jsp");
	}
	
	return mv;
}
@RequestMapping("delete")
public ModelAndView delete(HttpServletRequest req,HttpServletResponse res) {
	int id=Integer.parseInt(req.getParameter("id"));	
	ModelAndView mv=new ModelAndView();
	Employee s=new Employee();
	s.setId(id);
	String sd=dao.deleteByid(id);
	if(sd!=null) {
		log.info("sucessful student insertion");
		mv.setViewName("success.jsp");
	}
	return mv;
}

@RequestMapping("getall")
public ModelAndView getemp(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<Employee> list=dao.getall();
	log.info("called getall method");
	mv.setViewName("list.jsp");
	log.info("went to jsp");
	mv.addObject("list",list);
	log.info("sent a list to the jsp");
	return mv;
}
@RequestMapping("getalld")
public ModelAndView getemployee(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<Employee> list=dao.getall();
	log.info("called getall method");
	mv.setViewName("delete.jsp");
	log.info("went to jsp");
	mv.addObject("list",list);
	log.info("sent a list to the jsp");
	return mv;
}

@RequestMapping("getallu")
public ModelAndView getemploye(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<Employee> list=dao.getall();
	log.info("called getall method");
	mv.setViewName("update.jsp");
	log.info("went to jsp");
	mv.addObject("list",list);
	log.info("sent a list to the jsp");
	return mv;
}
//@Autowired
//EmployeeRepo repo;
//@GetMapping("/employee/name")
//public ResponseEntity<List<Employee>> getEmployeeByName(@RequestParam String name){
//	
//	return new ResponseEntity<List<Employee>>(repo.findByName(name), HttpStatus.OK);
//}
@RequestMapping("findid")
public ModelAndView adtoCart(HttpServletRequest req,HttpServletResponse res, 
		@RequestParam("id") String id)
{
	ModelAndView mv = new ModelAndView();
	int cartId = Integer.valueOf(id);
	Employee emp = dao.findbyid(cartId);
	HttpSession session = req.getSession();
	session.setAttribute("findId", emp);
	mv.addObject(emp);
	mv.setViewName("find.jsp");

	
	return mv;
}


}
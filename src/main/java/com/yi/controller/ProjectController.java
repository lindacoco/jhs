package com.yi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yi.domain.ProjectVO;
import com.yi.service.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@RequestMapping(value = "/project/register",method = RequestMethod.GET)
	public String register() {
		return "/project/register";
	}
	@RequestMapping(value = "/project/register", method = RequestMethod.POST)
	public String register(ProjectVO vo) throws Exception {
		//자동으로 set함수로 주입이 된다
//        System.out.println(vo.getRegDate());
		service.create(vo);
		return "redirect:/project/list";
	}
	
	@RequestMapping(value = "/project/read", method = RequestMethod.GET)
	public String read(int no, Model model) throws Exception{  //넘어오는게 하나라서 이렇게 받음 많으면 VO로 
		ProjectVO vo = service.readByNo(no);

		service.update(vo);
		//System.out.println(vo.getViewcnt());
		model.addAttribute("project",vo);
		return "/project/read";
	}
	
	@RequestMapping(value = "/project/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		List<ProjectVO> list = service.list();
		model.addAttribute("list",list);
		return "/project/list";
	}
	
	@RequestMapping(value = "/project/update", method = RequestMethod.GET)
	public String update(int no, Model model) throws Exception{
		ProjectVO vo = service.readByNo(no);
		model.addAttribute("project",vo);
		//System.out.println(vo);
		return "/project/update";
	}

	@RequestMapping(value = "/project/update", method = RequestMethod.POST)
	public String update(ProjectVO vo) throws Exception{

	   service.update(vo);
	  // System.out.println(vo);
		return "redirect:/project/read?no="+vo.getNo();
	}
	@RequestMapping(value = "/project/delete", method = RequestMethod.GET)
	public String delete(int no) throws Exception{
		service.delete(no);
		return "redirect:/project/list";
	}
	

	

	

	
}

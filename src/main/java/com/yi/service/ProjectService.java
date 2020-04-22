package com.yi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectVO;
import com.yi.persistence.Criteria;
import com.yi.persistence.ProjectDAO;

@Service
public class ProjectService {
   
	@Autowired
	ProjectDAO dao;
	
	//등록을 위한 함수
	public void create(ProjectVO vo) throws Exception {
		dao.insert(vo);
	}
	
	public ProjectVO readByNo(int bno) throws Exception {
		return dao.readByNo(bno);
	}
	

	public void update(ProjectVO vo) throws Exception {
		dao.update(vo);
	}
	
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
	
	public List<ProjectVO> list() throws Exception {
		return dao.list();
	}
//	public List<ProjectVO> listCriteria(Criteria cri) throws Exception{
//		return dao.listCriteria(cri);
//	}
//	
//	public int totalCount() throws Exception {
//		return dao.totalCount();
//	}
}

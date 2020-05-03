package com.yi.jhs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectVO;
import com.yi.persistence.Criteria;
import com.yi.persistence.ProjectDAO;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProjectDAOTest {
    @Autowired
    private ProjectDAO dao;
    
    
    @Test
    public void testDAO() {
    	System.out.println(dao);
    }
    
    @Test
    public void test1insert() throws Exception {
    	ProjectVO vo = new ProjectVO();
    	vo.setName("관리자프로젝트");
    	vo.setContent("어쩔라미");
//    	vo.setRegDate(new Date());
//    	vo.setEndDate(new Date());
    	vo.setProgress("준비");
    	dao.insert(vo);
    }
    @Test
	public void test2ReadBoard() throws Exception{
		ProjectVO vo = dao.readByNo(3);
		System.out.println(vo);
	}
    
    @Test
	public void test3Update() throws Exception {
		ProjectVO vo = dao.readByNo(5);
		vo.setName("사탕도");

		dao.update(vo);

	}
   //  @Test
    public void test4delete() throws Exception{
    	dao.delete(2);
    }
     
    @Test
	public void test5List() throws Exception {
    	Criteria cri = new Criteria();
    	cri.setPage(2);
    	cri.setPerPageNum(5);
		dao.listCriteria(cri);
		
	}
    

    
}

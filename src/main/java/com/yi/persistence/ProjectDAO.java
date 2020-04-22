package com.yi.persistence;

import java.util.List;

import com.yi.domain.ProjectVO;


public interface ProjectDAO {
   public void insert(ProjectVO vo) throws Exception;
   public void update(ProjectVO vo)throws Exception;
   public void delete(int no)throws Exception;
   public List<ProjectVO> list()throws Exception;
   public ProjectVO readByNo(int no)throws Exception;
   public List<ProjectVO> listCriteria(Criteria cri)throws Exception;
   public int totalCount() throws Exception;
}

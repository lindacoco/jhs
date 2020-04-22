package com.yi.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjectVO;
@Repository
public class ProjectDAOImpl implements ProjectDAO {

	private static final String namespace = "mappers.ProjectMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(ProjectVO vo) throws Exception {
		sqlSession.insert(namespace+"insert",vo);
		
	}

	@Override
	public void update(ProjectVO vo) throws Exception {
		sqlSession.update(namespace+"update",vo);
	
	}

	@Override
	public void delete(int no) throws Exception {
		sqlSession.delete(namespace+"delete",no);
		
	}

	@Override
	public ProjectVO readByNo(int no) throws Exception {
		return sqlSession.selectOne(namespace+"readByNo",no);
				
	}


	@Override
	public List<ProjectVO> listCriteria(Criteria cri) throws Exception {
		return sqlSession.selectList(namespace+"listCriteria",cri);
	}

	@Override
	public int totalCount() throws Exception {
		return sqlSession.selectOne(namespace+"totalCount");
				
	}

	@Override
	public List<ProjectVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"list");
	}
	
	


}

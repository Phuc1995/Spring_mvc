package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	


	@Override
	public NewModel findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long save(NewModel newModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(NewModel updateNew) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NewModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}
}
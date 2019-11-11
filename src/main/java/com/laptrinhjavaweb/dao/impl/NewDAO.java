package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		return null;
	}

}
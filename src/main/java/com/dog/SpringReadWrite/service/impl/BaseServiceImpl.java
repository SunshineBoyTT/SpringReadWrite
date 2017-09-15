/**
 * 
 */
package com.dog.SpringReadWrite.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.dog.SpringReadWrite.entity.Account;
import com.dog.SpringReadWrite.service.BaseService;

/**
 * @Description:
 * @author zhengjuntao@hjtechcn.cn
 * @Since:2017年9月14日
 * @Version:1.1.0
 */
@Service("baseService")
public class BaseServiceImpl extends JdbcDaoSupport implements BaseService {

	/* (non-Javadoc)
	 * @see com.dog.SpringReadWrite.service.BaseService#findAccountList()
	 */
	public List findAccountList() {
		// TODO Auto-generated method stub
		StringBuffer sql=new StringBuffer();
		sql.append("select * from account");
		return super.getJdbcTemplate().queryForList(sql.toString());
	}
	
	/**
	 * 构造函数初始化
	 */
	@Autowired(required = true)
	public BaseServiceImpl(@Qualifier(value="jdbcTemplate")JdbcTemplate jdbcTemplate) {
		super();
		System.out.println("BaseServiceImpl crg 初始化");
		// TODO Auto-generated constructor stub
		this.setJdbcTemplate(jdbcTemplate);
	}

	/* (non-Javadoc)
	 * @see com.dog.SpringReadWrite.service.BaseService#saveAccount(com.dog.SpringReadWrite.entity.Account)
	 */
	@Override
	public void saveAccount() {
		// TODO Auto-generated method stub
		StringBuffer sql=new StringBuffer();
		sql.append("insert into account values(null,100,10000)");
		this.getJdbcTemplate().update(sql.toString());
	}
	
}

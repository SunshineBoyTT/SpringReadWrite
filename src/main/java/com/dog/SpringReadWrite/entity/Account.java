/**
 * 
 */
package com.dog.SpringReadWrite.entity;

import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:
 * @author zhengjuntao@hjtechcn.cn
 * @Since:2017年9月14日
 * @Version:1.1.0
 */
@Entity
@Table(name = "account")
public class Account implements java.io.Serializable {

	// Fields

	private Integer id;
	private String user;
	private Double cash;



	// Property accessors
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		id = id;
	}
	
	@Column(name = "user", nullable = false)
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name = "cash", nullable = false)
	public Double getCash() {
		return cash;
	}


}
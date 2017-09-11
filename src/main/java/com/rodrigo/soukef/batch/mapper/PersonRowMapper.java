package com.rodrigo.soukef.batch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rodrigo.soukef.batch.domain.Person;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet arg0, int arg1) throws SQLException {
		Person p = new Person();

		p.setPersonName(arg0.getString("person_name"));
		p.setSalary(arg0.getBigDecimal("salary"));

		return p;
	}

}

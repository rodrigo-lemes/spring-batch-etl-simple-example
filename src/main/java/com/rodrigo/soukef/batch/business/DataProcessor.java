package com.rodrigo.soukef.batch.business;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.rodrigo.soukef.batch.domain.Person;

@Service
public class DataProcessor implements ItemProcessor<Person, Person> {

	public Person process(Person arg0) throws Exception {
		arg0.setSalary(new BigDecimal(arg0.getSalary().doubleValue() / 2));
		return arg0;
	}

}

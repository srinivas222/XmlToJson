package com.example.process;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.Unmarshaller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.dataformat.xstream.XStreamDataFormat;

import com.example.domain.Customer;
import com.example.domain.Customers;

public class InsertProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		
		Customer customer = (Customer) exchange.getIn().getBody();
		System.out.println(customer);
		exchange.getIn().setHeader("id", customer.getCid());
		exchange.getIn().setHeader("name", customer.getCname());
		exchange.getIn().setHeader("email", customer.getEmail());
		exchange.getIn().setHeader("location", customer.getLocation());
		
		
		
		

	}

}

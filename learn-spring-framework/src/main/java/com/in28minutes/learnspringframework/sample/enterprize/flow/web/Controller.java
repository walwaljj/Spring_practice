package com.in28minutes.learnspringframework.sample.enterprize.flow.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprize.flow.business.BusinessService;

//html , xml 등 형식에 맞춰 반응 후 전송하는 클레스
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	//URL에 "/sum"이 입력되면 100 이 반환되는 로직.
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}





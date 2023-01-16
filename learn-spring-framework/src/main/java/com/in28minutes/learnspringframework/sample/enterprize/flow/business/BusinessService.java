package com.in28minutes.learnspringframework.sample.enterprize.flow.business;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprize.flow.data.DataService;

@Component
//비지니스 로직 클레스
public class BusinessService{
	
	@Autowired	
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();//reduce(Integer::sum) : 이용해 모든 값을 하나의 값(sum)으로 변경.
	}
}
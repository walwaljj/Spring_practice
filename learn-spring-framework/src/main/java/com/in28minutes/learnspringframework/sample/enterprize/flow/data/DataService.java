package com.in28minutes.learnspringframework.sample.enterprize.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
//DB를 저장하고 가져오는 클레스
public class DataService{
	public List<Integer> retrieveData(){
		return Arrays.asList(12,34,56,78,90);
	}
}
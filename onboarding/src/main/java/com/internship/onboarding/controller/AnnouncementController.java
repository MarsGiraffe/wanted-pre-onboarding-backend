package com.internship.onboarding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.internship.onboarding.service.AnnouncementService;
import com.internship.onboarding.vo.Announcement;

@Controller
public class AnnouncementController {
	@Autowired
	private AnnouncementService service;
	@GetMapping("index")
	public String home() {
		return "index";
	}
	// http://localhost:7070/index
	
	// ('AN001','삼성전자','신입 java 개발자 채용합니다.','백엔드 개발자',1000000,'JAVA,SPRING,ORACLE')
	// http://localhost:7070/insert?ann_id=AN010&company_name=삼성전자&ann_info=신입 java 개발자 채용합니다.&positions=백엔드&compensation=1000000&using_skill=JAVA,SPRING,ORACLE
	@RequestMapping("insert")
	public ResponseEntity<String> insertAnn(Announcement insert) {
		return ResponseEntity.ok(service.insertAnn(insert));
	}
	// http://localhost:7070/update?ann_id=AN003&company_name=네이버&ann_info=신입 개발자 채용합니다.&positions=프론트엔드&compensation=500000&using_skill=HTML,CSS,VUE
	@RequestMapping("update")
	public ResponseEntity<String> updateAnn(Announcement update){
		return ResponseEntity.ok(service.updateAnn(update));
	}
	
	@RequestMapping("sch") 
	public ResponseEntity<List<Announcement>> schAnn(@RequestParam("company_name")String company_name){
		return ResponseEntity.ok(service.schAnn(company_name));
	}
	
	@RequestMapping("delete")
	public ResponseEntity<String> deleteAnn(@RequestParam("ann_id")String ann_id){
		return ResponseEntity.ok(service.deleteAnn(ann_id));
	}

}

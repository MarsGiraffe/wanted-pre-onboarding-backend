package com.internship.onboarding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.internship.onboarding.service.AnnouncementService;
import com.internship.onboarding.vo.AnnApplication;
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
	
	// 공고 등록
	@RequestMapping("insert")
	public ResponseEntity<String> insertAnn(Announcement insert) {
		return ResponseEntity.ok(service.insertAnn(insert));
	}
	// 공고 수정
	@RequestMapping("update")
	public ResponseEntity<String> updateAnn(Announcement update){
		return ResponseEntity.ok(service.updateAnn(update));
	}
	// 공고 삭제
	@RequestMapping("delete")
	public ResponseEntity<String> deleteAnn(@RequestParam("ann_id")String ann_id){
		return ResponseEntity.ok(service.deleteAnn(ann_id));
	}
	// 공고 리스트 초기 페이지 및 검색 처리
	@RequestMapping("sch") 
	public ResponseEntity<List<Announcement>> schAnn(@RequestParam("company_name")String company_name){
		return ResponseEntity.ok(service.schAnn(company_name));
	}
	// 공고 상세 페이지
	@RequestMapping("detail")
	public ResponseEntity<Announcement> detail(@RequestParam("ann_id")String ann_id){
		return ResponseEntity.ok(service.detailAnn(ann_id));
	}
	// 다른 공고 출력
	@RequestMapping("othersAnn")
	public ResponseEntity<List<Announcement>> othersAnn(Announcement others){
		return ResponseEntity.ok(service.othersAnn(others));
	}
	// 공고 지원
	@RequestMapping("annApply")
	public ResponseEntity<String> annApply(AnnApplication app){
		return ResponseEntity.ok(service.annApply(app));
	}
}

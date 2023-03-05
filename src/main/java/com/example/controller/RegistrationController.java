package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.RegistrationConfirmDTO;
import com.example.domain.RegistrationDTO;
import com.example.service.RegistrationService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/course/")
@AllArgsConstructor
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	
	
	
	// 수강신청 확인페이지 이동	
	// http://localhost:8080/ccProject/course/list?userId=park 으로 접속하면 확인가능
	@GetMapping("/list")
	public void registListGET(@RequestParam("userId") String userId, Model model) {
			
		// 로그인 체크 코드 필요
			
			
		// 데이터 조회
		List<RegistrationConfirmDTO> list = registrationService.Course_list(userId);	
		model.addAttribute("list", list);
		log.info(list);	
	}
	
	
	
	
	
	// 수강 등록신청 페이지
	@GetMapping("/regist")
	public void courseRegistGET() {

	}
	
	@PostMapping("/regist")
//	@ResponseBody
	public String courseRegistPOST(RegistrationDTO registrationDTO) throws Exception {
		
		// 수강 신청
		registrationService.Course_regist(registrationDTO);
		String val = "userId="+registrationDTO.getUserId();
		return "redirect:/course/list?" + val;
	}
	

	
	

	
	// 수강신청 취소(삭제)
	@PostMapping("/delete")
//	@ResponseBody
	public String courseDeletePOST(RegistrationDTO registrationDTO) {
		
		// 로그인 체크 코드 필요
		
		registrationService.Course_delete(registrationDTO);
		String val = "userId="+registrationDTO.getUserId();
		return "redirect:/course/list?" + val;
	}
	
	@GetMapping("/delete")
	public void courseDeleteGET() {

	}
	
	
	
	
	
		
	
	// 수강 수정 
	@PostMapping("/fix")
	public String courseFixPOST(RegistrationDTO registrationDTO) {
		
		// 로그인 체크 코드 필요
		
		registrationService.Course_fix(registrationDTO);
		String val = "userId="+registrationDTO.getUserId();
		return "redirect:/course/list?" + val;
	}	
	
	@GetMapping("/fix")
	public void courseFixGET() {

	}
	

}

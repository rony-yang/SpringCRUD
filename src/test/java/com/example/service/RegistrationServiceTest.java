package com.example.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.domain.RegistrationConfirmDTO;
import com.example.domain.RegistrationDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {com.example.config.RootConfig.class} )
@Log4j
public class RegistrationServiceTest {

	@Autowired
	private RegistrationService service; 	
	
	RegistrationDTO registration = new RegistrationDTO();
	
//	@Test	//등록 테스트 - 테스트완료
	public void addCartTest() {
		String userId = "kim";
		String studyCode = "C02";
		int studyAllow = 1;
		
		registration.setUserId(userId);
		registration.setStudyCode(studyCode);
		registration.setStudyAllow(studyAllow);
	
		int result = service.Course_regist(registration);
		log.info(registration);
	
		System.out.println("** result : " + result);
		// 반환값 : 2 -> db에 값 넣기 성공
		// 반환값 : 0 -> 오류
	}
	
	@Test		// 목록 확인
	public void testRead() {

		//존재하는 userid로 확인
		
		try {
			List<RegistrationConfirmDTO> registration = service.Course_list("park");
			log.info(registration);
			
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		System.out.println("성공");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

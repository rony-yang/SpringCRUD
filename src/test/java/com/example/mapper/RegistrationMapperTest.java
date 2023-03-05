package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.domain.RegistrationConfirmDTO;
import com.example.domain.RegistrationDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@WebAppConfiguration
@ContextConfiguration(classes = {com.example.config.RootConfig.class} )
@Log4j
public class RegistrationMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private RegistrationMapper mapper;
	
	RegistrationDTO registration = new RegistrationDTO();

//	@Test  // 수강신청 - 테스트완료
	public void testInsert() {
		
		registration.setUserId("cha");
		registration.setStudyCode("C02");
		registration.setStudyAllow(0);
		
		log.info(registration);
		
		int result = 0;
		try {
			result = mapper.Course_regist(registration);
			
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		System.out.println("결과 : " + result);
	}
	
	
//	@Test	// 수강삭제 - 테스트완료
	public void testDelete() {
		
		registration.setUserId("cha");
		registration.setStudyCode("C02");
		
		int result = 0;
		try {
			result = mapper.Course_delete(registration);
			
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		System.out.println("결과 : " + result);
	}
		

//	@Test	// 카트 수정 - 테스트 확인
	// - 우선은 강의가 수량 여러개 넣는 시스템이 아니니까 사용처가 애매해서
	// allow 값만 수정할때 사용하도록 만들어봄...다른용도 생기면 xml 쿼리문 수정하기
	public void testUpdate() {
		
		//실행 전 존재하는 번호인지 확인할 것
		registration.setUserId("min");
		registration.setStudyCode("C04");
		registration.setStudyAllow(1);
		
		int result = 0;
		try {
			result = mapper.Course_fix(registration);
			
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		System.out.println("결과 : " + result);
	}
		
	@Test		// 목록 확인 - 테스트완료
	public void testRead() {

		//존재하는 userid로 확인
		
		try {
			List<RegistrationConfirmDTO> registration = mapper.Course_list("hong");
			log.info(registration);
			
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		System.out.println("성공");
	}

	}
	
	

	


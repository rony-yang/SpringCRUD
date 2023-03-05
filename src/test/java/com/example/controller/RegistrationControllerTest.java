package com.example.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //서블릿 콘텍스트를 사용하겠다는 의미
@ContextConfiguration(classes = {com.example.config.RootConfig.class,
								 com.example.config.ServletConfig.class})
@Log4j
public class RegistrationControllerTest {

	@Setter(onMethod_ = { @Autowired })
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc; // 가짜 mvc - url과 파라미터를 브라우저 사용처럼 만들어 컨트롤러 실행
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	

	@Test // 조회 테스트
	public void tetGet() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders
								 .get("/course/park")
								 .param("userId", "park"))
						 .andReturn()
						 .getModelAndView()
						 .getModelMap()
				);
	}
	
	

	
	
	
	
	
}

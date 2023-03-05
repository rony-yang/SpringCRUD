package com.example.domain;

import java.util.Date;

import lombok.Data;

// 학원 과정

@Data
public class StudyDTO {
	private String studyCode;		// 수강과정코드
	private String studyCourse;		// 수강과정명
	private String studyContent;	// 과정 내용
	private Date studyStartDate;	// 교육시작일
	private Date studyEndDate;		// 교육마감일
	private Date studyStartTime;	// 시작시간
	private Date studyEndTime;		// 종료시간
	private String studyTeacher;	// 강사
	private int studyPrice;			// 수강료
	
}

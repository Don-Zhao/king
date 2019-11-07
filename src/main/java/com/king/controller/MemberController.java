package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.king.model.Member;
import com.king.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/{id}", method=RequestMethod.GET
			, produces=MediaType.APPLICATION_JSON_VALUE)
	public Member find(@PathVariable int id) {
		Member member = memberService.findById(id);
		return member;
	}
}

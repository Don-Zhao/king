package com.king.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.king.model.Member;

@Service
public class MemberService {
	private static Map<Integer, Member> dataMap = new HashMap<>();
	
	static {
		dataMap.put(1, new Member(1, "zhaojiahong1"));
		dataMap.put(2, new Member(2, "zhaojiahong2"));
		dataMap.put(3, new Member(3, "zhaojiahong3"));
		dataMap.put(4, new Member(4, "zhaojiahong4"));
		dataMap.put(5, new Member(5, "zhaojiahong5"));
		dataMap.put(6, new Member(6, "zhaojiahong6"));
		dataMap.put(7, new Member(7, "zhaojiahong7"));
		dataMap.put(8, new Member(8, "zhaojiahong8"));
		dataMap.put(9, new Member(9, "zhaojiahong9"));
	}
	
	public Member findById(int id) {
		return dataMap.get(id);
	}
}

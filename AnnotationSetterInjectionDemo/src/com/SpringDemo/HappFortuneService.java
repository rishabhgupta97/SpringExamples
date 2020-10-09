package com.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HappFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Good luck fortune";
	}

}

package com.altran.liferay.hook.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;

public class LoginPreAction extends Action {
	
	public void run(HttpServletRequest req, HttpServletResponse res) {
		
		System.out.println("Invoking login action...");
	}
	
}

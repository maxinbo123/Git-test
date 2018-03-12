package com.example.test.impl;

import java.util.HashMap;
import java.util.Map;

import com.example.test.service.Notify;

public class NotifyImpl implements Notify{

	public Map<Integer,String> ret = new HashMap<Integer,String>();
	
	public Map<Integer,Throwable> errors = new HashMap<Integer,Throwable>();
	
	@Override
	public void onreturn(String str, Integer id) {
		System.out.println("onreturn:"+str);
		ret.put(id, str);
	}

	@Override
	public void onthrow(Throwable ex, Integer id) {
		
		errors.put(id, ex);
	}

}

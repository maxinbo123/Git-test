package com.example.test.service;

public interface Notify {

	public void onreturn(String str, Integer id);
	
	public void onthrow(Throwable ex, Integer id);
}

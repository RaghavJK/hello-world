package com.jenkins.demo.helloworld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(final String[] args) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String today = simpleDateFormat.format(new Date());

		System.out.println("Hello, World! Today is : " + today);
	}

}

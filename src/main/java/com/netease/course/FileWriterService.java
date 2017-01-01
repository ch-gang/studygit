package com.netease.course;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterService implements File {
	private String url;
	private FileOutputStream out;
	
	public FileWriterService(String url) {
		this.url = url;
	}
	
	public void init() {
		try {
			out = new FileOutputStream("C:\\Users\\CG\\Desktop\\course.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("���ļ��ɹ�");
	}

	public void destroy() {
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�ر��ļ��ɹ�");
	}
	
	public void write(String content) {
		try {
			out.write(content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("д���ļ��ɹ�");
	}
	
	public String getInfo() {
		return "�ļ�·���� " + url;
	}
	
}

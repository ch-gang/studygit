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
		System.out.println("打开文件");
	}

	public void destroy() {
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("关闭文件");
	}
	
	public void write(String content) {
		try {
			out.write(content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("写入文件");
	}
	
	public String getInfo() {
		return "文件路径： " + url;
	}
	
}

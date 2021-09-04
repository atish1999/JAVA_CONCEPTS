package oops.packages.models;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Student {
	private String name;
	public Student(String name) {
		this.name=name;
		getPassword();
	}
	public String getName() {
		return name;
	}
	private String getPassword() {
		return "lasjfg@123";
	}
	
}

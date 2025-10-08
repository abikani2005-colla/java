package com.p2;
import java.io.*;
class father {
	void house(){
		System.out.println("Have a own house");
	}
}
class son extends father {
		void car(){
			System.out.println("Have a audi car");
		}
	}

public class Inheritance {

	public static void main(String[] args) {
		son s4=new son();
		s4.car();
		s4.house();

	}

}


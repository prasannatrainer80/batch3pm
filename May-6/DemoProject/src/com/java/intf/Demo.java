package com.java.intf;

public class Demo {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Madhusree(), new Pratham(), 
			new YogaPriya()
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}

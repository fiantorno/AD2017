package test;

import hbt.HibernateUtil;

public class Test {
	private static Test instancia;

	private Test() { }
	
	public static Test getInstancia(){
		if(instancia == null)
			instancia = new Test();
		return instancia;
	}
	public static void main(String[] args) {
		Test.getInstancia(); 
		new HibernateUtil();
	}
}

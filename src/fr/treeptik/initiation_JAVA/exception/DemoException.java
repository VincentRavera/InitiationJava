package fr.treeptik.initiation_JAVA.exception;

public class DemoException {
	
	private String throwEx1 () throws Exception1 {
		String s = "Toto";
		if (s.equals("Toto")) {
			throw new Exception1("Chaine est Toto");
			
		}
		return s;
		}
		
	public String throwEx2 () throws Exception2, Exception1{
		
		this.throwEx1();
		return "fake";
	}
	
	public void throwRunTimeEx() throws MyRuntimeException{
		throw new MyRuntimeException("hi Runtime :)");
		
	}
		

}

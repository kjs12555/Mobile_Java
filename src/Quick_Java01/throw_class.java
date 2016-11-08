package Quick_Java01;

public class throw_class extends Throwable {
	String str;
	throw_class(String s){
		str = s;
	}
	
	throw_class(){
		
	}
	
	final void test(){
		System.out.println("test");
	}

}

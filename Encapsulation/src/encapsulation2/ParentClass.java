package encapsulation2;

public class ParentClass {

	private int x = 88;
	
	public void m1() {
		
		System.out.println(x);
		m2();
	}
		
    private void m2() {
    	System.out.println("Private Method");
    	
    }
    
    
}
	


package help;

import com.googlecode.jmapper.annotations.JMap;

public class BeanA 
{
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@JMap("a2")
	Integer a;
	@JMap("b2")
	String b;
	
}

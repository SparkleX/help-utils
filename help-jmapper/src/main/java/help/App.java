package help;
import com.googlecode.jmapper.JMapper;


public class App 
{
    public static void main(String []args) 
    {
    	JMapper<BeanB,BeanA> mapper = new JMapper<>(BeanB.class, BeanA.class);
    	BeanA a = new BeanA();
    	a.setA(100);
    	a.setB("123");

    	BeanB b = mapper.getDestination(a);
    	System.out.println(b.a2);
    	System.out.println(b.b2);
    	
    	
    }
    

}

package ObjectCreationsClone;

public class TestClass2  implements Cloneable {
	int a; 
    int b; 
    TestClass1 c = new TestClass1(); 
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
}

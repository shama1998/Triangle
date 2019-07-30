import junit.framework.TestCase;

public class TriangleTest2 extends TestCase {

	public void testPerimeter() {
		float a;
		//fail("Not yet implemented");
		Triangle t=new Triangle();
		t.setBase(4f);
		t.setHeight(3);
		a=t.Perimeter();
		assertEquals(11f,a);
	}

}

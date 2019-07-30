import junit.framework.TestCase;

public class TriangleTest extends TestCase {

	public void testArea() {
		float a;
		//fail("Not yet implemented");
		Triangle t = new Triangle();
		t.setBase(6);
		t.setHeight(3);
		a=t.area();
		assertEquals(9f,a);
	}

}

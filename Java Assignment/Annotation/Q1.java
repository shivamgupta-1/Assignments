package Annotation;

/*
 * 1) Create a custom annotation called @Test which can be only applied on a method implying
that the following method is a test-case. (Is it possible to restrict the annotation to be
applied only on a non-static method?) 

 */
@interface Test {
}

class classTest {

	@Test
	public void testMethod() {
		System.out.println("Test method run");
	}
}
public class Q1 {

	public static void main(String[] args) {

		classTest a = new classTest();
		a.testMethod();
	}

}

package object_out;

public class TestInitInConstructorWithoutParam {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	public TestInitInConstructorWithoutParam() {
		f = new ThreadLocal<Integer>() {
			protected Integer initialValue() {
				return 10;
			}
		};
	}
}
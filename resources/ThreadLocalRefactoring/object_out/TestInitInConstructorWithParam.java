package object_out;

public class TestInitInConstructorWithParam {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	public TestInitInConstructorWithParam(final int paramF) {
		f = new ThreadLocal<Integer>() {
			protected Integer initialValue() {
				return paramF;
			}
		};
	}
}

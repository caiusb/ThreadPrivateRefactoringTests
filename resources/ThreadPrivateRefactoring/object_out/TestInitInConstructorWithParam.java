package object_out;

import privatization.ThreadPrivate;

public class TestInitInConstructorWithParam {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	public TestInitInConstructorWithParam(final int paramF) {
		f = new ThreadPrivate<Integer>() {
			protected Integer initialValue() {
				return paramF;
			}
		};
	}
}

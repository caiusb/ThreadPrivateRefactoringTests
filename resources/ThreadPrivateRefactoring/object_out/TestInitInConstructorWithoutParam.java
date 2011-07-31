package object_out;

import privatization.ThreadPrivate;

public class TestInitInConstructorWithoutParam {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	public TestInitInConstructorWithoutParam() {
		f = new ThreadPrivate<Integer>() {
			protected Integer initialValue() {
				return 10;
			}
		};
	}
}
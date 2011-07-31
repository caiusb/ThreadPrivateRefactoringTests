package object_out;

import privatization.ThreadPrivate;

public class TestInitAtDeclaration {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>() {
		protected Integer initialValue() {
			return 0;
		}
	};
}
package object_out;

import privatization.ThreadPrivate;

public class TestOperatorMultiplyAssign {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	private void m() {
		int count = 42;
		f.set(f.get() * count);
	}
}
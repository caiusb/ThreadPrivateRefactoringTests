package object_out;

import privatization.ThreadPrivate;

public class TestOperatorMinusAssign {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	private void m() {
		int count = 42;
		f.set(f.get() - count);
	}
}
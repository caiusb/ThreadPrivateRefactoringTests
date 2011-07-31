package object_out;

import privatization.ThreadPrivate;

public class TestOperatorDecrementPrefix {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	private void m() {
		int count = f.get() - 1;
		f.set(f.get() - 1);
	}
}
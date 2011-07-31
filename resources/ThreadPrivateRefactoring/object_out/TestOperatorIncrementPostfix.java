package object_out;

import privatization.ThreadPrivate;

public class TestOperatorIncrementPostFix {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	private void m() {
		int count = f.get();
		f.set(f.get() + 1);
	}
}
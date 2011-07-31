package object_out;

import privatization.ThreadPrivate;

public class TestSetAndGet {
	ThreadPrivate<Integer> f = new ThreadPrivate<Integer>() {
		protected Integer initialValue() {
			return 0;
		}
	};

	public void m() {
		f.set(10);
		int x = f.get();
	}

}

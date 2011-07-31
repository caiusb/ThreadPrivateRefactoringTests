package object_out;

import privatization.ThreadPrivate;

public class TestFindThisReferences {
  ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	public int m() {
		this.f.set(10);
		return this.f.get();
	}
}

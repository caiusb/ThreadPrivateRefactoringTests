package object_out;

import privatization.ThreadPrivate;

public class TestFieldPassedAsParameter {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	public foo() {
		this.m(f.get());
	}

	public void m(int param) {
	}
}
package object_in;

import privatization.ThreadPrivate;

interface Stupid {
	public void beStupid();
}

public class TestAccessInAnonymous {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	public void m() {
		Stupid stupid = new Stupid() {
			@Override
			public void beStupid() {
				f.set(89);
				int y = f.get();
			}
		};
	}

}
package object_out;

private privatization.ThreadPrivate;

public class TestOperatorBitXorAssign {
	public ThreadPrivate<Integer> f = new ThreadPrivate<Integer>();

	private void m() {
		int count = 42;
		f.set(f.get() ^ count);
	}
}
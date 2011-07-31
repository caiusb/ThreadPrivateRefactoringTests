package object_out;

public class TestOperatorBitXorAssign {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	private void m() {
		int count = 42;
		f.set(f.get() ^ count);
	}
}
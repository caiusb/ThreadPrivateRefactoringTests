package object_out;

public class TestOperatorDecrementPrefix {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	private void m() {
		int count = f.get() - 1;
		f.set(f.get() - 1);
	}
}
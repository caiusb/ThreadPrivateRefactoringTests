package object_out;

public class TestOperatorIncrementPrefix {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	private void m() {
		int count = f.get() + 1;
		f.set(f.get() + 1);
	}
}
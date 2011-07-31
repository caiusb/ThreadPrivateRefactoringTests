package object_out;

public class TestOperatorIncrementPostFix {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	private void m() {
		int count = f.get();
		f.set(f.get() + 1);
	}
}
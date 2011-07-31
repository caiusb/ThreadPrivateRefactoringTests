package object_out;

public class TestOperatorDecrementPostfix {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	private void m() {
		int count = f.get();
		f.set(f.get()-1);
	}
}
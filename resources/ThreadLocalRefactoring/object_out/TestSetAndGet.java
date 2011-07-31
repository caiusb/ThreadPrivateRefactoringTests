package object_out;

public class TestSetAndGet {
	ThreadLocal<Integer> f = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 0;
		}
	};

	public void m() {
		f.set(10);
		int x = f.get();
	}

}

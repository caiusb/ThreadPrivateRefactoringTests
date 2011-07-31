package object_out;

public class TestFindThisReferences {
	ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	public int m() {
		this.f.set(10);
		return this.f.get();
	}
}

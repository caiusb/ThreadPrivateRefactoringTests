package object_out;

public class TestFieldPassedAsParameter {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>();

	public foo() {
		this.m(f.get());
	}

	public void m(int param) {
	}
}
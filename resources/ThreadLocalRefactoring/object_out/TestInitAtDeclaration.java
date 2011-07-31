package object_out;

public class TestInitAtDeclaration {
	public ThreadLocal<Integer> f = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 0;
		}
	};
}
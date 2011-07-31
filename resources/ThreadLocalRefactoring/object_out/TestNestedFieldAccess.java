package object_out;

import java.util.*;

public class TestNestedFieldAccess {
	public ThreadLocal<List<?>> f = new ThreadLocal<List<?>>() {
		protected List<?> initialValue() {
			return new ArrayList<?>();
		}
	};

	public void m() {
		f.get().add(new Object());
		boolean temp = f.get().isEmpty();
	};
}
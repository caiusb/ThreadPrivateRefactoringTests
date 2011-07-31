package object_out;

import java.util.*;
import privatization.ThreadPrivate;

public class TestNestedFieldAccess {
	public ThreadPrivate<List<?>> f = new ThreadPrivate<List<?>>() {
		protected List<?> initialValue() {
			return new ArrayList<?>();
		}
	};

	public void m() {
		f.get().add(new Object());
		boolean temp = f.get().isEmpty();
	};
}
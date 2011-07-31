package object_in;

import java.util.*;

public class TestNestedFieldAccess {
	public List<?> f = new ArrayList<?>();

	public void m() {
		f.add(new Object());
		boolean temp = f.isEmpty();
	};
}
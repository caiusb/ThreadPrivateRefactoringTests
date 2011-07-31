package object_in;

public class TestFindThisReferences {
	int f;

	public int m() {
		this.f = 10;
		return this.f;
	}
}

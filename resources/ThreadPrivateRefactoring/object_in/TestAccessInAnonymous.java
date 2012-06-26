package object_in;

interface Stupid {
	public void beStupid();
}

public class TestAccessInAnonymous {
	public int f;

	public void m() {
		Stupid stupid = new Stupid() {
			@Override
			public void beStupid() {
				f = 89;
				int y = f;
			}
		};
	}

}
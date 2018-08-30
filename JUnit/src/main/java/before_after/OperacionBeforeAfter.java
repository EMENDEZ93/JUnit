package before_after;

public class OperacionBeforeAfter {

	private int ans;

	public OperacionBeforeAfter() {
		ans = 0;
	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
}

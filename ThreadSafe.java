import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafe {
	public static void main(String args[]) {
		ConcurrentHashMap<Integer, String> chp = new ConcurrentHashMap<Integer, String>();
		chp.put(101, "Focusing");
		chp.put(102, "Implementing");
		chp.put(103, "Learning");

		chp.putIfAbsent(101, "Focusing");

		chp.remove(101, "Checking");

		chp.putIfAbsent(104, "Output");

		chp.replace(103, "Input");

		chp.putIfAbsent(105, "Learning");

		System.out.println("Loading..." + chp);

	}

}

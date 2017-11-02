
public class Lab10bonus {

	public Lab10bonus() {
		
	}

	public static void main(String[] args) {
		long last = 0;
		long current = 1;
		long next = 0;
		long total = 0;
		while(current < 2000000000) {
			if(current % 2 != 0) {
				total += current;
			}
			next = last + current;
			last = current;
			current = next;
			
		}
		System.out.println(total + "   " + current);
	}

}

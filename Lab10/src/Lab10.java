
public class Lab10 {

	public Lab10() {
		
	}

	public static void main(String[] args) {
		int highest = 0;
		int highestx = 0;
		int highesti = 0;
		Lab10 test = new Lab10();
		for (int i = 1000; i < 10000;i++) {
			for(int x = 1000; x < 10000;x++) {
				
				if(test.check(String.valueOf(i*x))) {
					if((i * x) > highest) {
						highest = i*x;
						highestx = x;
						highesti = i;
					}
						
				}
			}
		}
		
		System.out.println(highest + "     " + highestx +" * " + highesti);
	}
 public boolean check(String x) {
	 if(x.length() < 2) return true;
	 if(x.charAt(0) == x.charAt(x.length() -1)) {
		 return check(x.substring(1, x.length() - 1));
	 
	 } else return false;
	 
 }
}

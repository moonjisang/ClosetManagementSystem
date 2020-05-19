package midtermexam;

class Marathon {
	public static void main (String[] arguments) {
		
		MarathonInformaion info = new MarathonInformaion();
		
		int temp = 0;
		String mp;
		for (int j=0; j<info.names.length; j++) {
		for (int i = 1; i<info.names.length; i++) {
			if (info.times[i]<info.times[i-1]) {
				temp = info.times[i-1];
				info.times[i-1] = info.times[i];
				info.times[i] = temp;	
				mp = info.names[i-1];
				info.names[i-1] = info.names[i];
				info.names[i] = mp;	
			}
		}
	}		

			System.out.println("The second fastest runner is "+info.names[1] + ": " + info.times[1] + "(in minutes)");

	}
}
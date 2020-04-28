package midtermexam;

class Marathon2 {
	public static void main (String[] arguments) {

		MarathonInformaion info = new MarathonInformaion();
		for (int i = 0; i < info.names.length; i++) {
			 System.out.println(info.names[i] + ": " + info.times[i]);
			 }
	}
}
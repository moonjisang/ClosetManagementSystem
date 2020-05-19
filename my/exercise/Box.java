package exercise;

public class Box {
	int w, h1, h2;
	
	public Box(int w, int h1, int h2) {

		this.w = w;
		this.h1 = h1;
		this.h2 = h2;
	}

	boolean isSameBox(Box obj) {
		if (this.w == obj.w && this.h1 == obj.h1 && this.h2 == obj.h2 ) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
	}


	}


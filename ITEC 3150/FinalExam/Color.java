
import java.util.Comparator;

public class Color implements Comparator<Color> {

	int red;
	int green;
	int blue;

	Color(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	Color() {
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public String toString() {
		return "red = " + red + " green = " + green + " blue = " + blue + "\n";
	}

///YOUR CODE HERE
	@Override
	public int compare(Color o1, Color o2) {
		if (o1.getRed() < o2.getRed()) {
			return 1;
		}
		if (o1.getRed() > o2.getRed()) {
			return -1;
		} else if (o1.getGreen() < o2.getGreen()) {
			return -1;
		} else if (o1.getGreen() > o2.getGreen()) {
			return 1;
		} else {
			return 0;
		}

	}

///END OF YOUR CODE HERE

} // ADM
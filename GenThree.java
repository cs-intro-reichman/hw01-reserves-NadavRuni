public class GenThree {

	public static void main(String[] args) {
		int c = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);

		int i = 0, a = 0, mini = d;
		double rand;

		while (i != 3) // לולאה שרצה 3 פעמים
		{
			rand = (Math.random() * (d - c)) + c;// מגרילה מספר בין c ל d
			a = (int) rand;
			System.out.println(a);
			if (a < mini) {
				mini = a;
			}

			i++;
		}
		System.out.println("The minimal generated value was " + mini);

	}
}

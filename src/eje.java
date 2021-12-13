
public class eje {
	public static void main(String[] args) {
		System.out.println("Escribir numero");
		int num = Console.readInt();
		int n = 1;
		for (int i=1;i<=num;i++) {
			n = n * i;
		}
		System.out.println(n);
	}
}
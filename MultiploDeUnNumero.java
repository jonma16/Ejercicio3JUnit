
public class MultiploDeUnNumero {
		public static int leerN() {
			System.out.println("Dime la N: ");
			int n=Console.readInt();
			while(n<0) {
				System.out.println("N tienen que ser positivo.");
				n=Console.readInt();
			}
			return n;
		}

		public static int leerM(int n) {
			System.out.println("Dime la M: ");
			int m=Console.readInt();
			while(m<0 || m<n) {
				System.out.println("M tienen que ser positivo y mayor a N.");
				m=Console.readInt();
			}
			return m;
		}

		public static void multiplosNyM(int n, int m) {
			for(int i=1;i<=m;i++) {
				if(i%n==0) {
					System.out.println(i);
				}
			}
		}

		public static void main(String[] args) {
			int n=leerN();
			int m=leerM(n);
			multiplosNyM(n,m);
		}
}

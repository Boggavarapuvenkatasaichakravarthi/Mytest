interface person{
	abstract public void eat();
}
public class PersonImpl {
public static void main(String args[]) {
	person p1=new person() {
		public void eat() {
			System.out.println("Hii");
			System.out.println("VenkataSai");
		}
	};
	p1.eat();
}
}

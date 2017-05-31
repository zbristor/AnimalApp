

public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());

		Dog d = new Dog();
		print(d.eat());
		print(d.sleep());
		print(d.bark());
		
		Fish f = new Fish();
		print(f.eat());
		print(f.bubbles());
		
		Monkey m = new Monkey();
		print(m.sleep());
		print(m.banana());
		print(m.eat());
		
		Unicorn u = new Unicorn();
		print(u.eat());
		print(u.fly());
		print(u.sleep());
		
		Tiger t = new Tiger();
		print(t.eat());
		print(t.howl());
		print(t.sleep());
	}
	private static void print(String s){
		System.out.println(s);
	}
}
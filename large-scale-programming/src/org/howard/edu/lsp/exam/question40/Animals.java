package org.howard.edu.lsp.exam.question40;

/**
 * Program that represents a hierarchy of Animals
 * @author bria
 *
 */
public class Animals {
	
	/**
	 * Interface that establishes animal behaviors
	 *
	 */
	public interface Animal {
		public void move();
		public void speak();
	}
	
	/**
	 * Establishes flying behaviors
	 *
	 */
	public abstract class Flying {
		public abstract void fly();
	}
	
	/**
	 * Establishes animal behaviors of a Goose
	 *
	 */
	public class Goose extends Flying implements Animal {

		@Override
		public void move() {
			System.out.println("This Goose moves forward");
			
		}

		@Override
		public void speak() {
			System.out.println("This Goose speaks");
			
		}

		@Override
		public void fly() {
			System.out.println("This Goose is flying");
			
		}
	}
	
	/**
	 * Establishes animal behaviors of a Tiger
	 *
	 */
	public class Tiger implements Animal {

		@Override
		public void move() {
			System.out.println("This Tiger moves forward");
			
		}

		@Override
		public void speak() {
			System.out.println("This Tiger speaks");
			
		}
	}

	/**
	 * Establishes behaviors of an airplane	
	 *
	 */
	public class Airplane extends Flying {

		@Override
		public void fly() {
			System.out.print("The airplane is in the sky");
			
		}

   }
}

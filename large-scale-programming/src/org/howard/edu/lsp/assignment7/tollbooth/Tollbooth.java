package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * Program to simulate the operation of a tollbooth
 * @author bria
 *
 */
public class Tollbooth {
	
	/**
	 * Truck class that establishes the general attributes of a truck
	 *
	 */
	public abstract class Truck {
		public abstract int totalWeight();
		public abstract int numOfAxles();
		public abstract String makeOfTruck();
		
	}
	
	/**
	 * TollBooth interface that establishes the general behaviors of a tollbooth
	 *
	 */
	public interface TollBooth {
		public void calculateToll(Truck truck);
		public void displayData();
		public void reset();
		
	}
	
	/**
	 * Volvo truck that extends the attributes of a truck
	 *
	 */
	public class Volvo extends Truck {
		
		int axles = 0;
		int weight = 0;
		String make = "";
		
		/**
		 * Volvo constructor to take in the make, axles, and weight
		 * @param axles num of axles on truck
		 * @param weight weight of truck
		 * @param make brand/make of truck
		 */
		public Volvo (int axles, int weight, String make) {
			
			this.axles = axles;
			this.weight = weight;
			this.make = make;
		}
		
		@Override
		public int totalWeight() {
			return weight;
		}

		@Override
		public int numOfAxles() {
			return axles;
		}

		@Override
		public String makeOfTruck() {
			return make;
			
		}
	}
	
	
	/**
	 * Kenworth truck that extends the attributes of a truck
	 *
	 */
	public class Kenworth extends Truck {
		
		int axles = 0;
		int weight = 0;
		String make = "";
		
		/**
		 * Kenworth constructor to take in the make, axles, and weight
		 * @param axles num of axles on truck
		 * @param weight weight of truck
		 * @param make brand/make of truck
		 */
		Kenworth (int axles, int weight, String make) {
			this.axles = axles;
			this.weight = weight;
			this.make = make;
		}

		@Override
		public int totalWeight() {
			return weight;
		}

		@Override
		public int numOfAxles() {
			return axles;
		}

		@Override
		public String makeOfTruck() {
			return make;
		}
	}
	
	/**
	 * City tollbooth that implements the behaviors of a tollbooth
	 *
	 */
	public class BaltimoreTollbooth implements TollBooth {
		
		int num_of_trucks;
		int total_receipts;

		public BaltimoreTollbooth(){
			num_of_trucks = 0;
			total_receipts = 0;
		}
		
		@Override
		//Calculates the toll for each truck passing a tollbooth
		public void calculateToll(Truck truck) {
			
			int axles = truck.numOfAxles();
			int weight = truck.totalWeight();
			String make = truck.makeOfTruck();
			
			System.out.println("Axles: " + axles);
			System.out.println("Total Weight: " + weight);
			System.out.println("Make of Truck: " + make);
			
			int toll = (axles * 5) + ((weight/1000)/2);
			num_of_trucks += 1;
			total_receipts += toll;
			
			System.out.println("Tolls Due: $" + toll);
			
		}

		@Override
		//Displays the booth's totals 
		public void displayData() {
			System.out.println("Trucks: " + num_of_trucks);
			System.out.println("Receipts: " + total_receipts);
			
		}

		@Override
		//Resets the booth's totals
		public void reset() {
			num_of_trucks = 0;
			total_receipts = 0;
			
		}
	}
}

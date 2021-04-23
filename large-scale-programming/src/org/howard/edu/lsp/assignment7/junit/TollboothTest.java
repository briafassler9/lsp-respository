package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth.BaltimoreTollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth.Truck;
import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth.Volvo;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

/**
 * Tests calculations and data when trucks pass through a tollbooth
 * @author bria
 *
 */
class TollboothTest {

	@Test
	@DisplayName("Tests if volvo trucks pass through the tollbooth")
	public void testVolvo() {
		
		TollBooth booth = new BaltimoreTollbooth();
		
		Truck volvo1 = new Volvo(5, 18000, "Volvo VNL");
		Truck volvo2 = new Volvo(3, 12000, "Volvo VNR Electric");

		System.out.println("Truck 1 at TollBooth: ");
		booth.calculateToll(volvo1);
		booth.displayData();
		System.out.println("-----");
		System.out.println("Truck 2 at TollBooth: ");
		booth.calculateToll(volvo2);
		booth.displayData();
		booth.reset();
	}
	
	@Test
	@DisplayName("Tests if kenworth trucks pass through the tollbooth")
	public void testKenworth() {
		
		TollBooth booth = new BaltimoreTollbooth();
		
		Truck kenworth1 = new Kenworth(5, 20000, "Kenworth T180");
		Truck kenworth2 = new Kenworth(5, 25000, "Kenworth W990");
		Truck kenworth3 = new Kenworth(4, 17000, "Kenworth T380");

		System.out.println("Truck 1 at TollBooth: ");
		booth.calculateToll(kenworth1);
		booth.displayData();
		System.out.println("-----");
		System.out.println("Truck 2 at TollBooth: ");
		booth.calculateToll(kenworth2);
		booth.displayData();
		booth.reset();
		System.out.println("Truck 1 at TollBooth: ");
		booth.calculateToll(kenworth3);
		booth.displayData();
		booth.reset();
	}

}

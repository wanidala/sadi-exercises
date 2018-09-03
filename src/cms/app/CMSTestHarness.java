package cms.app;

import cms.model.CourierManagementSystemImpl;
import cms.model.Truck;
import cms.model.Van;
import cms.model.interfaces.CourierManagementSystem;

/**
 * <b> CMSTestHarness </b> performs the following functionalities on the courier
 * management system.
 *
 * - Add Vehicle (Vans + Trucks). - Display Information about a Vehicle(s). -
 * Assign a vehicle to a job (tests cases in which a job should be accepted and
 * a case where it should be refused) - Service a vehicle - Display Information
 * about Job(s)
 */
public class CMSTestHarness {
	
	static CourierManagementSystem cms = new CourierManagementSystemImpl();

	public static void main(String[] args)
	{
		/*
		 * Adding Vehicles
		 */
		cms.addVehicle(new Van("v1", "Toyota", "Sienna", 1998, 500.0));
		cms.addVehicle(new Van("v2", "Volkswagen", "Routan S", 2009, 1000.0));
		cms.addVehicle(new Truck("t1", "Peterbilt", "379 ", 1990, 2000.0, 3000));
		cms.addVehicle(new Truck("t2", "Peterbilt", "386", 2005, 2000.0, 3500));
		/*
		 * Display Vehicle Information
		 */
		System.out.format("\n*Printing Information for Van : %s\n", "v2");
		cms.displayVehicleInfo("v2");
		System.out.format("\n*Printing Information for Truck : %s\n", "t2");
		cms.displayVehicleInfo("t2");
		/*
		 * Display All Vehicles
		 */
		System.out.println("\n*Displaying All Vehicles...");
		cms.displayAllVehicles();
		/*
		 * Schedule Jobs
		 */
		System.out.println("\n*Testing Job Scheduling for v2...");
		System.out.println("Job 100km to V2(should schedule) = "
		+ (cms.scheduleJob(100, "v2") ? 
		"scheduled" : "rejected")); // should schedule
		System.out.println("Job 600km to V2(should schedule) = "
		+ (cms.scheduleJob(600, "v2") ? 
		"scheduled" : "rejected")); // should schedule
		System.out.println("Job 500km to V2(should reject) = "
		+ (cms.scheduleJob(500, "v2") ? 
		"scheduled" : "rejected")); // should reject
		System.out.println("Job 100km to V2(should schedule) = "
		+ (cms.scheduleJob(100, "v2") ? 
		"scheduled" : "rejected")); // should schedule
		System.out.println("Job 300km to V2(should reject) = "
		+ (cms.scheduleJob(300, "v2") ? 
		"scheduled" : "rejected")); // should reject
		/*
		 * Printing current Odometer reading and vehicle 
		information for van v2
		 */
		System.out
		.println("\n*Vehicle Inforamtion for v2(After Jobs Scheduled)...");
		cms.displayVehicleInfo("v2");
		/*
		 * Servicing V2
		 */
		System.out.println("\n*Servicing Vehicle V2...");
		cms.serviceVehicle("v2");
		cms.displayVehicleInfo("v2");
		/*
		 * Test New Job Schedule
		 */
		System.out
		.println("\n*Testing New Job Schedule 990km to V2 (should schedule)= "
		+ 
		(cms.scheduleJob(990, "v2") ? "scheduled"
		: "rejected"));
		/*
		 * Printing All Jobs
		 */
		System.out.println("\n*Displaying All Scheduled Jobs");
		
		cms.displayAllJobs();
	}
}
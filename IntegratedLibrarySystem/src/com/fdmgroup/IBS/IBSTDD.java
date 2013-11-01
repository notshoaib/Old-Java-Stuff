//package com.fdmgroup.IBS;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import com.fdmgroup.IBS.command.CommandControl;
//import com.fdmgroup.IBS.command.CreatePatronCommand;
//import com.fdmgroup.IBS.command.EmployeeAbility;
//import com.fdmgroup.IBS.factory.EmployeeFactory;
//import com.fdmgroup.IBS.factory.RamDatabaseFactory;
//import com.fdmgroup.IBS.users.Employee;
//import com.fdmgroup.IBS.users.User;
//import com.fdmgroup.rammem.RamUserDatabase;
//
//public class IBSTDD {
//
//	@Test
//	public void testEvaluateRamDataBaseCreation() {
//		int x = 5;
//		Employee E = new Employee("Bobby");
//
//		RamDatabaseFactory RDF = new RamDatabaseFactory();
//		RamUserDatabase ram = RDF.makeUserRamDB();
//		ram.load(x, E);
//		try {
//			ram.create();
//		} catch (NoLoadedDataException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	
//	package com.fdmgroup.logs;
//
//	import org.apache.log4j.Logger;
//	import org.apache.log4j.PropertyConfigurator;
//
//	public class Example {
//
//		static Logger log = Logger.getLogger("Example");
//
//		static {
//
//			PropertyConfigurator.configure("log4j.properties");
//		}
//		
//		public static void main (String[] args){
//			log.trace("Entered Main Method");
//			log.debug("DEBUG MESSAGE!");
//			log.debug("Check if everything is okay");
//			log.info("Continuing with main execution");
//			log.warn("Warning! Something might be wrongs");
//			log.error("Hello error");
//			log.fatal("Everything died");
//		}
//	}
//
//	@Test(expected = NoLoadedDataException.class)
//	public void testEvaluateNoDataException() throws NoLoadedDataException {
//		int x = 5;
//		Employee E = new Employee("Bobby");
//
//		RamDatabaseFactory RDF = new RamDatabaseFactory();
//		RamUserDatabase ram = RDF.makeUserRamDB();
//		ram.create();
//
//	}
//
//	@Test(expected = NoSuchRecordException.class)
//	public void testEvaluateNoRecordException() throws NoLoadedDataException {
//		int x = 5;
//		Employee E = new Employee("Bobby");
//
//		RamDatabaseFactory RDF = new RamDatabaseFactory();
//		RamUserDatabase ram = RDF.makeUserRamDB();
//		ram.update();
//
//	}
//
//	@Test
//	public void testEvaluateRamDataUpdate() throws NoSuchRecordException {
//		int x = 5;
//		Employee E = new Employee("Bobby");
//		Employee S = new Employee("Bobby");
//		RamDatabaseFactory RDF = new RamDatabaseFactory();
//		RamUserDatabase ram = RDF.makeUserRamDB();
//		ram.load(x, E);
//		try {
//			ram.create();
//		} catch (NoLoadedDataException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ram.load(x, S);
//		ram.update();
//
//		assertTrue(ram.retrieve() == S);
//
//	}
//
//	@Test
//	public void testEvaluateUsercreation() {
//		User E = new Employee("Bobby");
//		assertTrue(E.getName().equals("Bobby"));
//
//	}
//
//	@Test
//	public void testEvaluateBook() {
//		Book B = new Book(5454, "Catcher");
//
//		OPAC<Number, Book> OnlineCatalog = new OPAC<Number, Book>(B.getISBN(),
//				B);
//
//		assertTrue(OnlineCatalog.Find(B.getISBN()) == B);
//
//	}
//
//	// @Test
//	// public void testEvaluateEmployeeCreatingPatron() {
//	// EmployeeFactory employ=new EmployeeFactory();
//	// Employee Kobe=employ.makeEmployee("Kobe");
//	// Kobe.createPatron("Derick");
//	// RamDatabaseFactory RDF = new RamDatabaseFactory();
//	// RamUserDatabase ram = RDF.makeUserRamDB();
//	//
//	// ram.load(Kobe.userID,Kobe);
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// assertTrue(ram.retrieve()==Kobe);
//	//
//	//
//	//
//	//
//	// }
//	//
//	// @Test
//	// public void testEvaluateEmployeeCreatingPatronTwice() {
//	// EmployeeFactory employ=new EmployeeFactory();
//	// Employee Kobe=employ.makeEmployee("Kobe");
//	// Patron Derick=Kobe.createPatron("Derick");
//	// RamDatabaseFactory RDF = new RamDatabaseFactory();
//	// RamUserDatabase ram = RDF.makeUserRamDB();
//	//
//	// ram.load(Kobe.userID,Kobe);
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// ram.load(Derick.userID,Derick);
//	//
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// ram.load(Kobe.userID);
//	//
//	// assertTrue(ram.retrieve()==Kobe);
//	//
//	//
//	//
//	//
//	// }
//	// @Test
//	// public void testEvaluateDisplayAllfromRamDB() {
//	// EmployeeFactory employ=new EmployeeFactory();
//	// Employee Kobe=employ.makeEmployee("Kobe");
//	// Patron Derick=Kobe.createPatron("Derick");
//	// RamDatabaseFactory RDF = new RamDatabaseFactory();
//	// RamUserDatabase ram = RDF.makeUserRamDB();
//	//
//	// ram.load(Kobe.userID,Kobe);
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// ram.load(Derick.userID,Derick);
//	//
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// ram.displayAll();
//	//
//	//
//	//
//	//
//	// }
//	//
//	// @Test
//	// public void testEvaluateDisplayTransaction() {
//	// EmployeeFactory employ=new EmployeeFactory();
//	// Employee Kobe=employ.makeEmployee("Kobe");
//	// Patron Derick=Kobe.createPatron("Derick");
//	// RamDatabaseFactory RDF = new RamDatabaseFactory();
//	// RamUserDatabase ram = RDF.makeUserRamDB();
//	//
//	// RamTransactionDatabase tram=RDF.makeTransRamDB();
//	//
//	// Book B = new Book(5454, "Catcher");
//	//
//	// ram.load(Kobe.userID,Kobe);
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// ram.load(Derick.userID,Derick);
//	//
//	// try {
//	// ram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// Transaction t=Kobe.addRemoveTransactions(B, Derick);
//	//
//	// tram.load(t);
//	//
//	// try {
//	// tram.create();
//	// } catch (NoLoadedDataException e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	//
//	// ram.displayAll();
//	//
//	//
//	//
//	//
//	// }
//	@Test
//	public void testEvaluateCommandControlTest() {
//		EmployeeFactory employ = new EmployeeFactory();
//		Employee Kobe = employ.makeEmployee("Kobe");
//
//		RamDatabaseFactory RDF = new RamDatabaseFactory();
//		RamUserDatabase ram = RDF.makeUserRamDB();
//
//		CommandControl controller = new CommandControl();
//
//		EmployeeAbility addPatron = new EmployeeAbility();
//
//		CreatePatronCommand add = new CreatePatronCommand(addPatron, "Fisher");
//
//		controller.setCommand(add);
//
//		controller.pressButton();
//
//		ram.displayAll();
//
//	}
//	
//	@Test
//	public void testEvaluateCommandControlRemovePatron() {
//		EmployeeFactory employ = new EmployeeFactory();
//		Employee Kobe = employ.makeEmployee("Kobe");
//
//		RamDatabaseFactory RDF = new RamDatabaseFactory();
//		RamUserDatabase ram = RDF.makeUserRamDB();
//
//		CommandControl controller = new CommandControl();
//
//		EmployeeAbility removePatron = new EmployeeAbility();
//
//		CreatePatronCommand remove = new CreatePatronCommand(removePatron, "Fisher");
//
//		controller.setCommand(remove);
//		controller.pressButton();
//
//		ram.displayAll();
//
//	}
//
//	
//
//}

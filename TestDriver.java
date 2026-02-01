package Thomas_Travel;

import java.util.*;

public class TestDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Enter number of drivers: ");
			int n = sc.nextInt();

			Driver[] drivers = new Driver[n];

			for (int i = 0; i < n; i++) {

				System.out.println("\nEnter details of Driver " + (i + 1));

				System.out.print("Id: ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Category (Auto/Car/Lorry): ");
				String category = sc.nextLine();

				System.out.print("Total Distance: ");
				double dist = sc.nextDouble();

				drivers[i] = new Driver(id, name, category, dist);
			}

			Travel t = new Travel();
			int choice;

			do {
				System.out.println("\n------ MENU ------");
				System.out.println("1. Check Car Driver");
				System.out.println("2. Check Auto Driver");
				System.out.println("3. Check Lorry Driver");
				System.out.println("4. Retrieve by Driver ID");
				System.out.println("5. Count by Category");
				System.out.println("6. Display Drivers by Category");
				System.out.println("7. Maximum Distance Driver");
				System.out.println("8. Sort by Distance");
				System.out.println("0. Exit");

				System.out.print("Enter choice: ");
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
					case 1:
						System.out.print("Enter driver index (1 to n): ");
						int i1 = sc.nextInt() - 1;
						System.out.println(t.isCarDriver(drivers[i1]));
						break;
					case 2:
						System.out.print("Enter driver index (1 to n): ");
						int i2 = sc.nextInt() - 1;
						System.out.println(t.isAutoDriver(drivers[i2]));
						break;
					case 3:
						System.out.print("Enter driver index (1 to n): ");
						int i3 = sc.nextInt() - 1;
						System.out.println(t.isLorryDriver(drivers[i3]));
						break;
					case 4:
						System.out.print("Enter Driver ID: ");
						int id = sc.nextInt();
						System.out.println(t.retrievebyDriver(drivers, n, id));
						break;
					case 5:
						System.out.print("Enter Category (Auto/Car/Lorry): ");
						String cat = sc.nextLine();
						System.out.println("Count: " + t.retrieveCountOfDriver(drivers, n, cat));
						break;
					case 6:
						System.out.print("Enter Category (Auto/Car/Lorry): ");
						String c = sc.nextLine();
						t.retrieveDriver(drivers, n, c);
						break;
					case 7:
						Driver max = t.retrieveMaxDisDriver(drivers, n);
						System.out.println("Max Distance Driver: " + max.getDriverName());
						break;
					case 8:
						t.sortByDis(drivers, n);
						System.out.println("Sorted Drivers by Distance:");
						for (int i = 0; i < n; i++) {
							System.out.println(drivers[i].getDriverName() + " - " + drivers[i].getTotalDistance());
						}
						break;
					case 0:
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Invalid choice!");
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println("Invalid input! Please enter correct values.");
		}
		sc.close();
	}
}

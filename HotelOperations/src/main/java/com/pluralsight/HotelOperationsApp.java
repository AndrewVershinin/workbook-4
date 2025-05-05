package com.pluralsight;

public class HotelOperationsApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Robert", "Administration", 40, 45);
        Reservation res1 = new Reservation("king", 3, true);
        Room room1 = new Room(1, 2, false, false);

        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Pay Rate: $" + emp1.getPayRate());
        System.out.println("Hours Worked: " + emp1.getHoursWorked());
        System.out.println("Regular Hours: " + emp1.getRegularHours());
        System.out.println("Overtime Hours: " + emp1.getOvertimeHours());
        System.out.println("Total Pay: $" + emp1.getTotalPay());

        System.out.println("\nRoom Type: " + res1.getRoomType());
        System.out.println("Nights: " + res1.getNumberOfNights());
        System.out.println("Weekend Stay: " + res1.isWeekend());
        System.out.println("Nightly Price: $" + res1.getNightPrice());
        System.out.println("Total Reservation: $" + String.format("%.2f", res1.getReservationTotal()));

        System.out.println("\nRoom Number: " + room1.getId());
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

    }
}

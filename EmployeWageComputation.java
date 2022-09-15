package com.bl.employeewage.oops;

import java.util.Random;

 class Employee{
	static int fullTime = 1;
	static int partTime = 2;
	static int wagePerHour = 20;
	static int workingDays = 20;
	static int totalWorkingHours = 100;
	
	public static int empCheck() {
		Random rn = new Random();
		int empCheck = rn.nextInt(3);
		return empCheck;
	}
	
	public static int empWorkingHours(int empCheck) {
		int empWorkingHours;
		switch (empCheck) {
		case 1: 
		empWorkingHours = 8;
		break;
		case 2:
		empWorkingHours = 4;
		break;
		default:
			empWorkingHours = 0;
		}
		return empWorkingHours;
	}
	public static int empWage (int empWorkingHours) {
		int empWage = empWorkingHours * wagePerHour;
		return empWage;
	}
	public static int totalEmpSalary() {
		int day = 0;
		int totalEmpSalary = 0;
		int empWorkingHours = 0;
		int empWage = 0;
		int empCheck = 0;
		int totalEmpWorkingHours = 0;
		while (day < workingDays && totalEmpWorkingHours < totalWorkingHours) {
			empCheck = empCheck();
			empWorkingHours = empWorkingHours(empCheck);
			empWage = empWage(empWorkingHours);
			totalEmpWorkingHours += empWorkingHours;
			day++;
			totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	}
}
public class EmployeWageComputation{
		public static void main(String[] args) {
			int totalEmpSalary;
			System.out.println("Welcome to Employee Wage Computation Program");
			totalEmpSalary = Employee.totalEmpSalary();
			System.out.println("totalEmpSalary : " +totalEmpSalary);
		}
}

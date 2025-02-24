package com.i;

public interface ParkingLot {
	void unparkCar(); // Increase empty spots by 1 
	void getCapacity(); // Returns car capacity 
	double calculateFee (car car); // Returns the price based on number of hours 
	void doPayment (car car) throws Exception; 

}

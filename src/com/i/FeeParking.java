package com.i;

public class FeeParking implements ParkingLot { 
	

@Override 
public void unparkCar() { 
} 
@Override 
public void getCapacity() { 
} 
@Override 
public double calculateFee (car car) { 
return 0; 
} 
@Override 
public void doPayment (car car) throws Exception { 
throw new Exception("Parking lot is free"); 
} 
}
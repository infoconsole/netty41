package io.netty.mitix.rpc.v3.common;

public interface CalculatorService {
	
	double add(double op1, double op2);
	
	double substract(double op1, double op2);
	
	double multiply(double op1, double op2);
}

package com.epm.CleanCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
class CompoundandSimpleInterest{
	double SimpleInterest(int principal,double rateofinterest,int timeperiod) {
		double simpleinterest=(principal * rateofinterest * timeperiod) / 100;
		return simpleinterest;	
	}
	double CompoundInterest(int principal,double rateofinterest,int timeperiod) {
		double d=(1+(rateofinterest/100));
		double compoundinterest=principal*Math.pow(d, timeperiod);
		return compoundinterest;
	}
}

public class SimpleAndCompoundinterest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
		int principal=Integer.parseInt(br.readLine());;
		double rateofinterest=Double.parseDouble(br.readLine());;
		int timeperiod=Integer.parseInt(br.readLine());
		 CompoundandSimpleInterest c=new  CompoundandSimpleInterest();
		bw.write("SimpleInterest="+c.SimpleInterest(principal, rateofinterest, timeperiod)+"\n");
		bw.write("CompoundInterest="+c.CompoundInterest(principal, rateofinterest, timeperiod));
		bw.flush();
	}

}

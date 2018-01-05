package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Demo6 {
	
	public static void main(String[] args) {
		
		int x[][]= {{10,20,30},{30,40,90}};
		//int x[][]=new int[2][2];
		//int[][] y=new int[2][2];
		int [][]y=new int[2][2];
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.print(x[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		// Using for each loop 
		
		for(int rows[]:x) {	
			for(int col:rows) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}

}

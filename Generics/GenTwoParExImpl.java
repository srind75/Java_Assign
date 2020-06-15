package com.generics;

public class GenTwoParExImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenTwoParEx<Integer, String> tgObj = new GenTwoParEx<Integer, String>(88, "Generics");
				tgObj.showTypes();
				int v = tgObj.getob1();
				System.out.println("value: " + v);
				String str = tgObj.getob2();
				System.out.println("value: " + str);
				}
				}
package com.javaLab;

import java.math.BigDecimal;

public class StationaryCompany {
	int rm = 18000;
	int lc = 12000;
	int oh = 6000;
	float wom = 0.05f;
	float sw = 0.02f;
	int ac = 3500;
	int sub;
	int pr = 2000;
	float woms = 0.03f;

	public static void main(String[] args) {
		StationaryCompany sc = new StationaryCompany();
		sc.sub = (int) (sc.wom - sc.sw);
		System.out.println(sc.sub);

		sc.sub = (int) (sc.rm * sc.woms);
		System.out.println(sc.sub);

		sc.rm = sc.rm + sc.lc + sc.oh + sc.ac;
		System.out.println(sc.rm);

		sc.rm = sc.rm - sc.sub;
		System.out.println(sc.rm);

		sc.rm = sc.rm / sc.pr;
		System.out.println(sc.rm);

	}

}

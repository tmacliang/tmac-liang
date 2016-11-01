package com.fh.test;

import java.util.Arrays;
import java.util.List;

public class ListTest {
	
	enum Week{Sun,Mon,Tue,Wed,Thu,Fri,Sat};
	
	public static void main(String[] args) {
		Week[] week = {Week.Sun, Week.Mon, Week.Tue, Week.Wed, Week.Thu};
		List<Week> list = Arrays.asList(week);
		list.add(Week.Fri);
	}

}

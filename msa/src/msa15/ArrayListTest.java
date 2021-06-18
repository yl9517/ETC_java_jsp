package msa15;

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.chart.PieChart.Data;


public class ArrayListTest {

	public static void main(String[] args) {


		ArrayList arr = new ArrayList(); //기본 size 10개
		ArrayList arr2 = new ArrayList(3); //size 3개로 지정 (그러나 가변가능한 배열로 크게 상관X)
		

		arr.add("hong");
		arr.add(new Date());
		arr.add(new Man("hong", 20));
		arr.add(1,"park");
		
		String name = (String) arr.get(0);
//		String name2 = (String) arr.get(1);
		System.out.println(name);
//		System.out.println(name2);
		
		Data a = (Data) arr.get(1); //착각하고 data에 집어넣으면 오류남.
		System.out.println(a);
		
		
		
//		for(int i=0; i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
	}

}

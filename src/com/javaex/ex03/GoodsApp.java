package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsApp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Goods> goods = new ArrayList<>();
    	
    	System.out.println("상품을 입력해 주세요. (종료: q)");
    	while(true) {
    		System.out.print(">> ");
    		String input = sc.nextLine();

    		if(input.equals("q")) {
    			System.out.println("입력 완료");
    			break;
    		}
    		
    		String[] inputArr = input.split(",");
    		goods.add(new Goods(inputArr[0], Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])));
    		
    		int countGoods=0;
    		Iterator<Goods> it = goods.iterator();
    		while(it.hasNext()) {
    			it.next().showInfo();
    			countGoods += it.next().getCount();
    		}
    		System.out.println("");
    	} // end while
    }
}
package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FriendApp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> friends = new ArrayList();
    	
    	System.out.println("친구를 세 명 등록해 주세요.");
    	for(int i=0; i<3; i++) {
    		System.out.print(">> ");
    		String input = sc.nextLine();
    		String[] inputArr = input.split(" "); 
    		
    		friends.add(new Friend(inputArr[0], inputArr[1], inputArr[2]));
    	}
    	
    	Iterator<Friend> it = friends.iterator();
    	while(it.hasNext()) {
    		it.next().showInfo();
    	}
    	
    	sc.close();
    }
}
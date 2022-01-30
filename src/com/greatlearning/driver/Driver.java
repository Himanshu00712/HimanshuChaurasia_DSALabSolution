package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.BalancedBracketService;

public class Driver {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		BalancedBracketService balancedBracketService = new BalancedBracketService();

		System.out.println("Please input the Bracket String : ");

		String bracketExpression = sc.next();
		boolean result;
		result = balancedBracketService.checkingBracketsBalenced(bracketExpression);

		if (result)
			System.out.println("The entered String has Balanced Brackets!");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}

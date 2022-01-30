package com.greatlearning.service;

import java.util.Stack;

public class BalancedBracketService {

	public boolean checkingBracketsBalenced(String bracketExpression) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < bracketExpression.length(); i++) {
			char ch = bracketExpression.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{')
				st.push(ch);

			else if (ch == ')' && !st.isEmpty() && st.peek() == '(')
				st.pop();

			else if (ch == ']' && !st.isEmpty() && st.peek() == '[')
				st.pop();

			else if (ch == '}' && !st.isEmpty() && st.peek() == '{')
				st.pop();

			else
				return false;
		}

		return st.isEmpty();
	}

}

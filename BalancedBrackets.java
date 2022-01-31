package com.gl.labsession;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExpression = "([[{}]])";

		if (isBalanced(bracketExpression)) {
			System.out.println("Balanced Brackets");
		} else {
			System.out.println("Unbalanced Brackets");
		}
	}

	private static boolean isBalanced(String bracketExpression) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();

		// iterate through the characters
		for (int i = 0; i < bracketExpression.length(); i++) {
			// check if c is { { {
			char character = bracketExpression.charAt(i);
			// push to stack
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}
			char c;
			// pop from the stack
			switch (character) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;

			}
			// in d if it matches with the correct opening bracket then we can pop it

		}

		return stack.isEmpty();
	}

}

package com.balanced;

	import java.util.Scanner;
	import java.util.Stack;

	public class Balanced {

		    
		    static boolean areBracketsBalanced(String expr)
		    {
		   
		        Stack<Character> stack = new Stack<>();

		        
		        for (int i = 0; i < expr.length(); i++) {
		            char x = expr.charAt(i);

		            if (x == '(' || x == '[' || x == '{') {
		                
		                stack.push(x);
		                continue;
		            }

		        
		            if (stack.isEmpty())
		                return false;
		            char check;
		            switch (x) {
		                case ')':
		                    check = stack.pop();
		                    if (check == '{' || check == '[')
		                        return false;
		                    break;

		                case '}':
		                    check = stack.pop();
		                    if (check == '(' || check == '[')
		                        return false;
		                    break;

		                case ']':
		                    check = stack.pop();
		                    if (check == '(' || check == '{')
		                        return false;
		                    break;
		            }
		        }

		       
		        return (stack.isEmpty());
		    }

		   
		    public static void main(String[] args)
		    {
		        @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
		        String expr = sc.next();

		        // Function call
		        if (areBracketsBalanced(expr))
		            System.out.println("The entered String has Balanced Brackets ");
		        else
		            System.out.println("The entered String do not contain Balanced Bracket ");
		    }
		}


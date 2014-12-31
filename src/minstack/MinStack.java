package minstack;

import java.util.Stack;

public class MinStack {

   //1. Have 2 Stacks: one for the actual stack (LinkedList),
   //   one to store the minimum elements (minStack)
   //3. Push: add element to the stack and if it is smaller than or equal to the current top element
   //         in minStack, push it to minStack
   //         Check: if minStack is empty, then push the element to it
   //4. Pop: remove element from the stack and if it is smaller or equal to the current top element
   //        in minStack, pop the minStack
   //5. Top: return the head of the stack
   //6. getMin: return the head of the minStack
   // KEY CONCEPT: there can be only a limited number of minimum numbers in a stack, such that we do not
   //              need to keep track of all the numbers
   
   Stack<Integer> stack = new Stack<Integer>();
   Stack<Integer> minStack = new Stack<Integer>();

   public void push(int x) {
      stack.push(x);
      if (minStack.isEmpty() || x <= minStack.peek()) {
         minStack.push(x);
      }
   }

   public void pop() {
      if (stack.pop() <= minStack.peek()) {
         minStack.pop();
      }
   }

   public int top() {
      return stack.peek();
   }

   public int getMin() {
      return minStack.peek();
   }

   public static void main(String[] args) {
      MinStack m = new MinStack();
      m.push(9);
      m.push(1);
      m.push(2);
      m.push(6);
      m.push(4);
      m.push(5);
      System.out.println(m.top());
      m.pop();
      m.pop();
      System.out.println(m.top());
      System.out.println(m.getMin());
      System.out.println(m.top());
      System.out.println(m.getMin());
      m.push(10);
      System.out.println(m.top());
      System.out.println(m.getMin());
   }

}

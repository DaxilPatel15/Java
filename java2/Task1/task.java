import java.util.Scanner;
public class Task1 {
 public static void main(String[] args) {
 Scanner obj = new Scanner(System.in);
 System.out.print("Enter first number: ");
 int a = obj.nextInt();
 System.out.print("Enter second number: ");
 int b = obj.nextInt();
 System.out.println(obj.nextLine());
 System.out.print("Enter an arithmetic operator ( +, -, *, /) : ");
 String operater = obj.nextLine();
 if (operater.equals("+")) {
 System.out.print("Answer: " + (a + b));
 } else if (operater.equals("-")) {
 System.out.print("Answer: " + (a - b));
 } else if (operater.equals("*")) {
 System.out.print("Answer: " + (a * b));
 } else if (operater.equals("/")) {
 System.out.print("Answer: " + (double) a / b);
 } else {
 System.out.println("Please enter valid operator :(");


/********************************
 * file: Tran_Geometry.java
 * author: N. Tran
 * class: CS 141 - Programing and Problem Solving
 *
 * assignment: program 2
 * date last modified: 1/25/2017
 *
 * purpose: This program has static methods that accept positive numbers as parameters to calculate the area of a circle, a rectangle,
 *          a triangle, and round the answers to two decimal places.
 ********************************/

public class Tran_Geometry
{ 
        public static String areaOfCircle(double radius)
        { 
            if(radius < 0) // if radius is a negative number, display this message.
            {
                String output = "You can't enter negative value(s). Please check them again!";
                return output;
            }
            else // if radius is a positive number, calculate the area of the circle and round it to two decimal places.
            {
                String output = "The area of the circle is: ";
                return output + String.format("%.2f", Math.PI * radius * radius);
            }
        }

        public static String areaOfRectangle(double length, double width)
        { 
            if(length < 0 || width < 0) // if length or width is negative, display this message.
            {
                String output = "You can't enter negative value(s). Please check them again!";
                return output;
            }
            else // if length and width are a positive numbers, calculate the area of the rectangle and round it to two decimal places.
            {
                String output = "The area of the rectangle is: ";
                return output + String.format("%.2f", length * width);   
            }    
        }
        
        public static String areaOfTriangle(double base, double height)
        {
            if(base < 0 || height < 0) // if base or height is negative, display this message.
            {   
               String output = "You can't enter negative value(s). Please check them again!";
               return output; 
            }
            else // if base and height are a positive numbers, calculate the area of the triangle and round it to two decimal places.
            {
                String output = "The area of the triangle is: ";
                return output + String.format("%.2f", base * height * 0.5);
            }   
        }
}       



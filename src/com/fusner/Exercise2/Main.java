package com.fusner.Exercise2;
// Ryan Fusner
// Exercise 2
// 1/23/2018
public class Main
{
    public static void main(String[] args)
    {
        String[] days = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
        int[] temps = {45, 29, 10, 22, 41, 28, 33};
	    int[] precipChance = {95, 60, 25, 5, 0, 75, 90};

	    for(int i = 0; i < days.length; ++i)
        {
            if (temps[i] < 32 && precipChance[i] > 50)
            {
                System.out.println(days[i]);
            }
        }
    }
}

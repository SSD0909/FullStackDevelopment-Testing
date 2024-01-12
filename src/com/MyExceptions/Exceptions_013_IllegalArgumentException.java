package com.MyExceptions;
/*
 IllegalArgumentException: This program, checks whether the person is eligible for voting or not.
  If the age is greater than or equal to 18 then it will not throw any error.
  If the age is less than 18 then it will throw an error with the error statement.

Also, we can specify “throw new IllegalArgumentException()”
without the error message.

We can also specify Integer.toString(variable_name)
 inside the IllegalArgumentException() and It will print the argument name which
  is not satisfied the given condition.*/

public class Exceptions_013_IllegalArgumentException
{
    public static void print(int a)
    {
        if(a>=18)
        {
            System.out.println("Eligible for Voting");
        }
        else
        {

            throw new IllegalArgumentException("Not Eligible for Voting");


        }

    }
    public static void main(String[] args) {
        Exceptions_013_IllegalArgumentException.print(18);

    }
}

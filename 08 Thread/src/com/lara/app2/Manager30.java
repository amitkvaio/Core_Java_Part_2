package com.lara.app2;

import java.util.Scanner;

class Counter extends Thread
{
	@Override
	public void run()
	{
		int i = 0;
		while (!isInterrupted())
		{
			i++;
			System.out.println("while-loop:=" + i);

			try
			{
				sleep(1000);
			} catch (InterruptedException e)
			{
				break;
			}
		}
	}
}

public class Manager30
{
	public static void main(String[] args)
	{
		Counter c1 = new Counter();
		c1.start();
		Scanner sc = new Scanner(System.in);

		String decider = null;

		do
		{
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("continue?(y|n)");

			decider = sc.next();
		} while ("y".equals(decider));
		c1.interrupt();
		System.out.println("end of the game");
	}
}

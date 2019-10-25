package com.trivadis.bth.git.bisect.playing;

/**
 * Hello world!  Classy clasic.
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
			for (String name : args) {
				System.out.println("Hi"+name);;
			}
		} else {
			System.out.println("Hello World!");
		}
	}
}

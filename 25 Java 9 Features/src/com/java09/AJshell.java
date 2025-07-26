package com.java09;

public class AJshell {

}

/*

JShell is read–eval–print loop – REPL for short.

It’s an interactive tool to evaluate declarations, statements, and expressions of Java, together with an API. 
It is very convenient for testing small code snippets, which otherwise require creating 
	a new class with the main method.


Open CMD and type jshell.

C:\Users\ajitp>jshell
|  Welcome to JShell -- Version 11.0.15
|  For an introduction type: /help intro

jshell> int x = 10;
x ==> 10

jshell> System.out.println(x+5);
15

jshell> String name = "Java";
name ==> "Java"

jshell> name.length();
$4 ==> 4

jshell> int square(int n){
   ...> return n*n;
   ...> }
|  created method square(int)

jshell> square(6);
$6 ==> 36

jshell>

*/

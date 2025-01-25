package com.lara.pack10.threadLocal;

class UserContext {
	private static ThreadLocal<String> currentUser = new ThreadLocal<>();

	public static String getUser() {
		return currentUser.get();
	}

	public static void setUser(String user) {
		currentUser.set(user);
	}

	public static void clear() {
		currentUser.remove();
	}
}

class AuthenticationService {
	public void authenticate(String user) {
		// Authenticate user and store the authenticated user in the ThreadLocal
		// variable
		UserContext.setUser(user);
		System.out.println("User authenticated: " + UserContext.getUser());
		// Perform other operations...
	}
}

public class ThreadLocalDemo5 {
	public static void main(String[] args) {
		AuthenticationService authService = new AuthenticationService();

		// Simulate requests by different users in different threads
		Thread request1 = new Thread(() -> authService.authenticate("Amit"));
		Thread request2 = new Thread(() -> authService.authenticate("Ajit"));
		Thread request3 = new Thread(() -> authService.authenticate("Roshan"));
				
		request1.start();
		request2.start();
		request3.start();
	}
}

/*
Explanation

Each thread stores the authenticated user’s name in UserContext.
Each thread can access the user’s information independently without affecting other threads.
Clear the ThreadLocal variable after request completion to avoid memory leaks.
*/

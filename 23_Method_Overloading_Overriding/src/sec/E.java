package sec;

class E {

}

class F extends E {

}

class G extends F {

}

class H {
	F test() {
		return null;
	}
}

class I extends H {
	G test() {

		System.out.println("from test() of the G");
		return null;
	}

}
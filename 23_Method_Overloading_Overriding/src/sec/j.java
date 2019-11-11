package sec;

class J {

}

class K extends J {
	K test() {
		return null;
	}
}

class L extends K {
	// J test()//L OR K
	K test() {
		return new K();
		//or return new L();
	}
}
//if any method is the return type is then subclass return type should be same 
//or derived data type is called co-variant
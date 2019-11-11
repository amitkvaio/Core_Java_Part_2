package third;

class F
{
	 F F;
	 //F is the attribute of F type;
	 
	 
	 F FF;
	 //FF is the attribute of F type;
	 
	 
	 F()
	 {
		 //constructor
		 
	 }
	 
	 F(F F)
	 {
		//argument constructor,F(F F)-right F is the attribute of F type like F(int i) 
	 }
	 
	 F(F F, F FF)
	 {
		 //taking the two argumentF(F F , F FF)-1st F FF, FF is the attribute of F type 2nd is like above
	 }
	 
	 F F()
	 {
		 //F is the method of F type 
		return F; 
	 }
	 F F(F F)
	 {
		 //F is the method of F type and it taking the argument  of F type.
		 return F;
	 }
	 F F(F F, F FF)
	 {
		 //similarly
		 return F;
	 }
}

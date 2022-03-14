package com.nulll;

public class G {
	public static int G_MANAGED = 0x1;
	public static int G_UNMANAGED = 0x2;
	public static int G_MAINTENANCE = 0x3;
	public static int G_MANAGED_TEST = 0x4;
	public static int G_MODE_MASK = 0x7;
	public static int G_MODE_SHIFT = 0;
	public static int G_RECOVERY_MASK = 0x30;

	public static boolean isGroupUnmanaged(final int status) {
		final int mode = status & G_MODE_MASK;
		final int recovery = status & G_RECOVERY_MASK;
		if ((recovery != 0) || (mode == G_MAINTENANCE) || (mode == G_UNMANAGED)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isGroupUnmanaged(1));
	}
}

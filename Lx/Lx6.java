package Lx;
class Lx6
{ public static void main(String [] args)
	{byte b=122;
	int x=b;
	     b=(byte)x;//加“（byte）”可将int强行压入一个字节
	System.out.println(b);
	}
}

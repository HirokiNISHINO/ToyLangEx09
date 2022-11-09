package kut.compiler.lexer;

public final class TokenClass 
{
	public static final int EOF		 	= -1;
	public static final int IntLiteral 	= -2;
	public static final int Identifier	= -3;
	
	public static String getTokenClassString(int c) {
		switch(c){
		case EOF:
			return "EOF";
		
		case IntLiteral:
			return "IntLiteral";
		
		default:
			return "" + (char)c;
		}
		
	}

}

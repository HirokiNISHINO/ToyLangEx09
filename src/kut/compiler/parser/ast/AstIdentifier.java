package kut.compiler.parser.ast;


import kut.compiler.compiler.CodeGenerator;
import kut.compiler.exception.CompileErrorException;
import kut.compiler.lexer.Token;

public class AstIdentifier extends AstNode 
{
	/**
	 * 
	 */
	protected Token t;
	
	/**
	 * @param t
	 */
	public AstIdentifier(Token t)
	{
		this.t = t;
	}

	
	
	/**
	 *
	 */
	@Override
	protected void printTree(int indent) {
		this.println(indent, "identifier:" + t.getL());
	}

	/**
	 *
	 */
	@Override
	public void cgen(CodeGenerator gen) throws CompileErrorException
	{	
		throw new CompileErrorException("idenfier is not implemented yet.");
	}
	

}

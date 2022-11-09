package kut.compiler.parser.ast;


import kut.compiler.compiler.CodeGenerator;
import kut.compiler.exception.CompileErrorException;

/**
 * @author hnishino
 *
 */
public abstract class AstNode {
	
	
		/**
		 * @return the generated code string
		 */
		public abstract void cgen(CodeGenerator gen) throws CompileErrorException;
		

		/**
		 * 
		 */
		public void printTree() {
			this.printTree(0);
		}
		
		protected abstract void printTree(int indent);
		
		/**
		 * @param indent
		 */
		protected void println(int indent, String s) {
			this.printIndent(indent);
			System.out.println(s);
		}
		
		protected void printIndent(int indent) {
			for (int i = 0; i < indent; i++) {
				System.out.print("    ");
			}
		}

}

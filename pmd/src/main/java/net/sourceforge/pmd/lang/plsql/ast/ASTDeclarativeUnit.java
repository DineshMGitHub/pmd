/* Generated By:JJTree: Do not edit this line. ASTDeclarativeUnit.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTDeclarativeUnit extends SimpleNode {
  public ASTDeclarativeUnit(int id) {
    super(id);
  }

  public ASTDeclarativeUnit(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=629da623f2f291f2efcc2e3aba90349f (do not edit this line) */
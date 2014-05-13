/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStart(AStart node);
    void caseAProgramaStatement(AProgramaStatement node);
    void caseADeclaracao(ADeclaracao node);
    void caseAIdVar(AIdVar node);
    void caseAVarVar(AVarVar node);
    void caseAEmptyVar(AEmptyVar node);
    void caseAIdIdentificador(AIdIdentificador node);
    void caseAIdentificador(AIdentificador node);
    void caseANumberValor(ANumberValor node);
    void caseANumberRealValor(ANumberRealValor node);
    void caseAValor(AValor node);
    void caseAAtribuicaoComandos(AAtribuicaoComandos node);
    void caseASeComandos(ASeComandos node);
    void caseAEnquantoComandos(AEnquantoComandos node);
    void caseAMaisExpressao(AMaisExpressao node);
    void caseAMenosExpressao(AMenosExpressao node);
    void caseATermoExpressao(ATermoExpressao node);
    void caseAMulTermo(AMulTermo node);
    void caseADivTermo(ADivTermo node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAIdFator(AIdFator node);
    void caseAParenFator(AParenFator node);
    void caseAIgualExpressaoLogica(AIgualExpressaoLogica node);
    void caseADiferenteExpressaoLogica(ADiferenteExpressaoLogica node);
    void caseAMenorExpressaoLogica(AMenorExpressaoLogica node);
    void caseAMaiorExpressaoLogica(AMaiorExpressaoLogica node);
    void caseAMenorIgualExpressaoLogica(AMenorIgualExpressaoLogica node);
    void caseAMaiorIgualExpressaoLogica(AMaiorIgualExpressaoLogica node);
    void caseATermoLogicoExpressaoLogica(ATermoLogicoExpressaoLogica node);
    void caseAETermoLogico(AETermoLogico node);
    void caseAOuTermoLogico(AOuTermoLogico node);
    void caseAXorTermoLogico(AXorTermoLogico node);
    void caseAFatorLogicoTermoLogico(AFatorLogicoTermoLogico node);
    void caseAIdFatorLogico(AIdFatorLogico node);
    void caseAParentesesFatorLogico(AParentesesFatorLogico node);

    void caseTPrograma(TPrograma node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTEnquanto(TEnquanto node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTFimSe(TFimSe node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTFimPara(TFimPara node);
    void caseTAte(TAte node);
    void caseTFaca(TFaca node);
    void caseTRepita(TRepita node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTTipo(TTipo node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTBarra(TBarra node);
    void caseTEstrela(TEstrela node);
    void caseTParD(TParD node);
    void caseTParE(TParE node);
    void caseTColD(TColD node);
    void caseTColE(TColE node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTNao(TNao node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTEscreva(TEscreva node);
    void caseTLeia(TLeia node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTSemicolon(TSemicolon node);
    void caseTPonto(TPonto node);
    void caseTVirgula(TVirgula node);
    void caseTComments(TComments node);
    void caseTId(TId node);
    void caseTIdVar(TIdVar node);
    void caseTNumber(TNumber node);
    void caseTNumberReal(TNumberReal node);
    void caseTString(TString node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseTCommentEnd(TCommentEnd node);
    void caseTCommentBody(TCommentBody node);
    void caseTStar(TStar node);
    void caseTSlash(TSlash node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}

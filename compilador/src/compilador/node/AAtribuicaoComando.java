/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuicaoComando extends PComando
{
    private PIdentificador _identificador_;
    private PExpressao _expressao_;

    public AAtribuicaoComando()
    {
        // Constructor
    }

    public AAtribuicaoComando(
        @SuppressWarnings("hiding") PIdentificador _identificador_,
        @SuppressWarnings("hiding") PExpressao _expressao_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setExpressao(_expressao_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuicaoComando(
            cloneNode(this._identificador_),
            cloneNode(this._expressao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuicaoComando(this);
    }

    public PIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(PIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_)
            + toString(this._expressao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identificador_ == oldChild)
        {
            setIdentificador((PIdentificador) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

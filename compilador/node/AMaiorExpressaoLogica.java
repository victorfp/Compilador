/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoLogica _expressaoLogica_;
    private TMaior _maior_;
    private PTermoLogico _termoLogico_;

    public AMaiorExpressaoLogica()
    {
        // Constructor
    }

    public AMaiorExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TMaior _maior_,
        @SuppressWarnings("hiding") PTermoLogico _termoLogico_)
    {
        // Constructor
        setExpressaoLogica(_expressaoLogica_);

        setMaior(_maior_);

        setTermoLogico(_termoLogico_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorExpressaoLogica(
            cloneNode(this._expressaoLogica_),
            cloneNode(this._maior_),
            cloneNode(this._termoLogico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorExpressaoLogica(this);
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
    }

    public PTermoLogico getTermoLogico()
    {
        return this._termoLogico_;
    }

    public void setTermoLogico(PTermoLogico node)
    {
        if(this._termoLogico_ != null)
        {
            this._termoLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoLogico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoLogica_)
            + toString(this._maior_)
            + toString(this._termoLogico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

        if(this._termoLogico_ == child)
        {
            this._termoLogico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        if(this._termoLogico_ == oldChild)
        {
            setTermoLogico((PTermoLogico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMenorIgualExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoLogica _expressaoLogica_;
    private TMenorIgual _menorIgual_;
    private PTermoLogico _termoLogico_;

    public AMenorIgualExpressaoLogica()
    {
        // Constructor
    }

    public AMenorIgualExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TMenorIgual _menorIgual_,
        @SuppressWarnings("hiding") PTermoLogico _termoLogico_)
    {
        // Constructor
        setExpressaoLogica(_expressaoLogica_);

        setMenorIgual(_menorIgual_);

        setTermoLogico(_termoLogico_);

    }

    @Override
    public Object clone()
    {
        return new AMenorIgualExpressaoLogica(
            cloneNode(this._expressaoLogica_),
            cloneNode(this._menorIgual_),
            cloneNode(this._termoLogico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorIgualExpressaoLogica(this);
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

    public TMenorIgual getMenorIgual()
    {
        return this._menorIgual_;
    }

    public void setMenorIgual(TMenorIgual node)
    {
        if(this._menorIgual_ != null)
        {
            this._menorIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menorIgual_ = node;
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
            + toString(this._menorIgual_)
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

        if(this._menorIgual_ == child)
        {
            this._menorIgual_ = null;
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

        if(this._menorIgual_ == oldChild)
        {
            setMenorIgual((TMenorIgual) newChild);
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
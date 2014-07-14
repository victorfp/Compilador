/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ARelacionalExpressaoLogica extends PExpressaoLogica
{
    private PExpressao _expressao_;
    private POpRel _opRel_;
    private PExpressaoLogica _expressaoLogica_;

    public ARelacionalExpressaoLogica()
    {
        // Constructor
    }

    public ARelacionalExpressaoLogica(
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") POpRel _opRel_,
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_)
    {
        // Constructor
        setExpressao(_expressao_);

        setOpRel(_opRel_);

        setExpressaoLogica(_expressaoLogica_);

    }

    @Override
    public Object clone()
    {
        return new ARelacionalExpressaoLogica(
            cloneNode(this._expressao_),
            cloneNode(this._opRel_),
            cloneNode(this._expressaoLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelacionalExpressaoLogica(this);
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

    public POpRel getOpRel()
    {
        return this._opRel_;
    }

    public void setOpRel(POpRel node)
    {
        if(this._opRel_ != null)
        {
            this._opRel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opRel_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressao_)
            + toString(this._opRel_)
            + toString(this._expressaoLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._opRel_ == child)
        {
            this._opRel_ = null;
            return;
        }

        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._opRel_ == oldChild)
        {
            setOpRel((POpRel) newChild);
            return;
        }

        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
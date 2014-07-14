/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AOperacaoExpressaoLogica extends PExpressaoLogica
{
    private PExpressao _esq_;
    private POpRel _opRel_;
    private PExpressao _dir_;

    public AOperacaoExpressaoLogica()
    {
        // Constructor
    }

    public AOperacaoExpressaoLogica(
        @SuppressWarnings("hiding") PExpressao _esq_,
        @SuppressWarnings("hiding") POpRel _opRel_,
        @SuppressWarnings("hiding") PExpressao _dir_)
    {
        // Constructor
        setEsq(_esq_);

        setOpRel(_opRel_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AOperacaoExpressaoLogica(
            cloneNode(this._esq_),
            cloneNode(this._opRel_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOperacaoExpressaoLogica(this);
    }

    public PExpressao getEsq()
    {
        return this._esq_;
    }

    public void setEsq(PExpressao node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
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

    public PExpressao getDir()
    {
        return this._dir_;
    }

    public void setDir(PExpressao node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esq_)
            + toString(this._opRel_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._opRel_ == child)
        {
            this._opRel_ = null;
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esq_ == oldChild)
        {
            setEsq((PExpressao) newChild);
            return;
        }

        if(this._opRel_ == oldChild)
        {
            setOpRel((POpRel) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMenorIgualOpRel extends POpRel
{
    private TMenorIgual _menorIgual_;

    public AMenorIgualOpRel()
    {
        // Constructor
    }

    public AMenorIgualOpRel(
        @SuppressWarnings("hiding") TMenorIgual _menorIgual_)
    {
        // Constructor
        setMenorIgual(_menorIgual_);

    }

    @Override
    public Object clone()
    {
        return new AMenorIgualOpRel(
            cloneNode(this._menorIgual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorIgualOpRel(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._menorIgual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menorIgual_ == child)
        {
            this._menorIgual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menorIgual_ == oldChild)
        {
            setMenorIgual((TMenorIgual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

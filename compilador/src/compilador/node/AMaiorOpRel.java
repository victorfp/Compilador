/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorOpRel extends POpRel
{
    private TMaior _maior_;

    public AMaiorOpRel()
    {
        // Constructor
    }

    public AMaiorOpRel(
        @SuppressWarnings("hiding") TMaior _maior_)
    {
        // Constructor
        setMaior(_maior_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorOpRel(
            cloneNode(this._maior_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorOpRel(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._maior_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

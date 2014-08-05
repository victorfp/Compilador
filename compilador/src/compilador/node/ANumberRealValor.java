/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ANumberRealValor extends PValor
{
    private TNumberReal _numberReal_;

    public ANumberRealValor()
    {
        // Constructor
    }

    public ANumberRealValor(
        @SuppressWarnings("hiding") TNumberReal _numberReal_)
    {
        // Constructor
        setNumberReal(_numberReal_);

    }

    @Override
    public Object clone()
    {
        return new ANumberRealValor(
            cloneNode(this._numberReal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberRealValor(this);
    }

    public TNumberReal getNumberReal()
    {
        return this._numberReal_;
    }

    public void setNumberReal(TNumberReal node)
    {
        if(this._numberReal_ != null)
        {
            this._numberReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numberReal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numberReal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numberReal_ == child)
        {
            this._numberReal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numberReal_ == oldChild)
        {
            setNumberReal((TNumberReal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

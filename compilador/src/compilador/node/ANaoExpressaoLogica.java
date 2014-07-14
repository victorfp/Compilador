/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ANaoExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoLogica _expressaoLogica_;

    public ANaoExpressaoLogica()
    {
        // Constructor
    }

    public ANaoExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_)
    {
        // Constructor
        setExpressaoLogica(_expressaoLogica_);

    }

    @Override
    public Object clone()
    {
        return new ANaoExpressaoLogica(
            cloneNode(this._expressaoLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANaoExpressaoLogica(this);
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
            + toString(this._expressaoLogica_);
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

        throw new RuntimeException("Not a child.");
    }
}

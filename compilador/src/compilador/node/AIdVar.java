/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AIdVar extends PVar
{
    private PIdentificador _identificador_;
    private PVarTail _varTail_;

    public AIdVar()
    {
        // Constructor
    }

    public AIdVar(
        @SuppressWarnings("hiding") PIdentificador _identificador_,
        @SuppressWarnings("hiding") PVarTail _varTail_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setVarTail(_varTail_);

    }

    @Override
    public Object clone()
    {
        return new AIdVar(
            cloneNode(this._identificador_),
            cloneNode(this._varTail_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdVar(this);
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

    public PVarTail getVarTail()
    {
        return this._varTail_;
    }

    public void setVarTail(PVarTail node)
    {
        if(this._varTail_ != null)
        {
            this._varTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varTail_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_)
            + toString(this._varTail_);
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

        if(this._varTail_ == child)
        {
            this._varTail_ = null;
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

        if(this._varTail_ == oldChild)
        {
            setVarTail((PVarTail) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyVar extends PVar
{

    public AEmptyVar()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptyVar();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyVar(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}

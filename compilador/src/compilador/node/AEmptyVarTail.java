/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyVarTail extends PVarTail
{

    public AEmptyVarTail()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptyVarTail();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyVarTail(this);
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

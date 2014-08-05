/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TAte extends Token
{
    public TAte()
    {
        super.setText("ate");
    }

    public TAte(int line, int pos)
    {
        super.setText("ate");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAte(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAte(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAte text.");
    }
}

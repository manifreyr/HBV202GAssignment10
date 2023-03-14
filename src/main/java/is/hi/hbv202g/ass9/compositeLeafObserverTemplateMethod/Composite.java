package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;

public abstract class Composite {
    protected ArrayList<MathExpression> leaves;
    private int lastObservedResult;

    public Composite() {
        leaves = new ArrayList<>();
    }

    public void add(MathExpression c) {
        leaves.add(c);
    }

    public abstract int getResult();

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

}

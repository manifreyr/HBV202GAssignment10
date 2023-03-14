package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;

public class PlusComposite implements MathExpression, Observer {
    private ArrayList<MathExpression> leaves;
    private int lastObservedResult;

    public PlusComposite() {
        leaves = new ArrayList<>();
    }

    public void add(MathExpression c) {
        leaves.add(c);
    }

    public int getResult() {
        int sum = 0;
        for (MathExpression c : leaves) {
            sum += c.getResult();
        }
        return sum;
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}

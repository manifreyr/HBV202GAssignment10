package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;

public class MultiplyComposite implements MathExpression, Observer  {
    private ArrayList<MathExpression> leaves;
    private int lastObservedResult;

    public MultiplyComposite() {
        leaves = new ArrayList<>();
    }

    public void add(MathExpression c) {
        leaves.add(c);
    }

    public int getResult() {
        int sum = 1;
        for (MathExpression c : leaves) {
            sum *= c.getResult();
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

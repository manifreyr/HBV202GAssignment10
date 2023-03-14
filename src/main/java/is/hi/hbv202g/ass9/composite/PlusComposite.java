package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;

public class PlusComposite implements MathExpression{
    private ArrayList<MathExpression> leaves;

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
}

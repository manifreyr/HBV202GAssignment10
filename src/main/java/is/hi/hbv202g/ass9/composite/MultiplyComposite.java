package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;

public class MultiplyComposite implements MathExpression{
    private ArrayList<MathExpression> leaves;

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

}

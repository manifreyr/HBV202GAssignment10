package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;

public class PlusComposite extends Composite implements MathExpression, Observer {

    public PlusComposite() {
        super();
    }

    public int getResult() {
        int sum = 0;
        for (MathExpression c : leaves) {
            sum += c.getResult();
        }
        return sum;
    }
}

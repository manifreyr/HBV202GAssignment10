package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;

public class MultiplyComposite extends Composite implements MathExpression, Observer {

    public MultiplyComposite() {
        super();
    }

    public int getResult() {
        int sum = 1;
        for (MathExpression c : leaves) {
            sum *= c.getResult();
        }
        return sum;
    }

}

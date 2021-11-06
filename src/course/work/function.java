package course.work;

import org.nfunk.jep.JEP;

/**
 *
 * @author Appledore
 */
public class function {

    JEP j = new JEP();

    public function(String def) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if (j.hasError()) {
            System.out.print(j.getErrorInfo());
        }
    }

    public double value(double x) {
        double r;
        j.addVariable("x", x);
        r = j.getValue();
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
        }
        return r;
    }
}

package chapter10;

import chapter10.MultiException;

/**
 * Created by force_to on 2016/10/2.
 */
public class RunMultiException {
    public RunMultiException() {
        new MultiException(new String[]{"", "2"});
    }
}

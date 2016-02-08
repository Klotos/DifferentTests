//
// Translated by CS2J (http://www.cs2j.com): 08.02.2016 21:10:29
//

package TestCSharpToJavaConversion;

import java.util.Calendar;
import java.util.Date;
import TestCSharpToJavaConversion.PropertiesHolder;

public class Invoker   
{
    public void invoke() throws Exception {
        PropertiesHolder ph = new PropertiesHolder("value");
        int length = ph.getGetStrLen();
        ph.setSetStr("new value");
        Int32 newLength = ph.getGetStrLen();
        ph.setAutoProp1(Calendar.getInstance().getTime());
        Date val1 = ph.getAutoProp1();
        ph.setProp2(5.0);
        Double val2 = ph.getProp2();
    }

}



//
// Translated by CS2J (http://www.cs2j.com): 08.02.2016 21:10:29
//

package TestCSharpToJavaConversion;

import java.util.Date;

public class PropertiesHolder   
{
    public PropertiesHolder(String param) throws Exception {
        this._field1 = param;
    }

    private String _field1;
    public int getGetStrLen() throws Exception {
        return this._field1.length();
    }

    public void setSetStr(String value) throws Exception {
        this._field1 = value;
    }

    private double __Prop2;
    public double getProp2() {
        return __Prop2;
    }

    public void setProp2(double value) {
        __Prop2 = value;
    }

    private Date __AutoProp1;
    public Date getAutoProp1() {
        return __AutoProp1;
    }

    public void setAutoProp1(Date value) {
        __AutoProp1 = value;
    }

}



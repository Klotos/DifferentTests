using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestCSharpToJavaConversion
{
    public class Invoker
    {
        public void Invoke()
        {
            var ph = new PropertiesHolder("value");
            int length = ph.GetStrLen;
            ph.SetStr = "new value";
            var newLength = ph.GetStrLen;

            ph.AutoProp1 = DateTime.Now;
            DateTime val1 = ph.AutoProp1;
            
            ph.Prop2 = 5.0;
            var val2 = ph.Prop2;

        }
    }
}

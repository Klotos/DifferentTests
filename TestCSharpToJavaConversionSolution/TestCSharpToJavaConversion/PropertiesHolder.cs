using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestCSharpToJavaConversion
{
    public class PropertiesHolder
    {
        internal PropertiesHolder(string param)
        {
            this._field1 = param;
        }
        private string _field1;

        public int GetStrLen
        {
            get { return this._field1.Length; }
        }

        internal string SetStr
        {
            set
            {
                this._field1 = value;
            }
        }

        public double Prop2 { get; internal set; }

        public DateTime AutoProp1 { get; set; }
    }
}

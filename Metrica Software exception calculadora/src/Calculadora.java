import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jdi.CharType;

public class Calculadora {

    private Logger logger;

    public Calculadora() {
    }

    public Double add(Double par1, Double par2) {
    return par1 + par2;
    }

    public Double sub(Double par1, Double par2) {
    return par1 - par2;
    }


    public Double mul(Double par1, Double par2)  {
    return par1 * par2;
    }

    public Double div(Double par1, Double par2) throws ExceptionCalculadora {
    if (par2 == 0) {
            throw new ExceptionCalculadora("Não posso dividir por zero");
        } else {
            return par1 / par2;
        }
    }
}
import src.main.java.com.jb.javaexcepcions.models.Cuenta;
import src.main.java.com.jb.javaexcepcions.models.CuentaAhorros;
public class Test {
public static void main(String[] args) 
{
    Cuenta test = new CuentaAhorros(1,9);
    test.deposita(100);
    try 
    {
       test.saca(1000);
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
    System.out.println("Saldo restante "+test.getSaldo());
}
}
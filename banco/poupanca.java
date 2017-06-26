public class poupanca extends conta
{
    
    public poupanca(String num, float saldo)
    {
        super(num);
    }

    public poupanca(String num)
    {
        super(num);
    }
    
    public void renderJuro(double taxa)
    {
        double redimento=this.getSaldo()*taxa;
        this.creditar(redimento);
        
    }
    
}

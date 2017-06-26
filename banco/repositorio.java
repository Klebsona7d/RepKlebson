public class repositorio
{
    private conta contas[];
    private int indice;
    private final int TAMANHO=100;

    public repositorio()
    {
        this.contas=new conta[TAMANHO];
        this.indice = 0;
    }
    public int getId(String num)
    {
        for (int i = 0; i < indice; i++)
        {
            if(contas[i].getNum().equals(num))
            {
                return i;
            }
            
        }
        return -1;
    }
    public void inserir(conta nova)
    {
        contas[indice]=nova;
        indice++;
    }
    public void removerByindex(int x)
    {
        if(x<indice && x>0)
        {
            for (int i = x; i < indice-1; i++)
            {
                contas[i]=contas[i+1];
            }
            contas[indice-1]=null;
            indice--;
        }
    }
    public void removerByNum(String num)
    {
        removerByindex(getId(num));
    }

    @Override
    public String toString()
    {
        String ret="";
        for (int i = 0; i < indice; i++)
        {
            ret+=this.contas[i].getNum()+"\n";
        }
        return ret; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

public class Main
{
    public static void main(String[] args)
    {
        repositorio BB= new repositorio();
        BB.inserir(new conta("12345"));
        BB.inserir(new conta("213"));
        BB.inserir(new poupanca("1345", 0));
        
        System.out.println(BB);
        BB.removerByindex(1);
        System.out.println(BB);
    }
    
}

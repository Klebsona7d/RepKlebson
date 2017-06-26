
public class ProgramameuArray 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MeuArray x = new MeuArray();
        System.out.println(x);
        System.out.println("O Maior valor: " + x.getGreater());
        x.ChagePosition();
        System.out.println(x);
        System.out.println(x.countNumber(4));
        

    }

    
}

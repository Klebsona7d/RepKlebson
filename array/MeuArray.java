
public class MeuArray
{
    private int vetor[] = new int[5];
    private int tam = 5; // Criado

    public MeuArray()
    {
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

    }
// Construtor que recebe os 5 valores inteiros
    public MeuArray(int x1, int x2, int x3, int x4, int x5)
    {
        vetor[0] = x1;
        vetor[1] = x2;
        vetor[2] = x3;
        vetor[3] = x4;
        vetor[4] = x5;
    }

    public void setVetor(int x1, int x2, int x3, int x4, int x5)
    {
        vetor[0] = x1;
        vetor[1] = x2;
        vetor[2] = x3;
        vetor[3] = x4;
        vetor[4] = x5;
    }

    // Metodo
    public int getGreater()
    {
        int maior = vetor[0];

        for (int i = 0; i < tam; i++)
        {
            if (maior < vetor[i]) //verificar
            {
                maior = vetor[i]; //assume o maior
            }
        }
        return maior;
    }

    public int getSum()
    {
        int soma = 0;

        for (int i = 0; i < tam; i++)
        {
            soma += vetor[i]; //soma = soma + vetor [i]
        }
        return soma;
    }

    public int countNumber(int alvo) // quantas vezes aparece o número
    {
        int ocorrencia = 0; //assumindo

        for (int i = 0; i < tam; i++)
        {
            if (alvo == vetor[i]) // se a posição atual é o valor procurado/buscado
            {
                ocorrencia++;
            }
        }
        return ocorrencia;
    }

    public void ChagePosition()
    {
        int i = 0; //marcar o começo
        int j = tam - 1; // marcar o final
        int aux;
        while (i < j) //
        {
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            i++;    //i e j (vão se fechando)
            j--;
        }

    }

    @Override
    public String toString() // 
    {
        String ret = "{";
        for (int i = 0; i < tam; i++) 
        {
            ret += vetor[i];
            if (i < tam - 1) // colocar virgulas entre os número com a exceção da ultima posição
            {
                ret = ret + ",";
            }

        }
        ret = ret + "}";
        return ret;

    }
}

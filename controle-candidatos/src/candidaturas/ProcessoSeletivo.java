package candidaturas;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo
{
    public static void main (String[] args)
    {
        System.out.println("Processo Seletivo!");

        mostrarCandidatos();
        selecaoCandidatos();
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

    // Método que simula o valor pretendido
    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void mostrarCandidatos()
    {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        System.out.println("Os candidatos são:");
        for (String candidato : candidatos)
        {
            System.out.println(candidato);
        }
    }

    static void selecaoCandidatos()
    {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if (salarioPretendido <= salarioBase)
            {
                System.out.println("Candidato(a) "+candidato+" foi selecionado(a).");
                candidatosSelecionados++;

                int i;
                for (i = 0; i < 3; i++)
                {
                    System.out.println((i + 1) + ": Ligando para " + candidato + "...");

                    if (!atender())
                    {
                        System.out.println("Não atendeu.");
                    }
                    else
                    {
                        System.out.print("Conseguimos contato com o candidato na ");
                        System.out.println((i+1) + "a tentativa.");
                        break;
                    }
                }
                if (i == 3) System.out.println("Não conseguimos contato com " + candidato + ".");
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido)
    {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido)
        {
            System.out.println("Ligar para o candidato.");
        }
        else if (salarioBase == salarioPretendido)
        {
            System.out.println("Ligar com contraproposta");
        }
        else
        {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
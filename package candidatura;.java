package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(string []args){ 
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"}
        for (String candidato : candidatos){
            entrandoEmCOntato(candidato);//entrando em contato com candidatos selecionados
        }
       
    }
    static void entrandoEmCOntato (String candidato){
        int tentativasRealizadas  = 1;
        boolean continuarTentando = True;
        boolean atendeu = False;
        do {
            antendeu = false;
            continuarTentando = !atendeu;
            if (continuarTentando)
            tentativasRealizadas++;
            else 
            System.out.println("CONTATO REALIZADO COM SUCESSO")
        }
    }while (continuarTentando && tentativasRealizadas<3);

    static void imprimir Selecionads(){// imprimir os candidatos para o RH ligar
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"}
        System.out.println("Imprimindo a lista de candidatos infromando o indice do candidato")
        for (int indice = 0;indice< candidatos.length;indice++){
            System.out.println("O Candidato de nº" + (indice+) + "é" + candidatos[indice]); //imprime os candidatos da lista e +1, comecando do 1

        }
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"}
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0
     while (candidatosSelecionados < 5 && candidatosAtual <candidatos.legth){ // imprimir enquanto tiver candidato na minha lista
        String candidato = candidato[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato" + candidato + "solicitou este valor de salario" +salarioPretendido);
        if (salarioBase >= salarioPretendido){
            System.out.println("O candidato"+candidato+"foi selecionado para a vaga")
            candidatosSelecionados++
        }
        candidatosAtual++;
     }   
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if (salarioBase = salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    
}

package domain;

public class Papel extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL: System.out.println("Empatou - Papel empata com Papel."); break;
            case TESOURA: System.out.println("Perdeu - Tesoura corta Papel."); break;
            case LAGARTO: System.out.println("Perdeu - Lagarto come Papel."); break;
            case PEDRA: System.out.println("Ganhou - Papel cobre Pedra."); break;
            case SPOCK: System.out.println("Ganhou - Papel refuta Spock."); break;
            default: System.out.println("Opção inválida"); break;
        }
    }
}

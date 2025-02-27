package domain;

public class Spock extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL: System.out.println("Perdeu - Papel refuta Spock."); break;
            case TESOURA: System.out.println("Ganhou - Spock esmaga Tesoura."); break;
            case LAGARTO: System.out.println("Ganhou - Spock envenena Lagarto."); break;
            case PEDRA: System.out.println("Perdeu - Spock vaporiza Pedra."); break;
            case SPOCK: System.out.println("Empatou - Spock empata com Spock."); break;
            default: System.out.println("Opção inválida"); break;
        }
    }
    
}

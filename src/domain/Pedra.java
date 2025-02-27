package domain;

public class Pedra extends Algoritmo{
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL: System.out.println("Perdeu - Papel cobre Pedra."); break;
            case TESOURA: System.out.println("Ganhou - Pedra quebra Tesoura."); break;
            case LAGARTO: System.out.println("Ganhou - Pedra esmaga Lagarto."); break;
            case PEDRA: System.out.println("Empatou - Pedra empata com Pedra."); break;
            case SPOCK: System.out.println("Perdeu - Spock vaporiza Pedra."); break;
            default: System.out.println("Opção inválida"); break;
        }

    }
}

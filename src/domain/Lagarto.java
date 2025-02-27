package domain;

public class Lagarto extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL: System.out.println("Perdeu - Papel cobre Lagarto."); break;
            case TESOURA: System.out.println("Perdeu - Tesoura decapita Lagarto."); break; 
            case LAGARTO: System.out.println("Empatou - Lagarto empata com Lagarto."); break;
            case PEDRA: System.out.println("Ganhou - Lagarto come Pedra."); break;
            case SPOCK: System.out.println("Ganhou - Lagarto envenena Spock."); break;
            default: System.out.println("Opção inválida"); break;
        }
    }    
}

package domain;

public class Tesoura extends  Algoritmo{
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL: System.out.println("Ganhou - Tesoura corta Papel."); break;
            case TESOURA: System.out.println("Empatou - Tesoura empata com Tesoura."); break;
            case LAGARTO: System.out.println("Ganhou - Tesoura decapita Lagarto."); break;
            case PEDRA: System.out.println("Perdeu - Pedra quebra Tesoura."); break;
            case SPOCK: System.out.println("Perdeu - Spock esmaga Tesoura."); break;
            default: System.out.println("Opção inválida"); break;
        }
    }
}

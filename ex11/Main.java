package ex11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dinossauro skeep = new Dinossauro();
        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione uma letra referente as opções:");
        System.out.println("(P)ular           (C)orrer            Co(M)er");
        System.out.println("C(A)ntar          Tomar (S)ol         Ficar na S(O)mbra");
        System.out.println("E: encerra o jogo.");

        String letra = scan.next();

        while (!letra.equals("E")) {
            if (letra.equals("P")) {
                skeep.Pular();
            } else if (letra.equals("C")) {
                skeep.Correr();
            } else if (letra.equals("M")) {
                skeep.Comer();
            } else if (letra.equals("A")) {
                skeep.Cantar();
            } else if (letra.equals("S")) {
                skeep.TomarSol();
            } else if (letra.equals("O")) {
                skeep.FicarNaSombra();
            } else {
                System.out.println("Opção inválida. digite novamente.");
            }
            System.out.println("Selecione uma letra referente as opções:");
            System.out.println("(P)ular           (C)orrer            Co(M)er");
            System.out.println("C(A)ntar          Tomar (S)ol         Ficar na S(O)mbra");
            System.out.println("E: encerra o jogo.");
            letra = scan.next();
        }

        skeep.Encerrar();

    }

}

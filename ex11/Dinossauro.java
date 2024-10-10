package ex11;

public class Dinossauro {

    private int energia = 100;
    private int velocidade = 100;
    private int temperatura = 32;
    private String humor = " ";

    public void Pular() {
        if (energia >= 8) {
            energia = energia - 8;
        }
        if (velocidade >= 7) {
            velocidade = velocidade - 7;
        }

        humor = "Feliz";

        System.out.println("Skeep pulou.");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

    public void Correr() {
        if (energia >= 10) {
            energia = energia - 10;
        }
        if (velocidade >= 7) {
            velocidade = velocidade - 7;
        }

        humor = "Feliz";

        System.out.println("Skeep correu.");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

    public void Comer() {
        if (energia <= 93) {
            energia = energia + 7;
        }
        if (velocidade >= 8) {
            velocidade = velocidade - 8;
        }
        humor = "Feliz";

        System.out.println("Skeep comeu.");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

    public void Cantar() {
        if (energia >= 4) {
            energia = energia - 4;
        }

        humor = "Feliz";

        System.out.println("Skeep cantou.");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

    public void TomarSol() {
        if (velocidade <= 95) {
            velocidade = velocidade + 5;
        }
        temperatura = temperatura + 2;
        humor = "Feliz";

        System.out.println("Skeep tomou sol.");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

    public void FicarNaSombra() {
        if (energia <= 95) {
            energia = energia + 5;
        }
        humor = "Triste";
        temperatura = temperatura - 2;

        System.out.println("Skeep ficou na sombra.");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

    public void Encerrar() {
        System.out.println("Jogo encerrado. Características do Skeep:");
        System.out.println("Energia = " + energia);
        System.out.println("Velocidade = " + velocidade);
        System.out.println("Temperatura = " + temperatura);
        System.out.println("Humor = " + humor);
    }

}

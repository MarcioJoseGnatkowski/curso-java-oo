package br.com.devmedia.curso_java_oo.aula13Polimorfismo;

public class Aula {

    private Veiculo veiculo;
    private Carro carro;
    private Moto moto;

    void veiculos() {

        veiculo = new Ford();
        veiculo.setCor("Amarelo");
        veiculo.setPeso(600);
        System.out.println(veiculo.toString());

        veiculo = new Yamaha();
        veiculo.setCor("Preta");
        veiculo.setPeso(120);
        //não acesso setnome
        System.out.println(veiculo.toString());

        veiculo = new Yamaha(); // up cast
        veiculo.setCor("Preta");
        veiculo.setPeso(120);
        //não acesso setnome
        System.out.println(veiculo.toString());

        /*
          retire do veiculo a parte 'moto', criar instancia moto
        */
        moto = (Moto) veiculo; // forçando barra down cast
        moto.setNome("Gambiarra");
        System.out.println(moto.toString()+ ", " + moto.getNome());

        moto = (Yamaha) veiculo; // forçando barra down cast
        moto.setNome("Yamaha teste");
        System.out.println(moto.toString()+ ", " + moto.getNome());

    }

    void carrosEMotos() {

        carro = new Ford();
        carro.setCor("Amarelo");
        carro.setPeso(600);
        System.out.println(carro.toString());

        moto = new Yamaha();
        moto.setCor("Preta");
        moto.setPeso(120);
        moto.setNome("Fazer 250");
        System.out.println(moto.toString() + ", " + moto.getNome());
    }

    public static void main(String[] args){

        new Aula().veiculos();
        new Aula().carrosEMotos();

        Ford f = new Ford();
        f.setCor("Preta");
        f.setPeso(600);
        System.out.println(f.toString());

        Yamaha y = new Yamaha();
        y.setCor("Azul");
        y.setPeso(100);
        System.out.println(y.toString());

    }
}

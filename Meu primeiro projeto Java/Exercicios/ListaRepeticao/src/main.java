public class main {

    public static void main(String[] args) {
//Calculadora

        System.out.println("Calculadora");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(10, 20);
        Calculadora.multiplicao(10, 20);
        Calculadora.divisao(10, 20);


//Obter Mensagem

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(3);
        Mensagem.obterMensagem(21);
// Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 5);

    }
}
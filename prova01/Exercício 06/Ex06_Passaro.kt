//Exercicio 06
// Crie uma interface Voador com um método voar. 
//Crie uma classe Passaro que implemente a interface Voador. 
//Crie uma classe Helicoptero que implemente a interface Voador. 
//Crie 3 objetos Passaro e dois objetosVoador, insira eles em uma lista e percorra a lista chamando o método voar.

// Nome Integrantes: Lucas Coelho e Luciana Wessner


// Classe Passaro que implementa a interface Voador
class Passaro(val nome: String) : Voador {
    // Implementação do método voar para a classe Passaro
    override fun voar() {
        println("$nome está voando!")
    }
}

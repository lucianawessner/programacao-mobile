//Exercicio 06
// Crie uma interface Voador com um método voar. 
//Crie uma classe Passaro que implemente a interface Voador. 
//Crie uma classe Helicoptero que implemente a interface Voador. 
//Crie 3 objetos Passaro e dois objetosVoador, insira eles em uma lista e percorra a lista chamando o método voar.

// Nome Integrantes: Lucas Coelho e Luciana Wessner


fun main() {
    // Criação de objetos Passaro
    val passaro1 = Passaro("Papagaio")
    val passaro2 = Passaro("Canário")
    val passaro3 = Passaro("Falcão")

    // Criação de objetos Helicoptero
    val helicoptero1 = Helicoptero("Apache")
    val helicoptero2 = Helicoptero("Hércules")

    // Criação de uma lista de objetos Voador
    val voadores: List<Voador> = listOf(passaro1, passaro2, passaro3, helicoptero1, helicoptero2)

    // Percorre a lista de voadores e chama o método voar
    for (voador in voadores) {
        voador.voar()
    }
}
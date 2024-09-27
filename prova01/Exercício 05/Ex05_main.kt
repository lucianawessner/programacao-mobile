//Exercicio 05
// Crie uma classe base Animal com os atributos nome e idade. 
//Crie uma subclasse Cachorro que herde de Animal e adicione um atributo raca. 
//Implemente um método latir na classe Cachorro. 
//Crie um objeto Cachorro e chame os métodos latir e mostrarInformacoes (herdado de Animal).

// Nome Integrantes: Lucas Coelho e Luciana Wessner


fun main() {
    // Cria um objeto da classe Cachorro, passando os valores para o construtor
    val cachorro = Cachorro("Rex", 5, "Labrador")
    
    // Chama o método latir do objeto cachorro
    cachorro.latir()
    
    // Chama o método mostrarInformacoes herdado da classe Animal
    cachorro.mostrarInformacoes()
}
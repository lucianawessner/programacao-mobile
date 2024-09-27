//Exercicio 04
// Crie uma classe Pessoa com os atributos nome, idade e cidade. 
//Implemente um método mostrarInformacoes que exiba todas as informações da pessoa. 
//Crie um objeto Pessoa e chame o método mostrarInformacoes.

// Nome Integrantes: Lucas Coelho e Luciana Wessner


fun main() {
    // Cria um objeto da classe Pessoa, passando os valores para o construtor
    val pessoa = Pessoa("João", 30, "São Paulo")
    
    // Chama o método mostrarInformacoes para exibir os dados da pessoa
    pessoa.mostrarInformacoes()
}
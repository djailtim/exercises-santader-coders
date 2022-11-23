package Lesson5;

class Messages {
    public static String messageWelcome = "=====\tSeja Bem Vindo\t=====";
    public static String messageToDo = """
        O QUE DESEJA FAZER?
        1 - Cadastrar Produto
        2 - Realizar Compra            
    """;
    public static String messageListProducts = "=====\tLista de produtos\t=====";
    public static String messagePurchase = "Adicione o produto desejado e a quantidade separado por espaço:";
    public static String messageInputLine = "> ";
    public static String messageTotalValueCart = """
    
    =====   =====   =====   =====   =====   =====
    O valor total dos produtos é: R$ %.2f%n
    """;
    public static String messageErrorOptionInput = "Opção inválida, digite uma opção válida: ";
    public static String messageNameColumnsCart = """
    
    Produto\t\t\t|\tQuantidade\t|\tPreço
    """;
    public static String messageNewPurchase = "Deseja escolher outro produto? (S: Sim - N: Não)";
    public static String messageNewProduct = "Insira o nome do produto e a quantidade separados por espaço:";
}

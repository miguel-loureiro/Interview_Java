package challenges;

// reverse a string com ciclo for
public class Challenge21 {

    //Antes de mergulhar nos métodos de reversão de uma string,
    // é essencial entender as diferenças entre as classes String, StringBuildere StringBufferem Java:
    // String são Imutáveis : Quando um  objecto String é criado, ele não pode ser alterado.
    // Qualquer modificação numa string resulta na criação de uma nova string.
    // StringBuilder e StringBuffer : Ambos são mutáveis, permitindo alterações no seu conteúdo sem criar novos objetos.
    // No entanto, StringBuilder não é thread-safe, enquanto StringBuffer é thread-safe.
    // Principais diferenças:
    // A classe String em Java não tem um método reverse() integrado,
    //  enquanto StringBuilder e StringBuffer sim.
    // A classe String possui um método toCharArray()
    // que converte uma string numa matriz de caracteres, mas StringBuilder e StringBuffer não.

    public static String reverseString(String str) {
        String reversedStr = "";
        char ch;

        // ciclo para reverter a string
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);      // extrair cada character
            reversedStr = ch + reversedStr; // adicionar cada character ao inicio
        }

        return reversedStr;
    }
}

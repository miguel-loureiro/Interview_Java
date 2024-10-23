# **`Interview Prep`** 

`Preparation for interview to Junior Developer role`

## **`Code challenges (Java version)`**

`Here are some code challenges to test the coding abilities for a Junior Developer:`

1. **`FizzBuzz`**

Write a program that prints the numbers from 1 to 100, but for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz" instead of the number. For numbers that are multiples of both 3 and 5, print "FizzBuzz".

```
public class Challenge1 {

    public void solve() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

2. **`Reverse String`**

Write a function that takes a string as input and returns the string reversed.  
Example input: "hello" Example output: "olleh"

Antes de pensar nos métodos de reversão de uma string, é preciso entender as diferenças entre as String, StringBuilder e StringBuffer em Java.

**`String`** `são objetos imutáveis : quando um objeto String é criado, ele não pode ser alterado. Qualquer modificação  numa string resulta na criação de uma nova string.`  
**`StringBuilder`** `e StringBuffer : Ambos são mutáveis, permitindo alterações no seu conteúdo sem criar novos objetos. No entanto, StringBuilder não é thread-safe, enquanto StringBuffer é thread-safe.`

**`Principais diferenças:`**  
`A classe String não tem um método reverse(), enquanto StringBuilder e StringBuffer possuem.`  
`A classe String possui um método toCharArray(), que converte uma string em uma matriz de caracteres, mas StringBuilder e StringBuffer não.`

a. **`Reverse String (com ciclo for)`**

```
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
```

   b. **`Reverse String (usar o método reverse() de StringBuilder)`**

```
public static String reverseString(String str) {

        StringBuilder strrev = new StringBuilder();

        strrev.append(str);
        strrev.reverse();

        return strrev.toString();
    }
```

   3. **`Reverse String (usar o método toCharArray para manipular 2 arrays de Char)`**

```
   public static String reverseString(String str) {

        char[] reversi = str.toCharArray();

        int left = 0;
        int right = reversi.length -1;

        while(left<right) {

            char temp = reversi[left];
            reversi[left] = reversi[right];
            reversi[right] = temp;

            left++;
            right--;
        }
        return new String(reversi);
    }
```

c. **`Find the Maximum`**

Write a function that takes an array of integers as input and returns the maximum value in the array.
Example input: [1, 2, 3, 4, 5] Example output: 5

```
   public static int findMaxValue(int[] numbers) {
        // Inicializar max com o primeiro elemento do array
        int max = numbers[0];

        // iterar sobre o array a partir do segundo elemento
        for (int i = 1; i < numbers.length; i++) {
            // se o elemento atual é maior que max então atualizar max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // retorna o valor de max
        return max;
    }
```

4. **`Unique elements`**

Write a function unique() to return only the unique elements of an Array 
Resolution: use Array and Set

```
   public static int[] unique(int[] numbers) {
        // criar um Set para armazenar os elementos unicos
        Set<Integer> uniqueSet = new HashSet<>();

        // adicionar os elementos do array ao Set (os duplicados vão ser ignorados)
        for (int number : numbers) {
            uniqueSet.add(number);
        }

        // converter o Set para um array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (Integer num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

       int[] inputArray2 = {4, 1, 2, 6, 5,  6, 8, 2};
        System.out.println(unique(inputArray2))); // retorna [1, 2, 4, 5, 6, 8]
```

5. **`Same elements`**

Write a true or false function to return if the 2 Arrays have the same elements
Example1: [1, 2, 3] and [2, 1, 3] have the same content
Example2: [1, 2] and [1, 2, 3] don't have the same content

```
   public static boolean haveSameElements(int[] array1, int[] array2 ) {

        // se os arrays tiverem tamanhos diferentes quer dizer que não têm os mesmos elementos
        if (array1.length != array2.length) {

            return false;
        }
        // converter os arrays em Set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //adicionar os elementos dos 2 arrays aos respectivos sets
        for(int num: array1) {
            set1.add(num);
        }

        for(int num: array2) {
            set2.add(num);
        }

        return set1.equals(set2);
    }

haveSameElements([1,2,3], [2,1,3]) // return true
haveSameElements([1,2], [1,2,3]) // return false
```

6. **`Palindrome`**

Write a function that takes a string as input and returns true if the string is a palindrome, and false otherwise.
Example input: "madam" Example output: true

a. **`com apontadores`**
```
   public static boolean isPalindrome(String str) {
        // converter a string em minusculas
        str = str.toLowerCase();

        // inicializar 2 indexes: um no incio e outro no final
        int left = 0;
        int right = str.length() - 1;

        // comparar os valores enquanto left <= right
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }
        // se todos os caracteres de left e de right forem iguais então é palindromo
        return true;
    }

isPalindrome("madam") // return true
```

Ou: (com função recursiva)

```
   public static boolean isPalindrome(String str) {
        
        // base case: se a string tiver 1 ou for vazia é um palindromo
        if(str.length() <= 1 ) {
            
            return true;
        }
        
        // converter a string em minusculas
        str = str.toLowerCase();
        
        // comparar o primeiro e ultimo caractere
        if(str.charAt(0) != str.charAt(str.length() - 1)) {
            
            return false;
        }
        
        // funçao recursiva: verificar a substring sem o primeiro e ultimo caracter
        return isPalindrome(str.substring(1, str.length() - 1));
    }

isPalindrome4("madam") // return true
```

7. **`Anagram`**

Write a function that takes two strings as input and returns true if the strings are anagrams of each other, and false otherwise. 
Example input: "anna", "nana" Example output: true

```
   public static boolean isAnagram(String str1, String str2) {
        
            // se os tamanhos forem diferentes não são anagramas
            if(str1.length() != str2.length()) {
                
                return false;
            }
            // converter as 2 strings para minusculas
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            
            // converter os 2 arrays em arrays de caracteres
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            
            // ordenar os 2 arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            
            // comparar os arrays ordenados
            return Arrays.equals(charArray1, charArray2);
        }
    }

isAnagram("anna", "nana") // retorna true
```

8. **`Caesar Cipher`**

Write a function that takes a string and an integer as input, and returns the string encrypted using a Caesar cipher with the given shift. 
Example input: "hello", 3 Example output: "khoor"

```
   public static String caeserCipher(String str, int shift) {
   
        List<Character> alfabeto = new ArrayList<>(); // criar array de alfabeto
        for (char c = 'a'; c<= 'z'; c++) {
            alfabeto.add(c);
        }
       
        str = str.toLowerCase();   // converter a string em minusculas

        // inicializar a string codificada após aplicar a caeserCipher. como String é imutavel, tem que se usar um StringBuilder
        StringBuilder strCodificada = new StringBuilder();

        for(int i = 0; i < str.length(); i++) { // iterar sobre cada caractere da string inicial
           char charAt = str.charAt(i);
          
            int index = alfabeto.indexOf(charAt);  //obter o indice do caractere atual
           
            if(index != -1) { // se o caractere é encontrado no alfabeto
               
                int shiftedIndex = (index + shift) % alfabeto.size(); // calcular o caratere "deslocado"
               
                strCodificada.append(alfabeto.get(shiftedIndex)); // adicionar o caractere deslocado a strCodificada
            } else {
                // adicionar caracteres diferentes não incluidos no alfabeto (espaços, pontuacao)
                strCodificada.append(charAt);
            }
        }
        return  strCodificada.toString();
    }

caeserCipher("hello", 3) // retorna "khoor"
```

Ou: (com Map para ser mais conciso)

```
   public static String caeserCipher(String str, int shift) {

        // criar um map para armazenar os caracteres "deslocados"
        Map<Character, Character> cipherMap = new HashMap<>();
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
       
        // popular o map com os caracteres "deslocados"
        for (int i = 0; i < alfabeto.length; i++) {
            char shiftedChar = alfabeto[(i + shift) % alfabeto.length];
            cipherMap.put(alfabeto[i], shiftedChar);
        }

        // "construir" a string com a cifra
        StringBuilder strCifrada = new StringBuilder();
        str = str.toLowerCase();

        for(char ch : str.toCharArray()) {

            // adicionar o caracteres deslocado se for encontrado,
            // ou adicionar por default o proprio (se for um espaço ou pontuacao)
            strCifrada.append(cipherMap.getOrDefault(ch, ch));
        }
        return strCifrada.toString();
    }

caeserCipher("hello", 3) // retorna "khoor"
```

9. **`Binary Search`**

Write a function that takes a sorted array of integers and a target value as input, and returns the index of the target value in the array if it exists, and -1 otherwise. 
Example input: [1, 2, 3, 4, 5], 3 Example output: 2

```
func binarySearch(_ array: [Int], _ target: Int) -> Int {
    var left = 0
    var right = array.count - 1

    while left <= right {

        let mid = (left + right) / 2
        if array[mid] == target {

            return mid
        } else if array[mid] < target {

            left = mid + 1
        } else {

            right = mid - 1
        }
    }

    return -1
}

binarySearch([1, 2, 3, 4, 5], 3) // retorna 2
```

10. **`Merge Sort`**

Write a function that takes an array of integers as input and returns the array sorted using the merge sort algorithm.  
Example input: [5, 2, 8, 3, 1] Example output: [1, 2, 3, 5, 8]

```
public static int[] mergeSort(int[] array) {

        // base case: se o array tem 1 ou é vazio então já está ordenado
        if(array.length <= 1 ) {
            return array;
        }

        int midIndex = array.length / 2;  // encontrar o ponto medio

        // separar em 2 arrays (left e right)
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[array.length - midIndex];

        for(int i = 0; i < midIndex; i++) { // popular os arrays anteriores com os valores
            leftArray[i] = array[i];
        }
        for(int i= midIndex; i < array.length; i++) {
            rightArray[i - midIndex] = array[i];
        }

        int[] leftSorted = mergeSort(leftArray);
        int[] rightSorted = mergeSort(rightArray);

        return merge(leftSorted, rightSorted);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] mergedArray = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;

        // fazer merge dos arrays left e right
        while(leftIndex < left.length && rightIndex < right.length) {

            if(left[leftIndex] < right[rightIndex]) {

                mergedArray[mergeIndex] = left[leftIndex];
                leftIndex++;
            } else {

                mergedArray[mergeIndex] = right[rightIndex];
                rightIndex++;
            }

            mergeIndex++;
        }

        // juntar os elementos que podem ter sobrado do array left
        while(leftIndex < left.length) {
            mergedArray[mergeIndex] = left[leftIndex];
            leftIndex++;
            mergeIndex++;
        }

        // juntar os elementos que podem ter sobrado do array right
        while(rightIndex < right.length) {
            mergedArray[mergeIndex] = right[rightIndex];
            rightIndex++;
            mergeIndex++;
        }

        return mergedArray;
    }


mergeSort([5, 2, 8, 3, 1]) // retorna [1, 2, 3, 5, 8]
```

11. **`Find the First Duplicate`**

Write a function that takes an array of integers as input and returns the first duplicate value in the array, and -1 if no duplicates exist.  
Example input: [1, 2, 3, 4, 5, 2] Example output: 2

```
  public static int findFirstDuplicate(int[] array) {

        Set<Integer> numerosVerificados = new HashSet<>(); //criar um Set para armazenar os numeros verificados

        for(int num : array) { // iterar sobre o array

            if(numerosVerificados.contains(num)) { //se o num já estiver no set de números verificados então é um numero duplicado 
                return num;
            } else {
                numerosVerificados.add(num); // adiciona o numero ao Set
            }
        }

        return -1; //se não encontrar duplicados
    }

findFirstDuplicate([1, 2, 3, 4, 5, 2]) // return 2
```

12. **`Validate IP Address`**

Write a function that takes a string as input and returns true if the string is a valid IP address, and false otherwise. 
Example input: "192.168.0.1" Example output: true

```
func validateIPAdress(_ ip: String) -> Bool {
    
    let partes = ip.split(separator: ".")
    
    guard partes.count == 4 else { return false }
    
    for elemento in partes {
        
        if let numero = Int(elemento),
           numero >= 0 && numero <= 255 {
            // comparar a representacao String do numero com o numero (Int).
            // Se forem diferentes quer dizer que tem um 0 antes. Por ex. "01" vai ser diferente de 1, pois
            // a representacao Int de "01" será 1 e não 01.
            if String(numero) != elemento {
                
                return false
            }
        } else {
            return false
        }
    }
    
    return true
}

validateIPAdress("192.168.0.1") // return true
```

13. **`Binary Gap`**

Write a function to find the largest gap between the 1's in the binary representation of an integer. 
Example input: 1041 (binary rep is 10000010001) Example output: 5

```
func binaryGap(_ input: Int) -> Int {
    
    // converter o número para String
    let binaryString = String(input, radix: 2)
    
    // inicializar as variáveis de gap e o index do ultimo 1
    var maxGap = 0
    var lastIndexDeUm: Int?
    
    // iterar sobre a string de binário do numero
    for (index, char) in binaryString.enumerated() {
        // verificar se o char é 1
        if char == "1" {
            // se não for o primeiro 1 então calcula o gap
            if let lastIndexDeUm {
                
                maxGap = max(maxGap, index - lastIndexDeUm - 1)
            }
            lastIndexDeUm = index
        }
    }
    
    return maxGap
    
}

binaryGap(1041) // retorna 5
```

14. **`string1 is a subsequence of string2`**

Write a function that determine if string1 is a subsequence of string2  
Example input: ["bolo", "gulosobtberolocreme"] Example output: true

```
public func subStrings(_ string1: String, _ string2: String) -> Bool { 
    var i = 0 
    var j = 0

    let s1Array = Array(string1) 
    let s2Array = Array(string2) 

    while i < s1Array.count && j < s2Array.count { 
        if s1Array[i] == s2Array[j] { 
            i += 1         }  
        j += 1 
    } 
    return i == s1Array.count 
}

subStrings("bolo", "gulosobtberolocreme") // retorna true
```

15. **`Find the Longest Increasing Subsequence`**

Write a function that takes an array of integers as input and returns the longest increasing subsequence.  
Example input: [10, 22, 9, 33, 21, 50, 41, 60, 80] Example output: [10, 22, 33, 50, 60, 80]


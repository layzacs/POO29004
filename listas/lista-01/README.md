# Comandos git e linguagem de programação Java

## Linguagem de programação Java
### Estruturas de decisão
```java
    // estrutura if e if-else
    if (b > a) {
        return b;
    }
    else {
        return a;
    }
```
```java
    // estrutura equals
    String alfa = "gama", beta = "gama";

    System.out.println(alfa.equals(beta));
```
```java
    // operador condicional ternário
    b = (a > 0) ? 1 : 2;
    /* equivale a :
    if (a > 0) {
    b = 1;
    } else {
    b = 2;
    }
    */
```

```java
    // switch
    int a = 0, b = 0;
    switch (a) {
        case 1:
            b = 0;
            break;
        case 2:
            b = 1;
            break;
        default:
        b = 2;
        break;
    }
```
### Métodos da classe String
```java
// criação
String s = new String("Algum texto");
```
```java
// pegando uma string por inserção
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
```
```java
// concatenando strings
String s1 = "Algum";
s1 = s1 + " texto";
// ou
String s1 = "Algum";
System.out.println( s1.concat(" texto") );
```
```java
// retorna um caractere
String s1 = "Algum";
System.out.println( s1.charAt(2) );//retorna o char 'g'
```
```java
// mostra tamanho
String s1 = "Java";
System.out.println( s1.length() );// retorna 4
```
```java
// substring
String s1 = "Algum texto";
System.out.println(s1.substring(6)); // texto
System.out.println(s7.substring(6,9)); // tex
```
```java
// split
String s1 = "teste1;teste2;teste3";
String[] array = s1.split(";");
System.out.println( array[0] ); // teste1
System.out.println( array[1] ); // teste2
System.out.println( array[2] ); // teste3
```
### Interação com o usuário
```java
// Lendo um dado int do teclado
Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o valor: ");
        int valor = teclado.nextInt();

        System.out.println("O valor informado é: " + valor)
```
```java
// Lendo uma String do teclado
Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com a string: ");
        String s = teclado.nextLine();

        System.out.println("A string informada é: " + s)
```
```java
// Lendo um dado double do teclado
Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o valor: ");
        double valor = teclado.nextDouble();

        System.out.println("O valor informado é: " + valor)
```

## Comandos git
### Fluxo de trabalho usando ramos

Comandos usados para o branch decisao:

```bash
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git branch decisao
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git checkout decisao
...
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git add .
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git commit
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git checkout master
...
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git merge decisao
```

Comandos usados para o branch string:

```bash
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git branch string
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git checkout string
...
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git add .
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git commit
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git checkout master
...
layzacs@layzacs:2020-01-listas-de-exercicios-layzacs$ git merge string
```

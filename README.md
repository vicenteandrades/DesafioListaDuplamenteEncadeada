
# Lista Duplamente Ligada

## Descrição
A classe `ListaDuplamenteLigada` implementa uma lista duplamente encadeada genérica, onde cada elemento (nó) tem referências tanto para o próximo quanto para o nó anterior. Essa estrutura de dados é útil quando se necessita de acesso bidirecional e operações eficientes de inserção e remoção tanto no início quanto no final da lista.

## Estrutura

A classe `ListaDuplamenteLigada` é genérica, permitindo que armazene elementos de qualquer tipo. Ela possui três principais atributos:

- **head**: Referência para o primeiro nó da lista.
- **tail**: Referência para o último nó da lista.
- **size**: Número de elementos na lista.

## Métodos

### 1. `addLeft(T element)`
Adiciona um elemento à esquerda (no início) da lista. Caso a lista esteja vazia, o novo nó será tanto o primeiro quanto o último da lista.

**Parâmetros**:
- `element`: O elemento a ser adicionado à lista.

**Exemplo de uso**:
```java
ListaDuplamenteLigada<Integer> lista = new ListaDuplamenteLigada<>();
lista.addLeft(10);
```

### 2. `addRight(T element)`
Adiciona um elemento à direita (no final) da lista. Caso a lista esteja vazia, o novo nó será tanto o primeiro quanto o último da lista.

**Parâmetros**:
- `element`: O elemento a ser adicionado à lista.

**Exemplo de uso**:
```java
ListaDuplamenteLigada<Integer> lista = new ListaDuplamenteLigada<>();
lista.addRight(20);
```

### 3. `isEmpty()`
Verifica se a lista está vazia. Retorna `true` se a lista não contiver elementos e `false` caso contrário.

**Retorno**:
- `boolean`: `true` se a lista estiver vazia, caso contrário `false`.

**Exemplo de uso**:
```java
boolean vazio = lista.isEmpty();
```

### 4. `toString()`
Sobrescreve o método `toString` para fornecer uma representação textual da lista. A lista é retornada no formato `[elemento1, elemento2, ..., elementoN]`.

**Retorno**:
- `String`: Representação da lista como string.

**Exemplo de uso**:
```java
System.out.println(lista.toString());
```

## Classe `Node`

A classe `Node` é uma estrutura auxiliar utilizada para armazenar os elementos da lista, contendo as seguintes propriedades:

- **element**: O elemento armazenado no nó.
- **next**: Referência para o próximo nó da lista.
- **previous**: Referência para o nó anterior.

## Exemplo de Implementação

```java
package List;

public class Node<T> {
    private T element;
    private Node<T> next;
    private Node<T> previous;

    public Node(T element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
```

## Teste

A classe `TesteLista` pode ser utilizada para testar a funcionalidade da `ListaDuplamenteLigada`. Aqui está um exemplo básico de teste:

```java
package List;

public class TesteLista {
    public static void main(String[] args) {
        ListaDuplamenteLigada<Integer> lista = new ListaDuplamenteLigada<>();
        
        lista.addLeft(10);
        lista.addRight(20);
        lista.addLeft(5);
        
        System.out.println("Lista: " + lista.toString());  // Esperado: [5,10,20]
        
        System.out.println("Está vazia? " + lista.isEmpty());  // Esperado: false
    }
}
```

## Instruções de Uso

1. Clone o repositório para o seu computador local.
2. Compile e execute os arquivos `.java` no seu ambiente de desenvolvimento.
3. Utilize a classe `ListaDuplamenteLigada` para adicionar elementos à lista, tanto à esquerda quanto à direita.
4. Chame o método `toString` para visualizar os elementos da lista em formato de string.
5. Use o método `isEmpty` para verificar se a lista está vazia.

## Dependências

Este projeto não possui dependências externas e pode ser compilado em qualquer ambiente que suporte Java (JDK 8 ou superior).

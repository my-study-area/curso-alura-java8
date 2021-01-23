# curso-alura-java8
<p>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/my-study-area/curso-alura-java8">
    <a href="https://github.com/my-study-area">
        <img alt="Made by" src="https://img.shields.io/badge/made%20by-adriano%20avelino-gree">
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/my-study-area/curso-alura-java8">
    <a href="https://github.com/EliasGcf/readme-template/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/my-study-area/curso-alura-java8">
    </a>
</p>
Curso de Java moderno: Tire proveito dos novos recursos do Java 8

## Anotações
***Módulo: Default Methods***
- método default permite adicionar métodos concretos nas interfaces
- `Consumer` é uma das interfaces do pacote `java.util.functions`

***Módulo: Que venham os lambdas!***
- `Interfaces Funcional` é aquela Interface que possui apenas `um único` método abstrato. Além desse método ela pode ter outros métodos, contanto que sejam default ou 'static'.

***Módulo: Código mais sucinto com Method references***
-  `Method references` são um tipo especial de expressões lambda
- existem 4 tipos de Methods references:
  - Métodos estáticos
  - Métodos de instância de objetos específicos
  - Métodos de instância de um objeto arbitrário de um tipo específico
  - Construtor

***Módulo: Streams: trabalhando melhor com coleções***
  - modificações em um stream não modificam a coleção/objeto que o gerou
  - utilizamos o `mapToInt` ao trabalhar com o tipo primitivo int para evitar o autoboxing. Também existem map para float e double.

***Módulo: Mais Streams, Collectors e APIs***
- o método `findAny` em Stream retorna um `Optional`
- `Optional` é uma classe do java para trabalhar com possíveis valores `null`.
- o método `collect` em Stream pode ser utilizado para gerar uma `List` através do uso da interface Collectors. Ex: `cursos.stream().filter(c -> c.getAlunos() > 100).collect(Collectors.toList());`

***Módulo: A nova API de datas***
- toda a API de datas é imutável
- usamos o `DateTimeFormatter` para formatar datas
```java
LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
```
- usamos `LocalDate` para trabalhar com datas e `LocalDateTime` para trabalhar com data e tempo.
- a classe `Duration` trabalha com intervalo de horas
- `ZonedDateTime` é a classe que melhor representa uma data e hora com time-zone

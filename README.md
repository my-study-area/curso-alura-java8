# curso-alura-java8
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

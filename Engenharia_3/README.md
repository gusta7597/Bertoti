# Bertoti
<h2>Padrões de Design Patterns</h2>

<table>
    <tr>
    <th>Tipos de Padrões</th>   
        <th>Definição</th>
        <th>Antipadrões</th>
        <th>O que resolve</th>
        <th>Funcionalidades em Java</th>
        </tr>
    <tr>
    <td>Strategy</td>
        <td>O padrão Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.</td>
        <td>Os antipadrões associados ao padrão Strategy incluem uma complexidade adicional quando aplicada a problemas simples. Se há apenas um comportamento variável, usar o Strategy pode ser excessivo e aumentar a complexidade do código</td>
        <td>O Strategy resolve o problema de ter diferentes algoritmos para uma tarefa e permite que esses algoritmos sejam selecionados dinamicamente em tempo de execução, tornando o sistema mais flexível, de fácil manutenção e expansão.</td>
        <td>No Java, esse padrão é amplamente utilizado. Por exemplo, a interface java.util.Comparator é um bom exemplo de Strategy, onde diferentes estratégias de comparação podem ser passadas para ordenar coleções de objetos. Além disso, em frameworks como Spring, o uso de estratégias é comum para permitir a injeção dinâmica de comportamentos em classes.</td>
    </tr>
    <tr>
        <td>Observer</td>
        <td>O padrão Observer é um padrão de design comportamental em que um objeto, chamado de sujeito, mantém uma lista de seus dependentes, chamados observadores, e os notifica automaticamente sobre qualquer mudança de estado. Isso permite que os observadores sejam atualizados automaticamente.</td>
        <td>Em algumas situações, o Observer pode resultar em acoplamento excessivo se não for implementado de forma cuidadosa. Isso pode levar a um código difícil de entender e manter, especialmente se muitos observadores e sujeitos estão envolvidos.</td>
        <td>O Observer resolve o problema de estabelecer uma relação de um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Isso promove um desacoplamento entre o sujeito e os observadores.</td>
        <td> No Java, o padrão Observer é implementado por meio de classes e interfaces no pacote java.util. Por exemplo, as classes Observable e Observer são utilizadas para implementar este padrão. Além disso, em frameworks como o Spring, o Observer é aplicado para notificar automaticamente os componentes sobre eventos e mudanças no sistema.</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>O padrão Composite é um padrão de design estrutural que permite compor objetos em estruturas de árvore para representar hierarquias parte-todo. Os clientes tratam objetos individuais e composições de objetos uniformemente.</td>
        <td>Um antipadrão comum é a complexidade no tratamento de diferentes tipos de elementos dentro da estrutura composta. Além disso, pode haver uma sobrecarga de abstração se a estrutura for muito genérica.</td>
        <td>O Composite resolve o problema de tratar objetos individuais e composições de objetos de maneira uniforme. Ele permite que os clientes tratem objetos simples e suas composições hierárquicas de forma transparente.</td>
        <td>Em Java, o Composite é comumente utilizado em estruturas de árvore, como a representação de elementos gráficos, estruturas de diretórios, e em frameworks de interface gráfica, como o Swing. A interface java.awt.Component é um exemplo, onde tanto os componentes finais quanto os containers (que podem conter outros componentes) são tratados uniformemente.</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>O padrão Facade é um padrão de design estrutural que fornece uma interface unificada para um conjunto de interfaces em um subsistema. Ele define uma interface de nível mais alto que facilita o uso de um subsistema.</td>
        <td>O antipadrão mais comum é criar uma fachada que cresce excessivamente, acumulando muitas responsabilidades e se tornando uma classe "deus", o que vai contra o propósito de simplificar o sistema.</td>
        <td>O Facade resolve o problema de complexidade ao esconder a complexidade de um subsistema e fornecer uma interface simplificada para interagir com esse subsistema.</td>
        <td>No Java, o Facade é amplamente empregado em muitos frameworks e bibliotecas. Por exemplo, em APIs como JDBC, que fornece uma fachada para interagir com diferentes bancos de dados, ocultando os detalhes de cada implementação. Em bibliotecas gráficas, como JavaFX, a classe javafx.application.Application atua como uma fachada para iniciar e gerenciar aplicativos gráficos.</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>O padrão Singleton é um padrão de design criacional que garante a existência de apenas uma instância de uma classe e fornece um ponto global de acesso a essa instância.</td>
        <td>O principal antipadrão do Singleton é a dificuldade de testar o código que depende do Singleton. Além disso, em alguns casos, pode levar a acoplamento forte, tornando o código menos flexível.</td>
        <td>O Singleton resolve o problema de garantir que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância, útil em situações onde apenas uma instância de uma classe é necessária, como no caso de gerenciadores de conexão de banco de dados ou logs.</td>
        <td>No Java, o Singleton é comum em diversos lugares, como gerenciadores de caches, gerenciadores de configuração, logs e pools de conexão de banco de dados. Por exemplo, a classe java.lang.Runtime é um Singleton que permite acessar o ambiente de execução.</td>
    </tr>
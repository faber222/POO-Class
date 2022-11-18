```mermaid
classDiagram;
    PosicaoPlano --> Linha;
    PosicaoPlano <|-- DesenhoBi;
    PosicaoPlano : -String cor;
    PosicaoPlano : -double[2] coordXYIni;
    PosicaoPlano : +desenhar();
    DesenhoBi <|-- Quadrado;
    DesenhoBi <|-- Circulo;
    DesenhoBi <|-- Elipse;

    class Linha{
      -double[2] coordXYFinal ;
      
    };
    class DesenhoBi{
      -String corFundo;
      +getPerimetro();
      +getArea();
    };
    class Quadrado{
      -double dimensao;
    };
    class Circulo{
      -double raio;
    };
    class Elipse{
      -double ladoMenor;
      -double ladoMaior;
      -double foco;
    };
```
/*
Entrega da prova 1 - Paradigmas de Linguagens de Programação – 05N
Nós,
Nome completo e TIA (1º integrante)
Nome completo e TIA (2º integrante)
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar
outros.
*/

class Main {
  public static void main(String[] args) {
    Ponto p1 = new Ponto(1, 2);
    Ponto p2 = new Ponto(2,3);
    // System.out.println(p1);
    // System.out.println(p1.equals(p2));
    // Ponto lista[] = new Ponto[10];
    // System.out.println(lista[5]);
    listaPonto teste = new listaPonto(10);
    teste.adicionarPonto(p1, 0);
    System.out.println(teste);

  }
}
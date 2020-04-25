// 5. Calcular a distância dos dois pontos mais distantes na coleção;
// 6. Retornar uma coleção de pontos contido em uma circunferência.
import java.lang.*;

class listaPonto{
	private Ponto pontos[];
	private int validos;

	public listaPonto(int N){
		this.pontos = new Ponto[N];
		this.validos = 0;
	}

	@Override
	public String toString(){
    String formated = "";
		for(int i = 0; i < this.pontos.length; ++i){	
			formated += String.format("%o", pontos[i]);
			if(i < this.pontos.length -1) formated += " - ";
		}
    return formated;
	}

	public boolean canInsert() {
		return this.validos < this.pontos.length;
	}

  public boolean isOut(int index) {
    return index < 0 && index >= this.pontos.length;
  }

// 1. Adicionar um elemento no final da coleção;
	public void adicionarFinal(Ponto p){
		if(this.canInsert()) {
      System.out.println(this.validos);
      this.pontos[this.validos++] = p;
    }
		else 
      System.out.println("Não há espaço disponível.");
	}

// 2. Adicionar um elemento em uma posição da coleção;
	public void adicionarPonto(Ponto p, int posicao){
    if(isOut(posicao)) throw new IndexOutOfBoundsException("Posição inválida");
    if(canInsert() && posicao <= this.validos) {
      this.pontos[posicao] = p;
      return;
    }
	}

// 3. Retornar o índice da primeira ocorrência de um elemento especificado na coleção.
	public int primeiraOcorrencia(Ponto p){
		for(int i = 0; i < this.validos; ++i){
			if(this.pontos[i].equals(p)) return i;
		}
		return -1;
	}
	
  // 4. Remover um elemento em uma posição na coleção.
	public void removerPonto(int indice) {
		if (isOut(indice)){
      throw new IndexOutOfBoundsException("Posição inváliinválida");
		}
    if(indice == this.pontos.length - 1) {
      this.pontos[indice] = null;
      return;
    }
    if(this.pontos[indice] != null) {
		  for(int i = indice; i < this.validos - 1; ++i) {
        this.pontos[indice] = this.pontos[indice + 1];
      }
    }

  }

}
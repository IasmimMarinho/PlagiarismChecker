package tarefa;

import java.util.Map;

public class Frase {
	
	public String frase;
	private Map<String, Integer> ocorrenciaPalavras;
	private String[] listaPalavras;
	
	public Frase(String f) {
		this.frase = f;
		this.listaPalavras = splitFraseEmPalavras(f); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		
	}
	
	String[] splitFraseEmPalavras(String frase) {
		//faz um split a partir dos espaços
		String[] palavras = frase.split("\\s");
		return palavras;
	}
	
	
	Map<String, Integer> contaOcorrPalavras(String[] palavras) {
		//conta a ocorrencia das palavras no paragrafo
		for(String palavra : palavras) {
			ocorrenciaPalavras.put(
					palavra, 
					1 + (ocorrenciaPalavras.get(palavra) == null ? 0 : ocorrenciaPalavras.get(palavra)
					));
		}
		return ocorrenciaPalavras;
	}
}

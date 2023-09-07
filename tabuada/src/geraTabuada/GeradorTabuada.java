package geraTabuada;

public class GeradorTabuada {


	public void tabuada(int numeroTabuada, int valorMax, int finalDigito) {//recebe o numero que vai ser calculado, recebe até qual numero ele vai multiplicado e recebe qual digito ele quer saber se apareceu
		int resultado, digitoTotal = 0;

		for(int i = 0; i < valorMax; i++) {

			resultado = numeroTabuada * (i + 1);

			System.out.println(numeroTabuada + " x " + (i + 1) + " = " + resultado);
			digitoTotal += this.devolveTotal(resultado, finalDigito);

		}
		if(digitoTotal == 0) System.out.println("o "+finalDigito+" que é o digito final que você procurou, não existe nos resultados da multiplicação, lamento :(");
		else {
			if(digitoTotal == 1) System.out.println("o "+finalDigito+" apareceu "+ digitoTotal+" vez");
			else System.out.println("o "+finalDigito+" apareceu "+ digitoTotal+" vezes");
		}
	}


	public int devolveTotal(int resultado, int finalDigito) {//pega o resultado e o digito que deseja saber se existe dentre os resultados apresentados

		String viraString= String.valueOf(resultado);//transforma o resultado e transforma em uma string
		int calculaTamanho = viraString.length();// pega a string e calcula o numero de posições que existem dentro dela
		char digitoFinal = viraString.charAt(calculaTamanho - 1);//transforma o ultimo caractere em um CHAR

		if(digitoFinal == String.valueOf(finalDigito).charAt(0)) {//transforma o digito procurado em char e compara com o digito final
			return 1;
		}
		else return 0;

	}
}
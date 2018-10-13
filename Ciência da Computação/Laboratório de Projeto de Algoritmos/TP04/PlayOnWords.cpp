/* PUC MINAS
 * Jorge Allan de Castro Oliveira
 * 09/2018
 */

#include <stdio.h>
#include <cstring>

int main(int argc, char const *argv[]) {
	int teste;
    int num;
    char palavra[1001];
    int entrada[26];
    int saida[26];
	bool matriz[26][26];
	
	scanf("%d", &teste);
	
	while(teste > 0) {
		scanf("%d", &num);
		
		memset(matriz, false, sizeof(matriz));

		memset(entrada, 0, sizeof(entrada));
		memset(saida, 0, sizeof(saida));
		
		for(int i = 0; i < num; i++) {
			scanf("%s",palavra);

			int p = strlen(palavra);
			int c1 = palavra[0] - 'a';
			int c2 = palavra[p - 1] - 'a';

			matriz[c1][c2] = matriz[c2][c1] = true;
			entrada[c2]++;
            saida[c1]++;
		}
		
		for(int k = 0; k < 26; k++) {
			for(int i = 0; i < 26; i++) {
				for(int j = 0; j < 26; j++) {
					matriz[i][j] += (matriz[i][k] & matriz[k][j]);
                }
            }
        }

        bool valido = true;
		
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				if(i != j && entrada[i] + saida[i] > 0 && entrada[j] + saida[j] > 0 && !matriz[i][j]) {
					valido = false;
                }
            }
        }
		
		int cont1 = 0;
        int cont2 = 0;
		
		for(int i = 0; i < 26; i++) {
			if(entrada[i] == saida[i]) {
                cont1++;
            } else if(saida[i] == entrada[i] + 1) {
                cont2++;
            }
        }
		
		if(!(cont1 == 26 || (cont1 == 24 && cont2 == 1))) {
             valido = false;
        }

		if(valido) {
            printf("Ordering is possible.");
        } else {
            printf("The door cannot be opened.");
        }

		printf("\n");
        teste = teste - 1;
	}
	return 0;
}
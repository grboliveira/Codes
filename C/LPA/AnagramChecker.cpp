/* PUC MINAS
 * Jorge Allan de Castro Oliveira
 * 08/2018
 * Encontra todos os possíveis anagramas de uma
 * frase através das palavras oe um dicionário.
 */

#include <string>
#include <iostream>
#include <vector>
#include <sstream>

using namespace std;
const vector<int> base(26, 0);

vector<int> contLetra(string palavra) {
    vector<int> count(base);
    
    for (string::const_iterator iter = palavra.begin(); iter != palavra.end(); ++iter) {
        if (*iter != ' ')
            ++count[*iter - 'A'];
    }
    return count;
}

vector<bool> conferirPalavras(const string& linha, const vector<string>& dicionario) {
    istringstream iss(linha);
    vector<string> palavra; 
    string tmp;
    
    while (iss >> tmp) {
        palavra.push_back(tmp);
    }

    int tamanho = dicionario.size();
    vector<bool> conf(tamanho, true);
    
    for (int i = 0; i < tamanho; ++i) {
        for (int j = 0; j < palavra.size(); ++j) {
            if (dicionario[i] == palavra[j])
                conf[i] = false;
        }
    }  
    return conf;
}

void Anagrama(int pos_atual, const string& frase, vector<int> contFrase, vector<bool> palavraAdd, const vector<vector<int> >& contDicionario, const vector<string>& dicionario, const vector<bool>& conf)
{
    bool conferencia = true;
    
    for (int i = 0; i < 26; ++i)
    {
        contFrase[i] -= contDicionario[pos_atual][i];
        
        if (contFrase[i] < 0)
            return;
            
        else if (contFrase[i] > 0)
            conferencia = false;
    }
    
    palavraAdd[pos_atual] = true;
    
    if (conferencia) {
        cout << frase << " =";
        
        for (int i = 0; i <= pos_atual; ++i) {
            if (palavraAdd[i]) {
                cout << ' ' << dicionario[i];
            }
        } cout << '\n';
    } else {
        for (int i = pos_atual + 1; i < dicionario.size(); ++i) {
            if (conf[i]) {
                Anagrama(i, frase, contFrase, palavraAdd, contDicionario, dicionario, conf);
            }       
        }
    }
}

int main() {
    vector<string> dicionario;
    vector<vector<int> > contDicionario;
    string palavra;
    
    while (cin >> palavra, palavra != "#") {
        dicionario.push_back(palavra);
        contDicionario.push_back(contLetra(palavra));
    }
    
    string frase;
    cin.ignore();
    
    while (getline(cin, frase), frase != "#") {
        vector<bool> palavraAdd(dicionario.size(), false);
        
        vector<int> contFrase = contLetra(frase);
        
        vector<bool> conf = conferirPalavras(frase, dicionario);
        
        for (int i = 0; i < dicionario.size(); ++i) {
            if (frase != dicionario[i])
                Anagrama(i, frase, contFrase, palavraAdd, contDicionario, dicionario, conf);
        }
    }
}

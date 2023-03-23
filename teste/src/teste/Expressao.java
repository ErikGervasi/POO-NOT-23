//integrantes: Erik Gervasi e Gustavo

package teste;


public class Expressao {
String expressao;

    public Expressao(String exp) {
    this.expressao = exp;
    }
    public boolean correcaoSin() {
        int abts = 0;
        for(int i=0;i<=(expressao.length())-1;i++) {
            if(expressao.charAt(i) == '(') { abts++; }
            if(expressao.charAt(i) == ')') { abts--; }
            if(abts<0) {
                return false;
            }
        }
            if(abts == 0){
                return true;
            }
            else{
                return false;
            }
    }
    public  int posOperador() {
        int posicao = -1;
        for(int i=0;i<=(expressao.length())-1;i++) {
            if(expressao.charAt(i) == '+' || expressao.charAt(i) ==  '-' || expressao.charAt(i) ==  '*' || expressao.charAt(i) ==  '/') {
                posicao = i;
                break;
            }
        }
        return posicao;
    }
    
    public int qtdDivisor() {
        int qnt = 0;
        for(int i=0;i<=(expressao.length())-1;i++) {
            if(expressao.charAt(i) == '/') {
                qnt++;
            }
        }
        return qnt;
    }
}

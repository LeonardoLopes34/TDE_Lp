public class relogio {
    ponteiro ponteiroHora = new ponteiro();
    ponteiro ponteiroMinuto = new ponteiro();
    ponteiro ponteiroSegundo = new ponteiro();

    void acertarRelogio(int hora, int minuto , int segundo){
        ponteiroHora.posicao = hora;
        ponteiroMinuto.posicao = minuto/5;
        ponteiroSegundo.posicao = segundo/5;
    }
    int lerHora(){
        return ponteiroHora.posicao;
    }
    int lerMinuto(){
        return ponteiroMinuto.posicao*5;
    }
    int lerSegundo(){
        return ponteiroSegundo.posicao*5;
    }

}

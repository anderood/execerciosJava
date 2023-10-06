public class CalcBissexto {

    void calcBissexto(int Ano){

        if(Ano % 4 == 0 && Ano % 100 != 0 || Ano % 400 == 0){
            System.out.println("O Ano é BisSexto");
        }else {
            System.out.println("O Ano Não é BisSexto");
        }
    }
}

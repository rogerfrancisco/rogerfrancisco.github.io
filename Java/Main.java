
public class Main {
    public static void main(String[] args){
        Leitura leitura = new Leitura();


        String resposta = leitura.lerString();
        System.out.println(resposta);

        char respostaChar = leitura.lerChar();
        System.out.println(respostaChar);

        float respostaFloat = leitura.lerFloat();
        System.out.println(respostaFloat);

        int respostaInt = leitura.lerInt();
        System.out.println(respostaInt);

        double respostaDouble = leitura.lerDouble();
        System.out.println(respostaDouble);


        String emailValido = leitura.lerEmail();
        System.out.println(emailValido);



        String phone = leitura.validarPhone();
        System.out.println(phone);


        String data = leitura.validarData();
        System.out.println(data);

        String dataTrocada = leitura.trocarData();
        System.out.println(dataTrocada);

        String numeroInt = leitura.validarInt();
        System.out.println(numeroInt);


    }

}








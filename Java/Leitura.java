import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Leitura {
    Scanner tc = new Scanner(System.in);

    public String lerString() {
        return lerString("Digite uma String");
    }

    public String lerString(String mensagem) {
        System.out.println(mensagem);
        return tc.next();
    }

    public char lerChar() {
        return lerChar("Digite um Char:");
    }

    public char lerChar(String mensagem) {
        System.out.println(mensagem);
        return tc.next().charAt(0);
    }

    public int lerInt() {
        return lerInt("Digite um Int:");
    }

    public int lerInt(String mensagem) {
        System.out.println(mensagem);
        return tc.nextInt();
    }

    public float lerFloat() {
        return lerFloat("Digite um Float:");
    }

    public float lerFloat(String mensagem) {
        System.out.println(mensagem);
        return tc.nextFloat();
    }

    public double lerDouble() {
        return lerDouble("Digite um Double:");
    }

    public double lerDouble(String mensagem) {
        System.out.println(mensagem);
        return tc.nextDouble();
    }

    private static String pattern(String value, String[] patterns) {
        for (String pattern : patterns)
            if (value.matches(pattern))
                return value;
        return null;
    }
    private static String pattern(String value, String pattern) {
            if (value.matches(pattern))
                return value;
        return null;
    }

    public String lerEmail() {
        System.out.println("Digite um email");
        String email = tc.next();
        String[] pattern = {"^[a-zA-Z]{1,}[a-zA-Z.+-]{0,}@[a-zA-Z]{2,}([.][a-zA-Z]{2,}|[.][a-zA-Z]{2,}[.][a-zA-Z]{2,})$"};
        return pattern(email, pattern);
    }

    public  String validarPhone() {
        System.out.println("Digite um telefone:");
        String phone = tc.nextLine();
        Pattern p = Pattern.compile("^\\s*(\\d{3}|\\d{0})[-. ]?(\\d{5}|\\d{4})[-. ]?(\\d{4})[-. ]?\\s*$");
        Matcher m = p.matcher(phone);
        boolean isValid = (m.find() && m.group().equals(phone));
        if(isValid) return phone;
        else return null;
    }


    public  String validarData() {
        System.out.println("Digite uma data");
        String date = tc.next();
        return validarData(date);

    }
    public  String validarData(String data) {
        String[] pattern = {"^(0[1-9]|3[0-1]|[1-9]|[1-2][0-9])/(0[1-9]|1[0-2]|[1-9])/[0-9]{4}$"};
        String formatoValidado = pattern(data, pattern);
        return formatoValidado;
    }

    public String trocarData() {
        System.out.println("Digite uma data para trocar:");
        String data = tc.next();
        if (validarData(data) == null) return null;

        String[] dateSplit = data.split("/");
        return dateSplit[1] + '/' + dateSplit[0] + '/' + dateSplit[2];
    }

    public  String validarInt() {
        System.out.println("Digite um inteiro:");
        String inteiro = tc.next();
        return inteiro.matches("^[0-9]*") ? inteiro : null;
    }
}
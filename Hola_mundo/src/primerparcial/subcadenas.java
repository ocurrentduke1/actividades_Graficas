package primerparcial;

public class subcadenas {
    public static void main(String[] args) {

        String hexValue = "PA064156";
        String ip = "";

        for(int i = 0; i < hexValue.length(); i = i + 2) {
            ip = ip + Integer.valueOf(hexValue.substring(i, i+2), 16) + ".";
        }

        System.out.println("Ip = " + ip);

    }
}
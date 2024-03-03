import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Hex2Ip {
    
    public static void main(String[] args) {
        Hex2Ip convertidor = new Hex2Ip();
        convertidor.convert();
    }
    public String hexToIP(String hex) {
        StringBuilder ip = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            String octeto = hex.substring(i, i + 2);
            ip.append(Integer.parseInt(octeto, 16));
            if (i < hex.length() - 2) {
                ip.append(".");
            }
        }
        return ip.toString();
    }

    public String ipToHex(String ip) throws UnknownHostException {
        byte[] bytes = Inet4Address.getByName(ip).getAddress();
        StringBuilder hex = new StringBuilder();
        for (byte b : bytes) {
            hex.append(String.format("%02X", b));
        }
        return hex.toString();
    }

    public void convert() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la opción (hex o ip):");
            String opcion = scanner.nextLine().trim().toLowerCase();
            System.out.println("Ingrese el valor:");
            String valor = scanner.nextLine();

            Hex2Ip convertidor = new Hex2Ip();

            switch (opcion) {
                case "hex" -> {
                    String ip = convertidor.hexToIP(valor);
                    System.out.println("IP: " + ip);
                }
                case "ip" -> {
                    try {
                        String hex = convertidor.ipToHex(valor);
                        System.out.println("Hexadecimal: " + hex);
                    } catch (UnknownHostException e) {
                        System.out.println("Dirección IP inválida: " + valor);
                    }
                }
                default -> System.out.println("Opción inválida: " + opcion);
            }
        }
    }
}

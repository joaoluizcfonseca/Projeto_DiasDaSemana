import javax.swing.JOptionPane;

public class  Principal {

    public static void main(String[] args) {

        int diaDasemana;
        String dia;

        diaDasemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia da seamanna(1-7)"));


        switch(diaDasemana) {

            case 1:
                dia = "Domingo";
                JOptionPane.showMessageDialog(null, "O dia da semana é: " + dia);
                break;

            case 2:
                dia = "Segunda";
                JOptionPane.showMessageDialog(null, "O dia da semana é; " + dia);
                break;

            case 3:
                dia = "Terça";
                JOptionPane.showMessageDialog(null, "O dia da semana é: " + dia);
                break;

            case 4:
                dia = "Quarta";
                JOptionPane.showMessageDialog(null, "O dia da semana é: " + dia);
                break;

            case 5:
                dia = "Quinta";
                JOptionPane.showMessageDialog(null, "O dia da semana é: " + dia);
                break;

             case 6:
                 dia = "Sexta";
                JOptionPane.showMessageDialog(null, "O dia da semana é: " + dia);
                break;

            case 7:
                dia = "Sabado";
                JOptionPane.showMessageDialog(null, "O dia da semana é: " + dia);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Erro");
                break;
        }
    }
}
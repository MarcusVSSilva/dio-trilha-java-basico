import javax.swing.JOptionPane;

//fazer a divisão de 2 valores inteiros
//tratamento de exceção, recebendo valores diferentes de numero inteiro  -- NumberFormatException
//tratamento de exceção pela divisão por zero                            -- ArithmeticException

public class UncheckedException {
    public static void main(String[] args) throws Exception {
        
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        //bloco try, onde a exception pode estourar
        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }catch(NumberFormatException e){
            //stacktrace é exibido no compilador, lendo de baixo para cima
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
        }catch(ArithmeticException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0. ");
        }finally{
            System.out.println("Chegou no finally");
        }
        
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}

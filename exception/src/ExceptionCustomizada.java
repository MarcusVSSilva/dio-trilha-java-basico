import javax.swing.JOptionPane;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};

        for(int i=0; i< denominador.length; i++){
            try{
                if(numerador[i] %2 != 0) 
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                    int resultado = numerador[i] / denominador[i];
                    System.out.println(resultado);

            }catch(DivisaoNaoExataException e){ //tratamento de uma exceção, resultando em uma divisão não exata
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch(ArithmeticException e){//tratamento de uma exceção, dividindo por zero 
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Impossível dividir por zero");
            }catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Não existe elemento na posição 4 do vetor numerador, para efetuar a divisão");
            }
                
            
            
            
        }
    }
}


//classe que representa uma exception nesse caso divisão de um numero impar por um par 
class DivisaoNaoExataException extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador){
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}
package view;
import controller.*;

public class ViewApresentarCardapio {
    
    public static String ListaDeProdutos = (ControllerInterfaceControler.receitasDisponiveis +  ControllerInterfaceControler.receitasIndisponiveis);

    public static void mostrar(){
        System.out.printf("Lista de produtos: \n");
       
        System.out.printf(ListaDeProdutos);

        
    }
}

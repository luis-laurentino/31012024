package view;

import view.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.ControllerMenuPrincipal;

public class LabelFrame extends JFrame 
{
   private final JLabel label1;
  

   public LabelFrame()
   {
      super("Sistema Padaria");
      setLayout(new FlowLayout(FlowLayout.CENTER)); 

      String saudacao = ViewBemVindo.bemVindo;

      
      label1 = new JLabel(saudacao);
      add(label1);
      label1.setHorizontalTextPosition(SwingConstants.CENTER);
      label1.setVerticalTextPosition(SwingConstants.BOTTOM);
      
      ButtonFrame();
    
   }

   
   public static String OpMenuPrincipal = "";
  
   public void ButtonFrame()
   {
      final JButton exibirCardapioBtn; 
      final JButton visualizarCarrinhoBtn; 
      final JButton visualizarPedidosBtn;
      final JButton sairBtn;
   
      exibirCardapioBtn = new JButton("Exibir Cardapio"); 
      add(exibirCardapioBtn); 
      

      visualizarCarrinhoBtn = new JButton("Visualizar Carrinho"); 
      add(visualizarCarrinhoBtn);
      
      
      visualizarPedidosBtn = new JButton("Visualizar Pedidos"); 
      add(visualizarPedidosBtn);
      

      sairBtn = new JButton("Sair do Sistema"); 
      add(sairBtn);
      




      ButtonHandler handler = new ButtonHandler();
      exibirCardapioBtn.addActionListener(handler);
      visualizarCarrinhoBtn.addActionListener(handler);
      visualizarPedidosBtn.addActionListener(handler);
      sairBtn.addActionListener(handler);
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener 
   {
      // handle button event
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String evt1 = event.getActionCommand();

        if (evt1.equals("Exibir Cardapio")) {
            OpMenuPrincipal = "1";
            ControllerMenuPrincipal.verificarOpcao();
            LabelCardapio.NewFrame();

        }

        if (evt1.equals("Visualizar Carrinho")) {
            OpMenuPrincipal = "2";
            ControllerMenuPrincipal.verificarOpcao();
        }

        if (evt1.equals("Visualizar Pedidos")) {
            OpMenuPrincipal = "3";
            ControllerMenuPrincipal.verificarOpcao();
        }

        if (evt1.equals("Sair do Sistema")) {
            OpMenuPrincipal = "4";
            ControllerMenuPrincipal.verificarOpcao();
        }
      }
   }

//    public void JanelaCardapio(){
//       JOptionPane.showMessageDialog(LabelFrame.this, String.format(ViewApresentarCardapio.ListaDeProdutos));
//       ButtonMenuCardapio();
//   }



   
   
   
} 
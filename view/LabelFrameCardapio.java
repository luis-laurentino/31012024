package view;

import view.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import controller.ControllerMenuPrincipal;

public class LabelFrameCardapio extends JFrame {

    private final JLabel labelShowCardapio;

    public LabelFrameCardapio() {

        super("Cardapio Padaria");
        setLayout(new FlowLayout());

        labelShowCardapio = new JLabel(ViewApresentarCardapio.ListaDeProdutos);
        labelShowCardapio.setWrapText(true);
        labelShowCardapio.setHorizontalTextPosition(SwingConstants.CENTER);
        labelShowCardapio.setVerticalTextPosition(SwingConstants.TOP);
        add(labelShowCardapio);

        ButtonMenuCardapio();

    }

    public void ButtonMenuCardapio() {
        final JButton realizarPedidoBtn;
        final JButton voltarMenuPrincipalBtn;
        final JButton sairBtn;

        realizarPedidoBtn = new JButton("Realizar Pedido");
        realizarPedidoBtn.setAlignmentX(LEFT_ALIGNMENT);
        add(realizarPedidoBtn);
        
        voltarMenuPrincipalBtn = new JButton("Volar ao menu principal.");
        realizarPedidoBtn.setAlignmentX(CENTER_ALIGNMENT);
        add(voltarMenuPrincipalBtn);
        
        sairBtn = new JButton("Sair do Sistema");
        realizarPedidoBtn.setAlignmentX(RIGHT_ALIGNMENT);
        add(sairBtn);

        ButtonHandler handler = new ButtonHandler();
        realizarPedidoBtn.addActionListener(handler);
        voltarMenuPrincipalBtn.addActionListener(handler);
        sairBtn.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        // handle button event
        @Override
        public void actionPerformed(ActionEvent event) {
            String evt1 = event.getActionCommand();

            if (evt1.equals("Realizar Pedido")) {

                
            }

            if (evt1.equals("Visualizar Carrinho")) {

                
            }

            if (evt1.equals("Visualizar Pedidos")) {

               
            }

            if (evt1.equals("Sair do Sistema")) {

                
            }
        }
    }
}

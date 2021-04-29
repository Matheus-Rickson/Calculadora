package controle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    private Integer contador;
    private JLabel titulo;
    private JButton botao;

    GUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        contador = 0;

        setSize(600,400);
        setLocation(200,200);
        setLayout(new FlowLayout());

        titulo = new JLabel("teste");
        add(titulo);

        botao = new JButton(contador.toString());
        botao.addActionListener(this);
        add(botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        contador++;
        botao.setText(contador.toString());
    }

}

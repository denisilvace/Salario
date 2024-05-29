package botao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MoveButton2 extends JFrame {

    public MoveButton2() {
        super("Move Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Salário:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1.setBounds(166, 27, 98, 39);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("30%");
        lblNewLabel_1_1.setForeground(Color.GREEN);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_1.setBounds(264, 27, 59, 39);
        getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Denisilva\\Downloads\\BackgroundEraser_20230608_151419249 (1).png"));
        lblNewLabel.setBounds(10, 13, 214, 337);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1_2 = new JLabel("Gratidão:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_2.setBounds(166, 77, 112, 39);
        getContentPane().add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("18%");
        lblNewLabel_1_1_2.setForeground(Color.GREEN);
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_1_2.setBounds(285, 77, 59, 39);
        getContentPane().add(lblNewLabel_1_1_2);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("Vontade de");
        lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_1_2_1.setBounds(211, 115, 112, 39);
        getContentPane().add(lblNewLabel_1_2_1);
        
        JLabel lblNewLabel_1_2_1_1 = new JLabel("se demitir:");
        lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_1_2_1_1.setBounds(211, 140, 112, 39);
        getContentPane().add(lblNewLabel_1_2_1_1);
        
        JLabel lblNewLabel_1_1_2_1 = new JLabel("-25%");
        lblNewLabel_1_1_2_1.setForeground(Color.RED);
        lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_1_1_2_1.setBounds(315, 130, 69, 39);
        getContentPane().add(lblNewLabel_1_1_2_1);
        
        JLabel lblNewLabel_1_2_2 = new JLabel("Mau humor:");
        lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_2_2.setBounds(151, 205, 152, 39);
        getContentPane().add(lblNewLabel_1_2_2);
        
        JLabel lblNewLabel_1_1_2_1_1 = new JLabel("-12%");
        lblNewLabel_1_1_2_1_1.setForeground(Color.RED);
        lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_1_1_2_1_1.setBounds(305, 205, 69, 39);
        getContentPane().add(lblNewLabel_1_1_2_1_1);
    }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MoveButton2 moveButton = new MoveButton2();
            moveButton.setVisible(true);
        });
    }
    public void visivel() {
    	 MoveButton2 moveButton = new MoveButton2();
         moveButton.setVisible(true);
		
	}
}
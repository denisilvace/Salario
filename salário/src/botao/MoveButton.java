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

public class MoveButton extends JFrame {
    private JButton btnNo;

    public MoveButton() {
        super("Move Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        getContentPane().setLayout(null); // Layout nulo para controlar manualmente as posições dos componentes

        btnNo = new JButton("Não");
        btnNo.setBounds(245, 242, 100, 50); // Define a posição inicial do botão
        getContentPane().add(btnNo);
        
        JButton btnSim = new JButton("Sim, meu melhor funcionário");
        btnSim.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MoveButton2 move = new MoveButton2();
        		
				move.visivel();
				MoveButton moveButton = new MoveButton();
				moveButton.dispose();
        	}
        });
        btnSim.setBounds(10, 242, 210, 50);
        getContentPane().add(btnSim);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Denisilva\\Downloads\\Ea__31zWsAAwjDT (1).png"));
        lblNewLabel.setBounds(25, 24, 210, 182);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("ME\r\n");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1.setBounds(265, 31, 46, 39);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("DÁ");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_1.setBounds(265, 68, 46, 39);
        getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("UM");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_1_1.setBounds(265, 106, 46, 39);
        getContentPane().add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("AUMENTO?");
        lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblNewLabel_1_1_1_1.setBounds(221, 144, 163, 39);
        getContentPane().add(lblNewLabel_1_1_1_1);

        btnNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                moveButtonRandomly(); // Chama o método para mover o botão quando o mouse entra nele
            }
        });
    }

    private void moveButtonRandomly() {
        // Obtém o tamanho do painel principal
        int panelWidth = getContentPane().getWidth();
        int panelHeight = getContentPane().getHeight();

        // Calcula uma posição aleatória dentro do painel principal
        int newX = (int) (Math.random() * (panelWidth - btnNo.getWidth()));
        int newY = (int) (Math.random() * (panelHeight - btnNo.getHeight()));

        // Define a nova posição do botão
        btnNo.setLocation(newX, newY);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MoveButton moveButton = new MoveButton();
            moveButton.setVisible(true);
        });
    }
}
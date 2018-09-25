
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;




public class SubslotOptimizer {

	private JFrame frame = new JFrame();
		
	private final JButton btnUprightPower = new JButton("Upright Power");
	private final JButton btnUprightSpeed = new JButton("Upright Speed");
	private final JButton btnUprightMagic = new JButton("Upright Magic");
	private final JButton btnReversePower = new JButton("Reverse Power");
	private final JButton btnReverseSpeed = new JButton("Reverse Speed");
	private final JButton btnReverseMagic = new JButton("Reverse Magic");
	
	private final JLabel information = new JLabel("");
	private final JFormattedTextField medalTierTextField = new JFormattedTextField();

	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		SubslotOptimizer window = new SubslotOptimizer();
		window.initialize();
		
		
	}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//Label to display information
		frame.getContentPane().add(information);
		information.setBounds(34, 11, 365, 30);

		//Label for tier of medal
		frame.getContentPane().add(medalTierTextField);
		medalTierTextField.setBounds(108, 66, 112, 23);

		frame.getContentPane().add(btnUprightPower);
		btnUprightPower.setBounds(34, 100, 112, 23);
		

		frame.getContentPane().add(btnUprightSpeed);
		btnUprightSpeed.setBounds(34, 134, 112, 23);
		
		frame.getContentPane().add(btnUprightMagic);
		btnUprightMagic.setBounds(34, 168, 112, 23);

		frame.getContentPane().add(btnReversePower);
		btnReversePower.setBounds(190, 100, 112, 23);
		
		frame.getContentPane().add(btnReverseSpeed);
		btnReverseSpeed.setBounds(190, 134, 112, 23);

		frame.getContentPane().add(btnReverseMagic);
		btnReverseMagic.setBounds(190, 168, 112, 23);
		
		//reset();
	}

	
	
}

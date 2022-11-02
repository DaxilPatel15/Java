/** Here it models a ROCK, PAPER, SCISSOR game. 
* Author: Mansi Yagnik, Jenil Shah, Daxil Patel, Aarsh Patel 
* Date: 25th July,2022  * Time: 23:00 PM   */  
//all the import statements
package rock_paper_scissors;
import java.io.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// this class sets the GUI for the game which includes images, it’s position, size and text position 
// it also identify the palyer’s move when he/she click on the images
public class Game extends JFrame {
	JLabel computer_choice,result;
	JLabel computerscore,playerscore;
	int computer_score=0;
	int player_score = 0;
	ImageIcon rock,image_paper,image_scissor;

	public void setup() {
		rock=new ImageIcon(new ImageIcon("rock.png").getImage()
						.getScaledInstance(80,80,Image.SCALE_DEFAULT));
		image_paper = new ImageIcon(new ImageIcon("paper.png").getImage()
						.getScaledInstance(80,80,Image.SCALE_DEFAULT));
		image_scissor = new ImageIcon(new ImageIcon("scissor.png").getImage()
						.getScaledInstance(80,80,Image.SCALE_DEFAULT));
		
		//create computer Label
		computer_choice=new JLabel();
		computer_choice.setHorizontalTextPosition(JLabel.CENTER);
		computer_choice.setVerticalTextPosition(JLabel.BOTTOM);	
		computer_choice.setBounds(250,90,100,100);
	
		result=new JLabel();
		result.setFont(new Font("Serif",Font.BOLD,22));
		result.setBounds(250,400,100,100);
		
		JLabel score = new JLabel("Score");
		score.setBounds(500,0,100,100);
		
		computerscore = new JLabel();
		computerscore.setText("computer : 0");
		computerscore.setBounds(500,15,100,100);
		
		playerscore = new JLabel();
		playerscore.setText("Player : 0");
		playerscore.setBounds(500,30,100,100);
		
		// text between icons
		
		JLabel lable_computer=new JLabel();
		lable_computer.setText("Computer");
		lable_computer.setBounds(260,15,100,100);
		
		JLabel lable_VS=new JLabel();
		lable_VS.setText("VS");
		lable_VS.setBounds(275,180,100,100);
		
		JLabel lable_player=new JLabel();
		lable_player.setText("Player");
		lable_player.setBounds(265,230,100,100);
		
		// create Label
	
		JLabel lable_rock=new JLabel();
		label_rock.setText("Rock");
		label_rock.setIcon(rock);
		label_rock.setHorizontalTextPosition(JLabel.CENTER);
		label_rock.setVerticalTextPosition(JLabel.BOTTOM);
		label_rock.setBounds(150,300,100,100);
		
		JLabel lable_paper=new JLabel();
		label_paper.setText("Paper");
		label_paper.setIcon(image_paper);
		label_paper.setHorizontalTextPosition(JLabel.CENTER);
		label_paper.setVerticalTextPosition(JLabel.BOTTOM);
		label_paper.setBounds(250,300,100,100);
		
		JLabel lable_scissor=new JLabel();
		label_scissor.setText("Scissor");
		label_scissor.setIcon(image_scissor);
		label_scissor.setHorizontalTextPosition(JLabel.CENTER);
		label_scissor.setVerticalTextPosition(JLabel.BOTTOM);
		label_scissor.setBounds(350,300,100,100);
		
		// mouseListener
		
		label_rock.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				calculate(label_rock.getText());
			}
		});
		
		label_paper.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				calculate(label_paper.getText());
			}
		});
		
		label_scissor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				calculate(label_scissor.getText());
			}
		});
		
		// add instance in frame
		
		add(label_rock);
		add(label_paper);
		add(label_scissor);
		add(computer_choice);
		add(label_computer);
		add(label_VS);
		add(label_player);
		add(result);
		add(score);
		add(computerscore);
		add(playerscore);
		setLayout(null);
	}

	// this class consists of the main logic that how the computer randomly make a choice
	// also it takes the player’s move and so comparison and gives out result as won, lost or tied
	public void calculate(String player) {
	       // int scores;
	      //do {
		String[] list= {"Rock","Paper","Scissor"};
		int random_choice = (int)((Math.random()*10)%3);
		
		String computer=list[random_choice];
		
		//computer choice display on screen
		
		computer_choice.setText(computer);
		switch(random_choice) {
			case 0:
				computer_choice.setIcon(rock);
				break;
			case 1:
				computer_choice.setIcon(image_paper);
				break;
			case 2:
				computer_choice.setIcon(image_scissor);
				break;
		}
		
		//Logic
		
		String res = "";
		if(player.equals(computer)) {
			res="Draw";
		}
		else if(player.equals("Rock")) {
			if(computer.equals("Paper")) {
				res="You loose";
				computer_score++;
			}
			else {
				res = "You win";
				player_score++;
			}	
		}
		else if(player.equals("Paper")) {
			if(computer.equals("Scissor")) {
				res="You loose";
				computer_score++;
			}
			else {
				res="You win";
				player_score++;
			}			
		}
		else {
			if(computer.equals("Rock")) {
				res="You loose";
				computer_score++;
			}
			else {
				res = "You win";
				player_score++;
			}
		}
	
	
	result.setText(res);
	playerscore.setText("Player : "+player_score);
	computerscore.setText("computer : "+computer_score);
	//scores = computer_score + player_score
	   //  }
	     //while (scores < 6);
	}
	// main method
	public static void main(String[] args) {
		Game g = new Game();
		g.setTitle("Rock Paper Scissor");
		g.setBounds(200,200,600,600);
		g.getContentPane().setBackground(Color.WHITE);
		g.setup();
		g.setResizable(false);
		g.setVisible(true);
		
	}
	
}

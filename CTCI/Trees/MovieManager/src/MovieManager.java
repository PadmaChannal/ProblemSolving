import java.awt.EventQueue;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;


public class MovieManager {

	private JFrame frame;
	private JTextField textFieldTitle;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textFieldYear;
	private JTextField textFieldRunTime;
	private JFileChooser fileChooser ;
	private Scanner input;
	List<String> stack = new Stack<String>(); 
	ArrayList<String> list = new ArrayList<>();
	public int count = 0;

	  
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieManager window = new MovieManager();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MovieManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Title
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(144, 108, 61, 16);
		frame.getContentPane().add(lblTitle);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(239, 100, 199, 33);
		frame.getContentPane().add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		// Year
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(144, 156, 61, 16);
		frame.getContentPane().add(lblYear);
		
		textFieldYear = new JTextField();
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(239, 145, 199, 33);
		frame.getContentPane().add(textFieldYear);
		
		// RunTime
		JLabel lblRuntime = new JLabel("RunTime");
		lblRuntime.setBounds(144, 209, 61, 16);
		frame.getContentPane().add(lblRuntime);
				
		textFieldRunTime = new JTextField();
		textFieldRunTime.setColumns(10);
		textFieldRunTime.setBounds(239, 190, 199, 33);
		frame.getContentPane().add(textFieldRunTime);
		
		
		// Button read:
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenFile();
				int returnValue = fileChooser.showOpenDialog(frame);
				if(returnValue == fileChooser.APPROVE_OPTION) {
						ReadFile();
						ReadNextRecord();
					    
				}
				else {
					lblTitle.setText("File not found!");
				}
			}
		});
		btnRead.setBounds(206, 349, 121, 41);
		frame.getContentPane().add(btnRead);
		
		// Button Previous:
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadPreviousRecord();
			}
		});
		btnPrevious.setBounds(96, 298, 121, 41);
		frame.getContentPane().add(btnPrevious);
		
		// Button Next:
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadNextRecord();
			}
		});
		btnNext.setBounds(304, 296, 121, 41);
		frame.getContentPane().add(btnNext);
		
		// Button Write:
		JButton btnWrite = new JButton("Write");
		btnWrite.setBounds(96, 402, 121, 41);
		frame.getContentPane().add(btnWrite);
		
		// Button Delete:
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(304, 402, 121, 41);
		frame.getContentPane().add(btnDelete);
		
		// Button Movie Data:
		JLabel lblMovieData = new JLabel("MOVIE DATA");
		lblMovieData.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovieData.setBounds(178, 23, 161, 41);
		frame.getContentPane().add(lblMovieData);
		

	}
	
	public void OpenFile() {
		fileChooser = new JFileChooser(); 
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
	}
	
	public void ReadFile() {
		try
	      {
	         input = new Scanner(fileChooser.getSelectedFile().toPath()); 
	      } 
	      catch (IOException ioException)
	      {
	         System.err.println("Error opening file. Terminating.");
	         System.exit(1);
	      }
		
	}	
	
	public void ReadNextRecord() {
		try 
	      {
	    	  	 String line = input.nextLine();
	    	  	 stack.add(line);
	        	 String[] details = line.split(",");
	         textFieldTitle.setText(details[0]);
	        	 textFieldYear.setText(details[1]);
	        	 textFieldRunTime.setText(details[2]);
	      } 
	      
	      catch (NoSuchElementException elementException)
	      {
	         System.err.println("File improperly formed. Terminating.");
	      } 
	      catch (IllegalStateException stateException)
	      {
	         System.err.println("Error reading from file. Terminating.");
	      }
		
	}
	
	
	public void ReadPreviousRecord() {
		
		try {
			String previousLine = stack.remove(stack.size() -1);
			String[] details = previousLine.split(",");
	         textFieldTitle.setText(details[0]);
	        	 textFieldYear.setText(details[1]);
	        	 textFieldRunTime.setText(details[2]);
		}
		catch (NoSuchElementException elementException)
	      {
	         System.err.println("File improperly formed. Terminating.");
	      } 
	      catch (IllegalStateException stateException)
	      {
	         System.err.println("Error reading from file. Terminating.");
	      }
		
	}
	
}
	

	 

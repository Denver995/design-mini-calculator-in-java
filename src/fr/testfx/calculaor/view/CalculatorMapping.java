package fr.testfx.calculaor.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorMapping {
	@FXML
	public Button one;
	@FXML
	public Button two;
	@FXML
	public Button three;
	@FXML
	public Button four;
	@FXML
	public Button five;
	@FXML
	public Button six;
	@FXML
	public Button seven;
	@FXML
	public Button eight;
	@FXML
	public Button nine;
	@FXML
	public Button zero;
	@FXML
	public Button doublezero;
	@FXML
	public Button point;
	@FXML
	public Button clear;
	@FXML
	public Button percent;
	@FXML
	public Button plus;
	@FXML
	public Button minus;
	@FXML
	public Button mult;
	@FXML
	public Button div;
	@FXML
	public Button cos;
	@FXML
	public Button sin;
	@FXML
	public Button equal;
	@FXML
	public TextField input;
	@FXML
	public Label promp;
	
	private long fnumber;
	private long snumber;
	private long prompt;
	private String operation;

	public CalculatorMapping() {
		// TODO Auto-generated constructor stub
	}
	
	//Méthode qui initialise notre interface graphique
    //avec nos données métier
    @FXML
    private void initialize() {
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_one() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "1");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_two() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "2");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_three() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "3");
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_four() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "4");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_five() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "5");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_six() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "6");
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_seven() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "7");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_height() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "8");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_nine() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "9");
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_zero() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "0");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_point() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + ".");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_clear() {
    	input.setText("");
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_percent() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "%");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_doublezero() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "00");
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_plus() {
    	String value = input.getText();
    	long valueconverted = Integer.parseInt(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "+");
    	operation = "+";
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_minus() {
    	String value = input.getText();
    	long valueconverted = Integer.parseInt(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "-");
    	operation = "-";
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_div() {
    	String value = input.getText();
    	long valueconverted = Integer.parseInt(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "/");
    	operation = "/";
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_mult() {
    	String value = input.getText();
    	long valueconverted = Integer.parseInt(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "X");
    	operation = "X";
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_sin() {
    	String value = input.getText();
    	long valueconverted = Integer.parseInt(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText("Sin"+valueconverted);
    	operation = "sinus";
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_cos() {
    	
    	String value = input.getText();
    	long valueconverted = Integer.parseInt(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText("Cos"+valueconverted);
    	operation = "conus";
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    private void on_click_equal() {
    	switch(operation) {
    	case "+":
    		String value = input.getText();
    		this.snumber = Integer.parseInt(value);
    		long result = this.fnumber + this.snumber;
    		input.setText(String.valueOf(result));
    		String oldpromp = promp.getText();
    		promp.setText(oldpromp + value);
    		break;
    		
    	case "-":
    		String valuemoin = input.getText();
    		this.snumber = Integer.parseInt(valuemoin);
    		long resultmoin = this.fnumber - this.snumber;
    		input.setText(String.valueOf(resultmoin));
    		String oldprompmoin = promp.getText();
    		promp.setText(oldprompmoin + valuemoin);
    		break;
    	
    	case "X":
    		String valuemult = input.getText();
    		this.snumber = Integer.parseInt(valuemult);
    		long resultmult = this.fnumber * this.snumber;
    		input.setText(String.valueOf(resultmult));
    		String oldpromptmult = promp.getText();
    		promp.setText(oldpromptmult + valuemult);
    		break;
    		
    	case "/":
    		String valuediv = input.getText();
    		this.snumber = Integer.parseInt(valuediv);
    		long resultdiv = this.fnumber / this.snumber;
    		input.setText(String.valueOf(resultdiv));
    		String oldprompdiv = promp.getText();
    		promp.setText(oldprompdiv + valuediv);
    		break;
    	}
    }


}

package fr.testfx.calculator.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorMapping {
	@FXML
	public Button zero;
	@FXML
	public Button doublezero;
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
	public Button eigth;
	@FXML
	public Button nine;
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
	public Button tan;
	@FXML
	public Button sqrt;
	@FXML
	public Button sqr;
	@FXML
	public Button negation;
	@FXML
	public Button equal;
	@FXML
	public Label input;
	@FXML
	public Label promp;
	
	private long fnumber;
	private long snumber;
	private String operation;

	public CalculatorMapping() {
		// TODO Auto-generated constructor stub
	}
	
	//Méthode qui initialise notre interface graphique
    public void initialize(URL url, ResourceBundle rb) {
	        // TODO
	}
    
    public void desactiveAllButton() {
		Button buttons[] = {this.point, this.doublezero, this.zero, this.one, this.two, this.three, this.four, this.five, this.six, this.seven, this.eigth, this.nine};
		for(int i=0; i < buttons.length; i++) {
			if(!buttons[i].isDisable())
				buttons[i].setDisable(true);
		}
    }
    
    public void activeAllButton() {
		Button buttons[] = {this.point, this.doublezero, this.zero, this.one, this.two, this.three, this.four, this.five, this.six, this.seven, this.eigth, this.nine};
		for(int i=0; i < buttons.length; i++) {
			if(buttons[i].isDisable())
				buttons[i].setDisable(false);
		}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_one() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("1");
    	}else {
    	input.setText(oldvalue + "1");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_two() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("2");
    	}else {
    		input.setText(oldvalue + "2");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_three() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("3");
    	}else {
    		input.setText(oldvalue + "3");
    	}
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_four() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("4");
    	}else {
    		input.setText(oldvalue + "4");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_five() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("5");
    	}else {
    		input.setText(oldvalue + "5");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_six() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("6 ");
    	}else {
    	input.setText(oldvalue + "6");
    	}
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_seven() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("7");
    	}else {
    	input.setText(oldvalue + "7");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_height() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("8");
    	}else {
    	 input.setText(oldvalue + "8");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_nine() {
    	String oldvalue = input.getText();
    	if(oldvalue.equals("0") || oldvalue.equals("00") || oldvalue.equals("Math Error")) {
    		input.setText("9");
    	}else {
    	 input.setText(oldvalue + "9");
    	}
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_zero() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "0");
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_point() {
    	String oldvalue = input.getText();
    	if(oldvalue.indexOf('.') == -1) {
    		input.setText(oldvalue + ".");
    	}
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_clear() {
    	input.setText("");
    	this.activeAllButton();
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_percent() {
    	String value = input.getText();
    	input.setText(value + "%");
    	long valueconverted = Long.parseLong(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "%");
    	operation = "%";
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_doublezero() {
    	String oldvalue = input.getText();
    	input.setText(oldvalue + "00");
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_plus() {
    	this.activeAllButton();
    	String value = input.getText();
    	long valueconverted = Long.parseLong(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "+");
    	operation = "+";
    	this.activeAllButton();
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_minus() {
    	this.activeAllButton();
    	String value = input.getText();
    	long valueconverted = Long.parseLong(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "-");
    	operation = "-";
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_div() {
    	this.activeAllButton();
    	String value = input.getText();
    	long valueconverted = Long.parseLong(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "/");
    	operation = "/";
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_mult() {
    	this.activeAllButton();
    	String value = input.getText();
    	long valueconverted = Long.parseLong(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "X");
    	operation = "X";
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_sin() {
    	String value = input.getText();
    	promp.setText("Sin"+value);
		double result = Math.sin(Double.parseDouble(value));
		input.setText(Double.toString(result));
		this.fnumber = (long) result;
		
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_cos() {
    	
    	String value = input.getText();
    	promp.setText("Cos"+value);
		double result = Math.cos(Double.parseDouble(value));
		input.setText(Double.toString(result));
		this.fnumber = (long) result;
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_tan() {
    	
    	String value = input.getText();
    	promp.setText("Tan"+value);
		double result = Math.tan(Double.parseDouble(value));
		input.setText(Double.toString(result));
		this.fnumber = (long) result;
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_squareroot() {
    	
    	String value = input.getText();
    	if(Double.parseDouble(value) < 0) {
    		input.setText("Math Error");
    	}
    	promp.setText("√"+value);
		double result = Math.sqrt(Double.parseDouble(value));
		input.setText(Double.toString(result));
		this.fnumber = (long) result;
    }
    
    //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_square() {
    	
    	String value = input.getText();
    	promp.setText(value+"²");
		long result = Long.parseLong(value)*Long.parseLong(value);
		input.setText(Long.toString(result));
		this.fnumber = result;
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_negation() {
    	
    	String value = input.getText();
    	long convertedvalue = Long.parseLong(value);
    	convertedvalue = -1*convertedvalue;
    	promp.setText(Long.toString(convertedvalue));
    	input.setText(Long.toString(convertedvalue));
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_power() {
    	this.activeAllButton();
    	String value = input.getText();
    	long valueconverted = Long.parseLong(value);
    	this.fnumber = valueconverted;
    	input.setText("");
    	promp.setText(valueconverted + "^");
    	operation = "^";
    }
    
  //Méthode qui sera exécuté lorsqu'on clique sur le boutton 1
    public void on_click_equal() {
    	this.desactiveAllButton();
    	switch(operation) {
	    	case "+":
	    		String value = input.getText();
	    		this.snumber = Long.parseLong(value);
	    		long result = this.fnumber + this.snumber;
	    		input.setText(String.valueOf(result));
	    		String oldpromp = promp.getText();
	    		promp.setText(oldpromp + value);
	    		operation = "";
	    		break;
	    		
	    	case "-":
	    		String valuemoin = input.getText();
	    		this.snumber = Long.parseLong(valuemoin);
	    		long resultmoin = this.fnumber - this.snumber;
	    		input.setText(String.valueOf(resultmoin));
	    		String oldprompmoin = promp.getText();
	    		promp.setText(oldprompmoin + valuemoin);
	    		operation = "";
	    		break;
	    	
	    	case "X":
	    		String valuemult = input.getText();
	    		this.snumber = Long.parseLong(valuemult);
	    		long resultmult = this.fnumber * this.snumber;
	    		input.setText(String.valueOf(resultmult));
	    		String oldpromptmult = promp.getText();
	    		promp.setText(oldpromptmult + valuemult);
	    		operation = "";
	    		break;
	    		
	    	case "^":
	    		String valuepower = input.getText();
	    		this.snumber = Long.parseLong(valuepower);
	    		double resultpower = Math.pow((double)this.fnumber, (double)this.snumber);
	    		input.setText(String.valueOf(resultpower));
	    		String oldpromptpower = promp.getText();
	    		promp.setText(oldpromptpower + valuepower);
	    		operation = "";
	    		break;
	    		
	    	case "%":
	    		String valuemod = input.getText();
	    		this.snumber = Long.parseLong(valuemod);
	    		long resultmod = Math.floorMod(this.fnumber, this.snumber);
	    		input.setText(String.valueOf(resultmod));
	    		String oldpromptmod = promp.getText();
	    		promp.setText(oldpromptmod + valuemod);
	    		operation = "";
	    		break;
	    		
	    	case "/":
	    		String valuediv = input.getText();
	    		if(valuediv.equals("0")) {
	    			input.setText("Math Error");
	    			promp.setText("");
	  
	    		}else {
	    			this.snumber = Long.parseLong(valuediv);
	        		long resultdiv = this.fnumber / this.snumber;
	        		input.setText(String.valueOf(resultdiv));
	        		String oldprompdiv = promp.getText();
	        		promp.setText(oldprompdiv + valuediv);
	        		operation = "";
	    		}
	    		break;
	    	default:
	    		promp.setText("0");
	    		break;
	    	}
    }


}

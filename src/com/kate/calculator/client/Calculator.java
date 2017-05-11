package com.kate.calculator.client;

//import com.kate.calculator.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Calculator implements EntryPoint
{

	private VerticalPanel mainPanel = new VerticalPanel();
	private HorizontalPanel addPanel0 = new HorizontalPanel();
	private HorizontalPanel addPanel1 = new HorizontalPanel();
	private HorizontalPanel addPanel2 = new HorizontalPanel();
	private HorizontalPanel addPanel3 = new HorizontalPanel();
	private HorizontalPanel addPanel4 = new HorizontalPanel();
	private HorizontalPanel addPanel5 = new HorizontalPanel();
	private TextBox myTextBox = new TextBox();
	private Button b1 = new Button("C");
	private Button b2 = new Button("+/-");
	private Button b3 = new Button("%");
	private Button b4 = new Button("/");
	private Button b5 = new Button("7");
	private Button b6 = new Button("8");
	private Button b7 = new Button("9");
	private Button b8 = new Button("*");
	private Button b9 = new Button("4");
	private Button b10 = new Button("5");
	private Button b11 = new Button("6");
	private Button b12 = new Button("-");
	private Button b13 = new Button("1");
	private Button b14 = new Button("2");
	private Button b15 = new Button("3");
	private Button b16 = new Button("+");
	private Button b17 = new Button("0");
	private Button b18 = new Button(".");
	private Button b19 = new Button("<img src='images/backspace.png' width='20' height='20';/>");
	private Button b20 = new Button("=");
	
	private double num1, num2, answer;
	private String numT1, numT2, answerT;
	private char mathOperator = ' ';
	private boolean equalsClicked = false, opChosen = false;
	
	
		  public void onModuleLoad() {
	 
//			 	add HorizontalPanel 
			 myTextBox.setSize("152px", "40px");
			 addPanel0.add(myTextBox); 
			 addPanel1.add(b1);
			 addPanel1.add(b2);
			 addPanel1.add(b3);
			 addPanel1.add(b4);
			 addPanel2.add(b5);
			 addPanel2.add(b6);
			 addPanel2.add(b7);
			 addPanel2.add(b8);
			 addPanel3.add(b9);
			 addPanel3.add(b10);
			 addPanel3.add(b11);
			 addPanel3.add(b12);
			 addPanel4.add(b13);
			 addPanel4.add(b14);
			 addPanel4.add(b15);
			 addPanel4.add(b16);
			 addPanel5.add(b17);
			 addPanel5.add(b18);
			 addPanel5.add(b19);
			 addPanel5.add(b20);
			 
//			 	add VerticalPanel
			 mainPanel.add(addPanel0);
			 mainPanel.add(addPanel1);
			 mainPanel.add(addPanel2);
			 mainPanel.add(addPanel3);
			 mainPanel.add(addPanel4);
			 mainPanel.add(addPanel5);
			  
//			 add VerticalPanel to HTML host page
			 RootPanel.get().add(mainPanel);
			 
//			 add number 0-9
			 //0
			 b17.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "0";
							}else {
								numT1 += "0";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "0";
							}else {
								numT2 += "0";
							}
							myTextBox.setText(numT2);
						}				
					}
			});
			 //1
			b13.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "1";
							}else {
								numT1 += "1";
							}
							myTextBox.setText(numT1);
						} else if(opChosen==true){
							if(numT2==null){
								numT2 = "1";
							}else {
								numT2 += "1";
							}
							myTextBox.setText(numT2);
						}		
					}
				 });
			 //2 
			b14.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "2";
							}else {
								numT1 += "2";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "2";
							}else {
								numT2 += "2";
							}
							myTextBox.setText(numT2);
						}
					}
				});
			 //3	 
			b15.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "3";
							}else {
								numT1 += "3";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "3";
							}else {
								numT2 += "3";
							}
							myTextBox.setText(numT2);
						}
					}
				});
			//4
			b9.addClickHandler(new ClickHandler(){
				@Override
				public void onClick(ClickEvent event)
				{
					if(opChosen==false){
						if(numT1==null || numT1.equals("0")){
							numT1 = "4";
						}else {
							numT1 += "4";
						}
						myTextBox.setText(numT1);
					} else{
						if(numT2==null){
							numT2 = "4";
						}else {
							numT2 += "4";
						}
						myTextBox.setText(numT2);
					}		
				}	 
			 });		 
			 //5
			 b10.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "5";
							}else {
								numT1 += "5";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "5";
							}else {
								numT2 += "5";
							}
							myTextBox.setText(numT2);
						}			
					}				 
				 });	
			 //6
			 b11.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "6";
							}else {
								numT1 += "6";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "6";
							}else {
								numT2 += "6";
							}
							myTextBox.setText(numT2);
						}					
					}				 
				 });
			 //7
			 b5.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "7";
							}else {
								numT1 += "7";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "7";
							}else {
								numT2 += "7";
							}
							myTextBox.setText(numT2);
						}					
					}
				 });
			 //8
			 b6.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "8";
							}else {
								numT1 += "8";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "8";
							}else {
								numT2 += "8";
							}
							myTextBox.setText(numT2);
						}					
					}
				 });
			 //9
			 b7.addClickHandler(new ClickHandler(){
					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null || numT1.equals("0")){
								numT1 = "9";
							}else {
								numT1 += "9";
							}
							myTextBox.setText(numT1);
						} else{
							if(numT2==null){
								numT2 = "9";
							}else {
								numT2 += "9";
							}
							myTextBox.setText(numT2);
						}
					}
				 });
			 
//			add "+/-", ".", "<=" these 3 symbols happen with numbers but not categorized as operators 
			 // +/-
			 b2.addClickHandler(new ClickHandler(){

					@Override
					public void onClick(ClickEvent event)
					{
						if(opChosen==false){
							if(numT1==null){
								numT1 = "-";
							}else if(numT1 !=null && numT1.startsWith("-")){
								numT1 = numT1.substring(1); // means cut numT1, show from index1.. "-" => "+"
							}else 
								numT1 = "-" + numT1;		// "+" => "-"
							myTextBox.setText(numT1);
						} else {
							if(numT2==null){
								numT2 = "-";	
							}else if(numT2 !=null && numT2.startsWith("-")){
								numT2 = numT2.substring(1); // "-" => "+"
							}else
								numT2 = "-" + numT2;		// "+" => "-"
							myTextBox.setText(numT2);
						}		
					}				 
				 });
			 
			// "."
			 b18.addClickHandler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event)
				{
					if(opChosen==false){
						if(numT1==null){
							numT1 = "0.";
						}else if(numT1!=null){
								if(numT1.contains(".")){
								
								} else
							numT1 += ".";
						}
						myTextBox.setText(numT1);
					} else{
						if(numT2==null){
							numT2 = "0.";
						}else if(numT2!=null){
							if(numT2.contains(".")){

							} else
							numT2 += ".";
						}
						myTextBox.setText(numT2);
					}	
				}
			 });
			 
			 // "<="
			 b19.addClickHandler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event)
				{
					if(opChosen==false){
						if(numT1==null){
		
						}else if(numT1!=null){
							numT1 = numT1.substring(0, numT1.length()-1); //!!to code so that it means delete the last digit
						}
						myTextBox.setText(numT1);
					}else {
						if(numT2==null){
							
						} else if(numT2!=null){
							numT2 = numT2.substring(0, numT2.length()-1);
						}
						myTextBox.setText(numT2);
					}
				}
			 });
			 
		 			 
//			 add operators "/", "*", "-", "+", "%", "=", "C"		 
			 // /
			 b4.addClickHandler(new ClickHandler(){

					@Override
					public void onClick(ClickEvent event)
					{
						if(numT1==null){
							Window.alert("Choose your num1");
						}else if(numT1!=null && numT2==null){
							opChosen = true;
							mathOperator = '/';
						}else if(numT1!=null && numT2!=null){
							Window.alert("Two operations only!");
						}				
					}
				 });
			 // *
			 b8.addClickHandler(new ClickHandler(){

					@Override
					public void onClick(ClickEvent event)
					{
						if(numT1==null){
							Window.alert("Choose your num1");
						}else if(numT1!=null && numT2==null){
							opChosen = true;
							mathOperator = '*';
						}else if(numT1!=null && numT2!=null){
							Window.alert("Two operations only!");
						}				
					}
				 });
			 // -
			 b12.addClickHandler(new ClickHandler(){

					@Override
					public void onClick(ClickEvent event)
					{
						if(numT1==null){
							Window.alert("Choose your num1");
						}else if(numT1!=null && numT2==null){
							opChosen = true;
							mathOperator = '-';
						}else if(numT1!=null && numT2!=null){
							Window.alert("Two operations only!");
						}
					}
				 });
			 // + 
			 b16.addClickHandler(new ClickHandler(){

					@Override
					public void onClick(ClickEvent event)
					{
						if(numT1==null){
							Window.alert("Choose your num1");
						}else if(numT1!=null && numT2==null){
							opChosen = true;
							mathOperator = '+';
						}else if(numT1!=null && numT2!=null){
//							Window.alert("Two operations only!");		
						}
					}
			 });
			  
			// %
			 b3.addClickHandler(new ClickHandler(){

					@Override
					public void onClick(ClickEvent event)
					{
						if(numT1!=null){
							calculate(numT1);
						} else if(numT2!=null){
							calculate(numT1);
						} else if(answerT!=null){
							calculate(answerT);
						}
						mathOperator = '%';
						
					}
				 });
			 
			 // = 
			 b20.addClickHandler(new ClickHandler(){
				 	@Override
				 	public void onClick(ClickEvent event)
				 	{
				 		if(numT1 == null){
				 			Window.alert("Choose your first number");
				 		}else if(numT1!=null && numT2==null){
				 			Window.alert("Choose Both numbers");
				 		}
				 		
				 		if(numT1!=null && numT2!=null){
				 			calculate(numT1, numT2);
				 		}
				 	}
			 });		 
			 //	"C" to reset value
			 b1.addClickHandler(new ClickHandler(){
				@Override
				public void onClick(ClickEvent event)
				{
					reset();
					myTextBox.setText(" ");
				}			 
			 });
		  }			
		  
//		  calculate based on operator value that received
		  private void calculate(String numT1, String numT2){
			  
//			  double num1=0.0, num2=0.0;		 //set here like this or set at upper
			   num1 = Double.parseDouble(numT1); //convert String numT1 to Double num1 for calculation 
		       num2 = Double.parseDouble(numT2);
		      
		       switch(mathOperator){
		       case '+':
		    	   answer = num1+num2;
		    	   break;
		       case '-':
		    	   answer = num1-num2;
		    	   break;
		       case '*':
		       	   answer = num1 * num2;
		       	   break;
		       case '/':
		       		answer = num1/num2;
		       	   break;
		       default:
		    	   break;
		       }	       
		       answerT = Double.toString(answer); // convert "Double answer" to "String answerT" 
		       myTextBox.setText(answerT);		// (*)
//		       numT1 = answerT;				//?? how to make more than 2 operators
		       
		       if(mathOperator == '/' && num2==0){
		    	   myTextBox.setText("ERROR");	// เอาไว้ข้างล่างของ (*) เพราะบรรทัดนี้จะได้ overwrite บรรทัดบน
		       }
		       reset();       
		    }	  
		  
		  public void calculate(String numT1){
			  num1 = Double.parseDouble(numT1); // แปลง String เป็น number
			  answer = num1/100;				// คำนวน number 
			  
			  answerT = Double.toString(answer);// แปลง number กลับเป็น String
			  myTextBox.setText(answerT);
			  reset();
		  }
		  
		  public void reset(){
			  numT1 = null;
			  numT2 = null;
			  answerT = null;
//			  answer = 0;
			  mathOperator=' ';
			  equalsClicked = false;
			  opChosen = false;  
		  }
		  
		
		  
}
					


package com.hospital.server;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
//import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

import com.hospital.server.*;

import io.quickchart.QuickChart;

import javax.mail.internet.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.hospital.rmiinterface.RMIInterface;



public class QueServerImplementation extends UnicastRemoteObject implements RMIInterface{
	
	Connection connection =null;
	Statement st =null;	
	PreparedStatement pst;
	public QueServerImplementation() throws RemoteException{
		// TODO Auto-generated constructor stub
		super();
		try {
			System.out.print("C ");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/questionnaire", "root", "");
			System.out.print("Connected database ");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
	}
	

	@Override
	public String que1(String q1) throws RemoteException{
		
		String question1= q1;
		
		int q1ans1=0;
		int q1ans2=0;
		int q1ans3=0;
		int q1ans4=0;
		int q1ans5=0;

		
			if (question1.equals("Very satisfied")) {
				q1ans1=1;
				
			} else if (question1.equals("Satisfied")) {
				q1ans2=1;
			} else if (question1.equals("Neutral")) {
				q1ans3=1;
			} else if (question1.equals("Unsatisfied")) {
				q1ans4=1;
			} else if (question1.equals("Very unsatisfied")) {
				q1ans5=1;
			} 
			
			
			addcount(1,q1ans1, q1ans2, q1ans3, q1ans4,  q1ans5);

			return  "Very satisfied : "+ q1ans1 +"\n" +"Satisfied : " + q1ans2 + "\n" + "Neutral : " + q1ans3
					+"\n" + "Unsatisfied: " + q1ans4 + "\n" + "Very unsatisfied : " + q1ans5;

	}
	
	
//question 2	

	
	public String que2(String q2) throws RemoteException{
		
		String question2= q2;
		int q2ans1=0;
		int q2ans2=0;
		int q2ans3=0;
		int q2ans4=0;
		int q2ans5=0;
		
		
			if (question2.equals("Very satisfied")) {
				q2ans1=1;
			} else if (question2.equals("Satisfied")) {
				q2ans2=1;
			} else if (question2.equals("Neutral")) {
				q2ans3=1;
			} else if (question2.equals("Unsatisfied")) {
				q2ans4=1;
			} else if (question2.equals("Very unsatisfied")) {
				q2ans5=1;
			} 
		
			
			addcount(2,q2ans1, q2ans2, q2ans3, q2ans4,  q2ans5);
			
		return "Very satisfied : "+ q2ans1 +"\n" +"Satisfied : " + q2ans2 + "\n" + "Neutral : " + q2ans3
				+"\n" + "Unsatisfied: " + q2ans4 + "\n" + "Very unsatisfied : " + q2ans5;
	}
	
//	question 3
	
	public String que3(String q3) throws RemoteException{
		
		String question3= q3;
		int q3ans1=0;
		int q3ans2=0;
		int q3ans3=0;
		int q3ans4=0;
		int q3ans5=0;
		
		
			if (question3.equals("Very satisfied")) {
				q3ans1=1;
			} else if (question3.equals("Satisfied")) {
				q3ans2=1;
			} else if (question3.equals("Neutral")) {
				q3ans3=1;
			} else if (question3.equals("Unsatisfied")) {
				q3ans4=1;
			} else if (question3.equals("Very unsatisfied")) {
				q3ans5=1;
			} 
		
			addcount(3,q3ans1, q3ans2, q3ans3, q3ans4,  q3ans5);
			
			
		return "Very satisfied : "+ q3ans1 +"\n" +"Satisfied : " + q3ans2 + "\n" + "Neutral : " + q3ans3
				+"\n" + "Unsatisfied: " + q3ans4 + "\n" + "Very unsatisfied : " + q3ans5;
	}
	
//	question 4
	
	public String que4(String q4) throws RemoteException{
		
		String question4= q4;
		
		int q4ans1=0;
		int q4ans2=0;
		int q4ans3=0;
		int q4ans4=0;
		int q4ans5=0;
		
			if (question4.equals("Very satisfied")) {
				q4ans1=1;
			} else if (question4.equals("Satisfied")) {
				q4ans2=1;
			} else if (question4.equals("Neutral")) {
				q4ans3=1;
			} else if (question4.equals("Unsatisfied")) {
				q4ans4=1;
			} else if (question4.equals("Very unsatisfied")) {
				q4ans5=1;
			} 
			
			addcount(4,q4ans1, q4ans2, q4ans3, q4ans4,  q4ans5);
		
		return "Very satisfied : "+ q4ans1 +"\n" +"Satisfied : " + q4ans2 + "\n" + "Neutral : " + q4ans3
				+"\n" + "Unsatisfied: " + q4ans4 + "\n" + "Very unsatisfied : " + q4ans5;
	}
	
	
//	question 5

	public String que5(String q5) throws RemoteException{
		
		String question5= q5;
		
		int q5ans1=0;
		int q5ans2=0;
		int q5ans3=0;
		int q5ans4=0;
		int q5ans5=0;
		
			if (question5.equals("Very satisfied")) {
				q5ans1=1;
			} else if (question5.equals("Satisfied")) {
				q5ans2=1;
			} else if (question5.equals("Neutral")) {
				q5ans3=1;
			} else if (question5.equals("Unsatisfied")) {
				q5ans4=1;
			} else if (question5.equals("Very unsatisfied")) {
				q5ans5=1;
			} 
			
			addcount(5,q5ans1, q5ans2, q5ans3, q5ans4,  q5ans5);	
		
		return "Very satisfied : "+ q5ans1 +"\n" +"Satisfied : " + q5ans2 + "\n" + "Neutral : " + q5ans3
				+"\n" + "Unsatisfied: " + q5ans4 + "\n" + "Very unsatisfied : " + q5ans5;
	}
	
//	question 6

	
	public String que6(String q6) throws RemoteException{
		
		String question6= q6;
		
		int q6ans1=0;
		int q6ans2=0;
		int q6ans3=0;
		int q6ans4=0;
		int q6ans5=0;
		
			if (question6.equals("Very satisfied")) {
				q6ans1=1;
			} else if (question6.equals("Satisfied")) {
				q6ans2=1;
			} else if (question6.equals("Neutral")) {
				q6ans3=1;
			} else if (question6.equals("Unsatisfied")) {
				q6ans4=1;
			} else if (question6.equals("Very unsatisfied")) {
				q6ans5=1;
			} 
			
			addcount(6,q6ans1, q6ans2, q6ans3, q6ans4,  q6ans5);

		
		return "Very satisfied : "+ q6ans1 +"\n" +"Satisfied : " + q6ans2 + "\n" + "Neutral : " + q6ans3
				+"\n" + "Unsatisfied: " + q6ans4 + "\n" + "Very unsatisfied : " + q6ans5;
	}
	
//	question 7

	public String que7(String q7) throws RemoteException{
		
		String question7= q7;
		
		int q7ans1=0;
		int q7ans2=0;
		
			if (question7.equals("Yes")) {
				q7ans1=1;
			} else if (question7.equals("No")) {
				q7ans2=1;
			}
			
			addcount(7,q7ans1, 0, 0, 0,  q7ans2);
		
		return "Yes : "+ q7ans1 +"\n" +"No : " + q7ans2 ;
	
	}
	
//	question 8
	
	public String que8(String q8) throws RemoteException{

		String question8= q8;
		
		int q8ans1=0;
		int q8ans2=0;
		
			if (question8.equals("Yes")) {
				q8ans1=1;
			} else if (question8.equals("No")) {
				q8ans2=1;			
			}
			
			addcount(8,q8ans1, 0, 0, 0,  q8ans2);
			
		return "Yes : "+ q8ans1 +"\n" +"No : " + q8ans2 ;

	}
	
//store count in database
	public String addcount(int no, int que1, int que2,int que3,int que4,int que5) throws RemoteException{

		ResultSet rs;
		String sql = "INSERT INTO"
				+ " `analytic`(`queID`, `Ans1Count`, `Ans2Count`, `Ans3Count`, `Ans4Count`, `Ans5Count`) "
				+ "VALUES (?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			 pst.setInt(1, no);
			 pst.setInt(2,  que1);
			 pst.setInt(3,  que2);
			 pst.setInt(4,  que3);
			 pst.setInt(5,  que4);
			 pst.setInt(6,  que5);
			
			pst.execute();
			 		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 return "error";
	}
	
	//Edit question label
	
	public String que8SQL(int no) throws RemoteException{

		ResultSet rs;
		String sql = "SELECT `que` FROM `question` WHERE `queID`='"+no+"' ";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			 rs = pst.executeQuery();
			 
			 if(rs.next()) {
					
					return rs.getString("que");
				}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 return "error";
	}
	
	//login
	public boolean login(String userName, String pw) throws RemoteException{
		boolean ans= false;
		String sql = "SELECT * FROM `login` WHERE `userName`= '"+userName+"' AND  `pw`= '"+pw+"' ";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
				if(rs.getString("pw").equalsIgnoreCase(pw)) {
					ans=true;
				}else {
					ans=false;
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		return ans;
	}
	
	//update question
	public void UpdateQue( int queID, String que) throws RemoteException {
		try {
			st = connection.createStatement();
			String sql = "UPDATE "
					+ "`question` SET `que`= '"+que+"' WHERE `queID`= '"+queID+"'   ";		
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RemoteException("Update failed.", e);
		}
	}
	
	//Email
	public String Email(int questionID) throws RemoteException{

		final String from = "ssgdummy1@gmail.com";
		final String pw = "ssg123sg";
		String subject ="Feedback";
		String msg= "hi";
		String To = "azddummy@gmail.com";

		Properties props = new Properties();
	  
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		Session session = Session.getInstance(props,new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(from,pw);
			}
		});

		try{
			Message message = new MimeMessage(session);


            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));    
            message.setSubject(subject);
            
            //mail with 2 parts, body and image
            MimeMultipart multipart = new MimeMultipart("related");
            
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H2>FeedBack</H2><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            //add it
            multipart.addBodyPart(messageBodyPart);
            //image
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource("C:\\Users\\94712\\eclipse-workspace\\Hospital1Client\\BarChart.jpeg");
            
            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");
        
         // add image to the multipart
           
            multipart.addBodyPart(messageBodyPart);

            message.setText(graph(questionID));

            System.out.println("a8");
            Transport.send(message);
         
            System.out.println("message sent successfully....");
            
		}catch(MessagingException e){
			throw new RuntimeException(e);
		}
		return "email send successfully.." ;
	
}
	
	public int pst(String query) {
		try {
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				return rs.getInt("ans");	
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	//show bar chart (dashboard)
	public int[] BarChart(int no) throws Exception{

		String question1Count = "SELECT COUNT(`Ans1Count`) AS ans FROM `analytic` WHERE `queID`= '"+no+"' AND `Ans1Count` != 0" ;
		String question2Count = "SELECT COUNT(`Ans2Count`) AS ans FROM `analytic` WHERE `queID`='"+no+"' AND `Ans2Count` != 0" ;
		String question3Count = "SELECT COUNT(`Ans3Count`) AS ans FROM `analytic` WHERE `queID`='"+no+"' AND `Ans3Count` != 0" ;
		String question4Count = "SELECT COUNT(`Ans4Count`) AS ans FROM `analytic` WHERE `queID`='"+no+"' AND `Ans4Count` != 0" ;
		String question5Count = "SELECT COUNT(`Ans5Count`) AS ans FROM `analytic` WHERE `queID`='"+no+"' AND `Ans5Count` != 0" ;
		
		int[] array = new int[5];
		array[0] = pst(question1Count);
		array[1] = pst(question2Count);
		array[2] = pst(question3Count);
		array[3] = pst(question4Count);
		array[4] = pst(question5Count);
		
		return array;
	}
	
	//Quick chart -API(Email)
	public String graph(int no) {
		
		int[] values;
		try {
			values = BarChart(no);
		
		String dataString = "" + values[0] +  ", " +values[1]+ "," + values[2] +  ", " +values[3] + ", "+values[4];
		QuickChart chart = new QuickChart();
		chart.setWidth(500);
		chart.setHeight(300);
		chart.setConfig("{"
		    + "    type: 'bar',"
		    + "    data: {"
		    + "        labels: ['Very satisfied','Satisfied','Neutral','Unsatisfied', 'Very unsatisfied'],"
		    + "        datasets: [{"
		    + "            label: 'question "+ no + "',"
		    + "            data: ["+ dataString  +"]"
		    + "        }]"
		    + "    }"
		    + "}"
		);
		
		String url = chart.getUrl(); 
		System.out.println(chart.getUrl());

		return url;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "null";
	}
	

}
	



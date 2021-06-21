package application;

import java.awt.Container;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;


 
public class Main extends Application {
    
	Stage MainStage;
	Scene pageone, pagetwo, popup;
	int month;
	int day;
	int year;
	Label timetime;
	Timeline time;
	boolean x = false;

	
	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	MainStage =primaryStage; 
    	
    	//----------- page one 
    	MainStage.setTitle("Go to Titan!");	
        Button start = new Button("Start");
        start.setOnAction(e -> MainStage.setScene(popup)); 
        start.setStyle("-fx-background-color: empty; -fx-font-size: 3em;-fx-text-fill: Azure; -fx-font-family:Papyrus; -fx-font-size: 100; ");
        
        Button quit = new Button();
        quit.setText("Quit");
        quit.setStyle("-fx-background-color: empty; -fx-font-size: 2em;-fx-text-fill: brown;-fx-font-family:Papyrus; -fx-font-size: 50; ");
        quit.setPadding(new Insets(0,70,50,0));
        quit.setOnAction(e -> Platform.exit());
     
        ButtonBar bar = new ButtonBar();
        bar.getButtons().addAll(quit);
        
        BorderPane firstPage = new BorderPane();
        firstPage.setBottom(bar);
        
        String bgHome = "File:OYLpduR.jpg";
    	ImagePane bgH = new ImagePane(bgHome, "-fx-background-size: cover; -fx-background-repeat: no-repeat;");
  
        StackPane Spageone = new StackPane(); 
    	Spageone.getChildren().addAll(bgH,firstPage, start);
    	
        pageone = new Scene(Spageone);
  
        //------------- popup
        Label Longtitude1 = new Label("Longtitude:     ");
        Label Latitude1 = new Label("Latitude:    ");
        Label XVelocity1 = new Label("X - Velocity:    ");
        Label YVelocity1 = new Label("Y - Velocity:    ");
        Label ZVelocity1 = new Label("Z - Velocity:    ");
        Label Δt = new Label("Δt (seconds):    ");
        Longtitude1.setTranslateX(-450);
        Longtitude1.setTranslateY(-200);
        Latitude1.setTranslateX(-462);
        Latitude1.setTranslateY(-150);
        XVelocity1.setTranslateX(-450);
        XVelocity1.setTranslateY(-100);
        YVelocity1.setTranslateX(-450);
        YVelocity1.setTranslateY(-50);
        ZVelocity1.setTranslateX(-450);
        ZVelocity1.setTranslateY(0);
        Δt.setTranslateX(-448);
        Δt.setTranslateY(50);

        Label year1 = new Label("Year");
        Label months1 = new Label("Months");
        Label Days1 = new Label("Days");
        Label Hours = new Label("Hours");
        Label minuets = new Label("Minuets");
        Label seconds = new Label("Seconds");
        Longtitude1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16; -fx-font-weight: bold");
        Latitude1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        XVelocity1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        YVelocity1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        ZVelocity1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        Δt.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        year1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        months1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        Days1.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        Hours.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        minuets.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        seconds.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 16;-fx-font-weight: bold");
        
        year1.setTranslateX(-450);
        year1.setTranslateY(-300);
        months1.setTranslateX(-300);
        months1.setTranslateY(-300);  
        Days1.setTranslateX(-150);
        Days1.setTranslateY(-300);
        Hours.setTranslateX(-0);
        Hours.setTranslateY(-300);
        minuets.setTranslateX(150);
        minuets.setTranslateY(-300);
        seconds.setTranslateX(300);
        seconds.setTranslateY(-300);
        
        TextField Longtitude12 = new TextField();        
        TextField Latitude12 = new TextField();
        TextField XVelocity12 = new TextField();
        TextField YVelocity12 = new TextField();
        TextField ZVelocity12 = new TextField();
        TextField Δt2 = new TextField("1.0");
        Longtitude12.setMaxWidth(100);
        Latitude12.setMaxWidth(100);
        XVelocity12.setMaxWidth(100);
        YVelocity12.setMaxWidth(100);
        ZVelocity12.setMaxWidth(100);
        Δt2.setMaxWidth(100);
        
        Longtitude12.setTranslateX(-250);
        Longtitude12.setTranslateY(-200);
        Latitude12.setTranslateX(-250);
        Latitude12.setTranslateY(-150);
        XVelocity12.setTranslateX(-250);
        XVelocity12.setTranslateY(-100);
        YVelocity12.setTranslateX(-250);
        YVelocity12.setTranslateY(-50);
        ZVelocity12.setTranslateX(-250);
        ZVelocity12.setTranslateY(0);
        Δt2.setTranslateX(-250);
        Δt2.setTranslateY(50);
        
        TextField year12 = new TextField("1");
        TextField months12 = new TextField("6");
        TextField Days12 = new TextField("0");
        TextField Hours2 = new TextField("0");
        TextField minuets2 = new TextField("0");
        TextField seconds2 = new TextField("0");
        year12.setMaxWidth(50);
        months12.setMaxWidth(50);
        Days12.setMaxWidth(50);
        Hours2.setMaxWidth(50);
        minuets2.setMaxWidth(50);
        seconds2.setMaxWidth(50);
        
        year12.setTranslateX(-450);
        year12.setTranslateY(-270);
        months12.setTranslateX(-300);
        months12.setTranslateY(-270);
        Days12.setTranslateX(-150);
        Days12.setTranslateY(-270);
        Hours2.setTranslateX(-0);
        Hours2.setTranslateY(-270);
        minuets2.setTranslateX(150);
        minuets2.setTranslateY(-270);
        seconds2.setTranslateX(300);
        seconds2.setTranslateY(-270);

        Button simulatesystem = new Button("Simulate System");
        simulatesystem.setOnAction(e -> MainStage.setScene(pagetwo)); 

        Button back = new Button("Back");
        back.setOnAction(e -> MainStage.setScene(pageone)); 
        simulatesystem.setStyle("-fx-font-size:20");
        back.setStyle("-fx-font-size:20;");
        
        ButtonBar yo = new ButtonBar();
        yo.getButtons().addAll(simulatesystem,back );
        yo.setPadding(new Insets(100,100,100,100));
            	
//    	String fuck = "File:6c2ef9f2f30e47d1e09f0803a64687e5.jpeg";
    	String fuck = "File:OYLpduR.jpg";
    	ImagePane IVfuck = new ImagePane(fuck, "-fx-background-size: cover; -fx-background-repeat: no-repeat;");

        StackPane Spopup = new StackPane(); 
       
        Spopup.getChildren().addAll(IVfuck, yo,year1,months1,Days1,Hours,minuets,seconds,Longtitude1,Latitude1,XVelocity1,YVelocity1,ZVelocity1,Δt ,year12,months12,Days12, Hours2,minuets2,seconds2,Longtitude12,Latitude12,XVelocity12,YVelocity12,ZVelocity12,Δt2);

        popup = new Scene(Spopup);

        
        //----------- page two
    	
        //--------- column in the right 
        Label Longtitude = new Label() ;
        Label Latitude= new Label();
        Label XVelocity= new Label() ;
        Label YVelocity= new Label();
        Label ZVelocity = new Label();
        Longtitude.setStyle("-fx-text-fill: white; -fx-font-family:Arial; -fx-font-size: 14;");
        Latitude.setStyle("-fx-text-fill: white; -fx-font-family:Arial; -fx-font-size: 14;");
        XVelocity.setStyle("-fx-text-fill: white; -fx-font-family:Arial; -fx-font-size: 14;");
        YVelocity.setStyle("-fx-text-fill: white; -fx-font-family:Arial; -fx-font-size: 14;");
        ZVelocity.setStyle("-fx-text-fill: white; -fx-font-family:Arial; -fx-font-size: 14;");
        Longtitude.setPrefHeight(40);
        Latitude.setPrefHeight(40);
        XVelocity.setPrefHeight(40);
        YVelocity.setPrefHeight(40);
        ZVelocity.setPrefHeight(40);
        
        simulatesystem.setOnAction(new EventHandler<ActionEvent>() {

 			@Override
 			public void handle(ActionEvent arg0) {
 				Longtitude.setText("Longtitude:     " + Longtitude12.getText()    );     
		        Latitude .setText("Latitude:    " +Latitude12 .getText() );  
		        XVelocity.setText("X - Velocity:    " + XVelocity12.getText());  
		        YVelocity .setText("Y - Velocity:    " + YVelocity12 .getText());  
		        ZVelocity.setText("Z - Velocity:    " +ZVelocity12.getText());  
 		        MainStage.setScene(pagetwo);	
 			}

         });
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(Longtitude,Latitude,XVelocity,YVelocity,ZVelocity);
        vbox.setPadding(new Insets(200,100,0,5));
        
        StackPane rightgroup = new StackPane();
        rightgroup.getChildren().addAll(vbox);
        rightgroup.setStyle("-fx-border-color: white");
        rightgroup.setStyle("-fx-background-color: empty;-fx-border-color: empty; ");
        rightgroup.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), Insets.EMPTY)));

        //--------- row in the bottom 
        Button start1 = new Button("Start");
        start1.setStyle("-fx-background-color: empty ;-fx-text-fill: green; -fx-border-radius: 50%; -fx-border-color: green; -fx-font-size: 20;");
        start1.setOnAction(new EventHandler<ActionEvent>() {
        	
        	@Override 
        	public void handle(ActionEvent e) {
        		if(!x) {
        			doTime();
        			x = true;
        			start1.setText("Stop");
        			start1.setStyle("-fx-background-color: empty ;-fx-text-fill: FireBrick; -fx-border-radius: 50%; -fx-border-color: FireBrick; -fx-font-size: 20;");
        		}else {
        			time.stop();
        			x = false;
        			start1.setText("Start");
        			start1.setStyle("-fx-background-color: empty ;-fx-text-fill: green; -fx-border-radius: 50%; -fx-border-color: green; -fx-font-size: 20;");
        		}
        	}
        });
        
        Button Home = new Button("Home");
        Home.setStyle("-fx-background-color: empty ; -fx-text-fill: CornflowerBlue;-fx-border-color: CornflowerBlue; -fx-border-radius: 50%; -fx-font-size: 20;");
        Home.setOnAction(new EventHandler<ActionEvent>() {
        	@Override 
        	public void handle(ActionEvent e) {
        		MainStage.setScene(pageone);
        		day=1;
        		month=4;
        		year=2020;
        		timetime.setText("Date:   1 / 4 / 2020");
        		if(start1.getText().equals("Stop")) {
        			time.stop();
        			x=false;
            		start1.setText("Start");
        			start1.setStyle("-fx-background-color: empty ;-fx-text-fill: green; -fx-border-radius: 50%; -fx-border-color: green; -fx-font-size: 20;");
        		}
        	
        	}
        });

        Button back1 = new Button("Back");
        back1.setStyle("-fx-background-color: empty ;-fx-text-fill: CornflowerBlue; -fx-border-radius: 50%; -fx-border-color: CornflowerBlue; -fx-font-size: 20;");
        back1.setOnAction(new EventHandler<ActionEvent>() {
        	@Override 
        	public void handle(ActionEvent e) {
        		MainStage.setScene(popup);
        		day=1;
        		month=4;
        		year=2020;
        		timetime.setText("Date:   1 / 4 / 2020");
        		if(start1.getText().equals("Stop")) {
        			time.stop();
        			x=false;
            		start1.setText("Start");
        			start1.setStyle("-fx-background-color: empty ;-fx-text-fill: green; -fx-border-radius: 50%; -fx-border-color: green; -fx-font-size: 20;");
        		}
        	}
        });
        
        Button restart = new Button("Restart");
        restart.setStyle("-fx-background-color: empty ;-fx-text-fill: Coral; -fx-border-radius: 50%; -fx-border-color: Coral; -fx-font-size: 20;");
        restart.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				day=1;
        		month=4;
        		year=2020;
        		timetime.setText("Date:   1 / 4 / 2020");
        		if(start1.getText().equals("Stop")) {
        			time.stop();
        			x=false;
            		start1.setText("Start");
        			start1.setStyle("-fx-background-color: empty ;-fx-text-fill: green; -fx-border-radius: 50%; -fx-border-color: green; -fx-font-size: 20;");
        		}
			}
        });
        
        ButtonBar btnbar = new ButtonBar();
        btnbar.getButtons().addAll(start1, restart, back1, Home);
        btnbar.setPadding(new Insets(10,10,10,10));
        
        timetime = new Label("Date:   1 / 4 / 2020");
        timetime.setPrefHeight(50);
        timetime.setStyle("-fx-text-fill: white;-fx-font-family:Arial; -fx-font-size: 20;");
        timetime.setPadding(new Insets(0,0,0,20));
        month =4;
        day=1;
        year = 2020;

        VBox boxbox = new VBox();  
        boxbox.getChildren().addAll(btnbar,timetime);

        StackPane leftgroup = new StackPane();
        leftgroup.getChildren().add(boxbox);
        leftgroup.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), Insets.EMPTY)));
        leftgroup.setStyle("-fx-border-color: white");
        
        String space = "File:4-space.jpg";
    	ImagePane IVspace = new ImagePane(space, "-fx-background-size: cover; -fx-background-repeat: no-repeat;");
        
        BorderPane borderpane = new BorderPane();
        borderpane.setBottom(leftgroup);
        borderpane.setRight(rightgroup); 

        StackPane Spagetwo = new StackPane();
        Spagetwo.getChildren().addAll(IVspace, borderpane );
        
        pagetwo = new Scene(Spagetwo);

        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        MainStage.setX(screenBounds.getMinX());
        MainStage.setY(screenBounds.getMinY());
        MainStage.setWidth(screenBounds.getWidth());
        MainStage.setHeight(screenBounds.getHeight());
        
        MainStage.setScene(pageone);
        MainStage.show();
    }
    public void doTime() {
    	time = new Timeline();
    	time.setCycleCount(Timeline.INDEFINITE);
    	KeyFrame frame = new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				if(year == 2021 && month == 4) {
					timetime.setText("Date:   1 / 4 / 2021");
				} else {
					if(day>29) {
						if(month > 6 )
						{
							day=0;
							month++;	
						}
						else if(day == 31) {
							day=0;
							month++;	
						}							
					}
					day++;
					if(month>12) {
						month = 1;
						year ++;
					}
					if(year == 2021 && month == 4) {
						time.stop();
					}
					timetime.setText("Date:   " + day + " / "  + month + " / " + year);
				}

			}
    		
    	});
    	time.getKeyFrames().add(frame);
    	time.playFromStart();
    	
    }
 
}

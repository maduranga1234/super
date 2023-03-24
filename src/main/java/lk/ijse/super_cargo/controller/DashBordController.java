package lk.ijse.super_cargo.controller;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class DashBordController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane AnchorpaneHome;

    @FXML
    private AnchorPane HomeAnchorpane;

    @FXML
    private JFXButton HomeBtn;

    @FXML
    private JFXButton stockBtn;

    @FXML
    private JFXButton exportBtn;

    @FXML
    private JFXButton OrdersBtn;

    @FXML
    private JFXButton SupplierBtn;

    @FXML
    private JFXButton PaymentBtn;

    @FXML
    private JFXButton EmployeeBtn;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblDate;



    @FXML
    void HomeBtnClick(ActionEvent event) throws IOException {

            Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/dashBord.fxml"));
            AnchorpaneHome.getChildren().clear();
            HomeAnchorpane.getChildren().add(load);

    }

    @FXML
    void stockBtnClick(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/buyer.fxml"));
        AnchorpaneHome.getChildren().clear();
        AnchorpaneHome.getChildren().add(load);

    }

    @FXML
    void exportBtnClick(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/export.fxml"));
        AnchorpaneHome.getChildren().clear();
        AnchorpaneHome.getChildren().add(load);

    }

    @FXML
    void OrdersBtnClick(ActionEvent event) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/orders.fxml"));
        AnchorpaneHome.getChildren().clear();
        AnchorpaneHome.getChildren().add(load);

    }

    @FXML
    void SupplierBtnClick(ActionEvent event) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/supplier.fxml"));
        AnchorpaneHome.getChildren().clear();
        AnchorpaneHome.getChildren().add(load);

    }

    @FXML
    void PaymentBtnClick(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/payment.fxml"));
        AnchorpaneHome.getChildren().clear();
        AnchorpaneHome.getChildren().add(load);
    }

    @FXML
    void EmployeeBtnClick(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk.ijse.super_cargo.view/employee.fxml"));
        AnchorpaneHome.getChildren().clear();
        AnchorpaneHome.getChildren().add(load);
    }

    private void Timenow(){
        Thread thread =new Thread(() ->{
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM,  dd, yyyy");
            while (true){
                try{
                    Thread.sleep(1000);

                }catch (Exception e){
                    System.out.println(e);
                }
                final String timenow = sdf.format(new Date());
                String timenow1 = sdf1.format(new Date());

                Platform.runLater(() ->{
                    lblTime.setText(timenow);
                    lblDate.setText(timenow1);
                });
            }
        });
        thread.start();
    }




    @FXML
    void initialize() {

       Timenow();
        assert AnchorpaneHome != null : "fx:id=\"AnchorpaneHome\" was not injected: check your FXML file 'dashBord.fxml'.";
        assert stockBtn != null : "fx:id=\"stockBtn\" was not injected: check your FXML file 'dashBord.fxml'.";



    }
}

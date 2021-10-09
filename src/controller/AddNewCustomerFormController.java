package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import lk.ijse.pos_system.model.Customer;

import java.sql.SQLException;

public class AddNewCustomerFormController {
    public JFXTextField txtID;
    public JFXTextField txtTitle;
    public JFXTextField txtName;
    public JFXTextField txtPostCode;
    public JFXTextField txtAddress;
    public JFXTextField txtCity;
    public JFXTextField txtProvince;

    public void addNewCustomerOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Customer c1=new Customer
                (txtID.getText(),txtTitle.getText(),txtName.getText(),txtAddress.getText(),
                txtCity.getText(),txtProvince.getText(),txtPostCode.getText());

        if(new lk.ijse.pos_system.controller.CustomerController().saveCustomer(c1))
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..").show();
        else
            new Alert(Alert.AlertType.WARNING, "Try Again..").show();
    }
}

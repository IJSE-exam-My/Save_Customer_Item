package controller;
/**
 * @author Sanduni Wijesinghe <nipunisandunikaw@gmail.com>
 * @since 10/9/2021
 * /


/*
 * ----------------------------------------------------------------------
 *  Copyright(c) GDSE-Gangsterss.All Right Reserved.
 *  Licenced under the Sri Lankan Information Licence.
 * -----------------------------------------------------------------------
 */

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import lk.ijse.pos_system.model.Item;

import java.sql.SQLException;

public class AddNewItemFormController {
    public JFXTextField txtCode;
    public JFXTextField txtDescription;
    public JFXTextField txtPackSize;
    public JFXTextField txtUnitPrice;
    public JFXTextField txtQtyOnHand;

    public void addOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Item t1 = new Item(
                txtCode.getText(),txtDescription.getText(),txtPackSize.getText(),
                Double.parseDouble(txtUnitPrice.getText()),Integer.parseInt(txtQtyOnHand.getText())
        );

        if(new ItemController().saveItem(t1))
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..").show();
        else
            new Alert(Alert.AlertType.WARNING, "Try Again..").show();

    }
}

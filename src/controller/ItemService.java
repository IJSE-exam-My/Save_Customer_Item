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
import lk.ijse.pos_system.model.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemService {
    public boolean saveItem(Item i) throws SQLException, ClassNotFoundException;
    public boolean updateItem(Item i) throws SQLException, ClassNotFoundException;
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException;
    public Item getItem(String id) throws SQLException, ClassNotFoundException;
    public ArrayList<Item> getAllItem() throws SQLException, ClassNotFoundException;
}

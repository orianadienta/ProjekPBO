package com.javaoop.projekbesarpbo.Main;

import com.javaoop.projekbesarpbo.controller.BarangController;
import com.javaoop.projekbesarpbo.dao.dao.BarangDAO;
import com.javaoop.projekbesarpbo.view.BarangView;

public class Main {

    public static void main(String[] args) {
        BarangDAO barangDAO = new BarangDAO();
        BarangView barangView = new BarangView();
        BarangController barangController = new BarangController(barangDAO, barangView);
        barangController.mulai();
    }
}


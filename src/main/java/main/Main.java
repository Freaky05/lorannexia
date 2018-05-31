package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

//import view.ViewFrame;
/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    private static void affiche(String message) {

        System.out.println(message);

    }



    private static void arret(String message) {

        System.err.println(message);

        System.exit(99);

    }

    public static void main(final String[] args) {



        view.ViewFrame frm = new view.ViewFrame();
    }


}

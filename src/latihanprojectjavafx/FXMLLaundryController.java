/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKO
 */
public class FXMLLaundryController implements Initializable {

    @FXML
    private TextField Nama;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Berat;
    @FXML
    private TextField Telp;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private TextField Tanggal;
    @FXML
    private TextArea Hasil;
    @FXML
    private Button buttonOke;
    @FXML
    private Button buttonHapus;
    @FXML
    private RadioButton rdCK;
    @FXML
    private RadioButton rdCKS;
    @FXML
    private RadioButton rdS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama = Nama.getText();
        String alamat = Alamat.getText();
        String berat = Berat.getText();
        String tanggal = Tanggal.getText();
        String telp = Telp.getText();
        String paket = "";
        int harga = 0;
        
        int hitung = Integer.parseInt(Berat.getText());
        
        if(rdCK.isSelected()){
            paket = "Cuci Kering";
        harga = 5000 * hitung;}
        else if(rdCKS.isSelected()){
            paket = "Cuci Kering Setrika";
        harga = 8000 * hitung;}
        else if(rdS.isSelected()){
            paket = "Setrika";
        harga = 3000 * hitung;}
        
        if(!(rdCK.isSelected() || rdCKS.isSelected() || rdS.isSelected() )){
            JOptionPane.showMessageDialog(null, "Harap pilih paket layanan");
        }
      
        
         Hasil.setText("Nama                            : "+nama+"\n"+
                       "Alamat                          : "+alamat+"\n"+
                       "Berat Cucian                   : "+berat+" Kg"+"\n"+
                       "No HP                           : "+telp+"\n"+
                       "Paket                              : "+paket+"\n"+
                       "Tanggal Pengambilan        : "+tanggal+"\n"+
                       "Total yang harus di bayar  : "+harga);
    }

    @FXML
    private void hapus(ActionEvent event) {
        Nama.setText("");
        Alamat.setText("");
        Berat.setText("");
        Telp.setText("");
        rdCK.setSelected(false);
        rdCKS.setSelected(false);
        rdS.setSelected(false);
        Tanggal.setText("");
    }
    
}

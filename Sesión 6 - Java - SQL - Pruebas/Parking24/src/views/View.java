/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ParkingController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import models.Parking;
import models.ParkingLog;

/**
 *
 * @author user
 */
public class View extends javax.swing.JFrame {
    
    private ParkingController parkingCtr = new ParkingController();
    
    private Integer freeParkingIdSelected = null;
    private Integer notFreeParkingIdSelected = null;
    private Integer parkingIdLogSelected = null;
    private ParkingLog parkingLogSelected = null;
    
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.setTitle("Parking");
        this.showPanels();
        this.startClock();
        this.getAllList();
    }
    
    private void getAllList(){
        this.fillAllParking();
        this.fillNotFreeParking();
        this.fillFreeParking();
    }
    
    private void startClock(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              clock();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }
    
    private void clock(){
        Timestamp time = new Timestamp(new Date().getTime());
        this.labelTest.setText( this.timestampToStringFormated(time) );
    }
    
    
    private void showPanels(){
        this.panelSetParking.setVisible( this.freeParkingIdSelected != null );
        this.panelNotFree.setVisible( this.notFreeParkingIdSelected != null );
        this.parkingLogList.setVisible( this.parkingIdLogSelected != null );
        this.panelDepartureInfo.setVisible( this.parkingLogSelected != null );
        this.btnCancelDeparture.setVisible( this.notFreeParkingIdSelected != null );
        this.btnDeparture.setVisible( this.notFreeParkingIdSelected != null );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        freeParkingList = new javax.swing.JList<>();
        panelSetParking = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputPlaca = new javax.swing.JTextField();
        btnAsignarParking = new javax.swing.JButton();
        btnFreeParkingCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notFreeParkingList = new javax.swing.JList<>();
        panelNotFree = new javax.swing.JPanel();
        labelPlaca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelArrived = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelCode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelDeparture = new javax.swing.JButton();
        btnDeparture = new javax.swing.JButton();
        panelDepartureInfo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelMinutes = new javax.swing.JLabel();
        labelDeparture = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allParkingList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        parkingLogList = new javax.swing.JList<>();
        labelTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Parking");

        freeParkingList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        freeParkingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                freeParkingListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(freeParkingList);

        jLabel2.setText("Placa: ");

        btnAsignarParking.setText("Asignar");
        btnAsignarParking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarParkingActionPerformed(evt);
            }
        });

        btnFreeParkingCancel.setText("Cancelar");
        btnFreeParkingCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreeParkingCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSetParkingLayout = new javax.swing.GroupLayout(panelSetParking);
        panelSetParking.setLayout(panelSetParkingLayout);
        panelSetParkingLayout.setHorizontalGroup(
            panelSetParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSetParkingLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelSetParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSetParkingLayout.createSequentialGroup()
                        .addComponent(btnFreeParkingCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAsignarParking))
                    .addGroup(panelSetParkingLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelSetParkingLayout.setVerticalGroup(
            panelSetParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSetParkingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSetParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSetParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignarParking)
                    .addComponent(btnFreeParkingCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelSetParking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSetParking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Entrada", jPanel1);

        notFreeParkingList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        notFreeParkingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notFreeParkingListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(notFreeParkingList);

        labelPlaca.setText("placa");

        jLabel3.setText("Llegada: ");

        labelArrived.setText("llegada");

        jLabel4.setText("Placa:");

        labelCode.setText("Código");

        jLabel5.setText("Parking:");

        javax.swing.GroupLayout panelNotFreeLayout = new javax.swing.GroupLayout(panelNotFree);
        panelNotFree.setLayout(panelNotFreeLayout);
        panelNotFreeLayout.setHorizontalGroup(
            panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotFreeLayout.createSequentialGroup()
                .addGroup(panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNotFreeLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlaca)
                            .addComponent(labelArrived)))
                    .addGroup(panelNotFreeLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(labelCode)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelNotFreeLayout.setVerticalGroup(
            panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotFreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCode)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelArrived))
                .addGap(18, 18, 18)
                .addGroup(panelNotFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelPlaca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelDeparture.setText("Cancelar");
        btnCancelDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDepartureActionPerformed(evt);
            }
        });

        btnDeparture.setText("Marcar Salida");
        btnDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartureActionPerformed(evt);
            }
        });

        jLabel6.setText("Salida:");

        jLabel7.setText("Tiempo:");

        labelMinutes.setText("llegada");

        labelDeparture.setText("llegada");

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDepartureInfoLayout = new javax.swing.GroupLayout(panelDepartureInfo);
        panelDepartureInfo.setLayout(panelDepartureInfoLayout);
        panelDepartureInfoLayout.setHorizontalGroup(
            panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepartureInfoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(51, 51, 51)
                .addGroup(panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir)
                    .addGroup(panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelDeparture)
                        .addComponent(labelMinutes)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panelDepartureInfoLayout.setVerticalGroup(
            panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepartureInfoLayout.createSequentialGroup()
                .addGroup(panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelDeparture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDepartureInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelMinutes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnImprimir))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnCancelDeparture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeparture))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDepartureInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelNotFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelNotFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDepartureInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelDeparture)
                            .addComponent(btnDeparture))
                        .addGap(20, 20, 20))))
        );

        jTabbedPane1.addTab("Salida", jPanel2);

        allParkingList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        allParkingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allParkingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allParkingList);

        parkingLogList.setFocusable(false);
        jScrollPane4.setViewportView(parkingLogList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTest)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelTest))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarParkingActionPerformed
        try {
            this.parkingCtr.setArrivedToParking(this.freeParkingIdSelected.intValue(), this.inputPlaca.getText() );
            this.freeParkingIdSelected = null;
            this.inputPlaca.setText("");
            this.showPanels();
            this.getAllList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() );
        }
    }//GEN-LAST:event_btnAsignarParkingActionPerformed

    private void freeParkingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freeParkingListMouseClicked
        JList target = (JList) evt.getSource();
        int index = target.locationToIndex( evt.getPoint() );
        String model = this.freeParkingList.getModel().getElementAt(index);
        this.freeParkingIdSelected = new Integer(model.substring(0, model.indexOf(".")));
        this.showPanels();
    }//GEN-LAST:event_freeParkingListMouseClicked

    private void notFreeParkingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notFreeParkingListMouseClicked
        try {
            JList target = (JList) evt.getSource();
            int index = target.locationToIndex( evt.getPoint() );
            String model = this.notFreeParkingList.getModel().getElementAt(index);
            this.notFreeParkingIdSelected = new Integer(model.substring(0, model.indexOf(".")));
            
            Parking par = (Parking) new Parking().get( this.notFreeParkingIdSelected );
            this.labelCode.setText( par.getCode() );
            this.labelArrived.setText( this.timestampToStringFormated(par.getArrived()) );
            this.labelPlaca.setText( par.getCarNumber() );
            this.showPanels();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_notFreeParkingListMouseClicked

    private void allParkingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allParkingListMouseClicked
        JList target = (JList) evt.getSource();
        int index = target.locationToIndex( evt.getPoint() );
        String model = this.allParkingList.getModel().getElementAt(index);
        this.parkingIdLogSelected = new Integer(model.substring(0, model.indexOf(".")));
        this.fillParkingLogList();
        this.showPanels();
    }//GEN-LAST:event_allParkingListMouseClicked
    
    
    
    
    private void btnFreeParkingCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreeParkingCancelActionPerformed
        this.freeParkingIdSelected = null;
        this.showPanels();
    }//GEN-LAST:event_btnFreeParkingCancelActionPerformed

    private void btnCancelDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDepartureActionPerformed
        this.getAllList();
        this.notFreeParkingIdSelected = null;
        this.parkingLogSelected = null;
        this.showPanels();
    }//GEN-LAST:event_btnCancelDepartureActionPerformed

    private void btnDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartureActionPerformed
        try {
            this.parkingCtr.setDepartureToParking( this.notFreeParkingIdSelected );
            this.parkingLogSelected = parkingCtr.getParkingLogByParkingId(this.notFreeParkingIdSelected);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        
        this.labelCode.setText( this.parkingLogSelected.getCode() );
        this.labelArrived.setText( this.timestampToStringFormated(this.parkingLogSelected.getArrived()) );
        this.labelPlaca.setText( this.parkingLogSelected.getCarNumber() );
        this.labelDeparture.setText( this.timestampToStringFormated(this.parkingLogSelected.getDeparture()) );
        this.labelMinutes.setText( this.parkingLogSelected.getMinutes().toString() );
        this.showPanels();
    }//GEN-LAST:event_btnDepartureActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        System.out.println("\n\n\n");
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println("         RECIBO DE PAGO                    ");
        System.out.println("\n");
        System.out.println("  Parking: " + this.parkingLogSelected.getCode() );
        System.out.println("  Placa: " + this.parkingLogSelected.getCarNumber() );
        System.out.println("  Llegada: " + this.parkingLogSelected.getArrived() );
        System.out.println("  Salida: " + this.parkingLogSelected.getDeparture() );
        System.out.println("");
        System.out.println("  Minutos: " + this.parkingLogSelected.getMinutes() );
        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("*******************************************");
    }//GEN-LAST:event_btnImprimirActionPerformed
    
    private void fillFreeParking(){
        List<Parking> parkingList = parkingCtr.getParkingListFree();
        DefaultListModel model = new DefaultListModel();
        
        int count = 0;
        for(Parking par : parkingList){
            model.add(count, par.getId() + ". " + par.getCode() );
            count++;
        }
        
        this.freeParkingList.setModel( model );
    }
    
    private void fillNotFreeParking(){
        List<Parking> parkingList = parkingCtr.getParkingListNotFree();
        DefaultListModel model = new DefaultListModel();
        
        int count = 0;
        for(Parking par : parkingList){
            model.add(count, par.getId() + ". " + par.getCode() );
            count++;
        }
        
        this.notFreeParkingList.setModel( model );
    }
    
    private void fillAllParking(){
        List<Parking> parkingList = parkingCtr.getAllParkingList();
        DefaultListModel model = new DefaultListModel();
        
        int count = 0;
        for(Parking par : parkingList){
            model.add(count, par.getId() + ". " +par.getCode() );
            count++;
        }
        
        this.allParkingList.setModel( model );
    }
    
    private void fillParkingLogList(){
        List<ParkingLog> parLogList = null;
        try{
            parLogList = parkingCtr.getParkingLogList(this.parkingIdLogSelected);
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        DefaultListModel model = new DefaultListModel();
        
        int count = 0;
        for(ParkingLog par : parLogList){
            String aux = par.getCode() + " - ";
            aux += this.timestampToStringFormated(par.getArrived()) + " - ";
            aux += par.getMinutes();
            model.add(count, aux);
            count++;
        }
        
        this.parkingLogList.setModel( model );
    }
    
    
    private String timestampToStringFormated(Timestamp time){
        Date date = new Date();
        date.setTime(time.getTime());
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        return formattedDate;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> allParkingList;
    private javax.swing.JButton btnAsignarParking;
    private javax.swing.JButton btnCancelDeparture;
    private javax.swing.JButton btnDeparture;
    private javax.swing.JButton btnFreeParkingCancel;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JList<String> freeParkingList;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelArrived;
    private javax.swing.JLabel labelCode;
    private javax.swing.JLabel labelDeparture;
    private javax.swing.JLabel labelMinutes;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelTest;
    private javax.swing.JList<String> notFreeParkingList;
    private javax.swing.JPanel panelDepartureInfo;
    private javax.swing.JPanel panelNotFree;
    private javax.swing.JPanel panelSetParking;
    private javax.swing.JList<String> parkingLogList;
    // End of variables declaration//GEN-END:variables
}

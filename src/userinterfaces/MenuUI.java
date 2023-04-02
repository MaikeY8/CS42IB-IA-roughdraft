
/** Required package class namespace */
package userinterfaces;

/** Required imports */
import controllers.MenuController;

/**
 * MenuUI.java - the user interface view that appears and acts like a menu for 
 * the user to select which main user interface that they would like to open
 * 
 * @author mikex
 */
public class MenuUI extends javax.swing.JFrame {
    
    // Connection to an encapsulated controller for this user interface
    private MenuController controller;

    /**
     * Creates new form MenuUI and sets the properties of the frame
     */
    public MenuUI() {
        initComponents();
        setFrame();
        controller = new MenuController(this);
    }
    
    /**
     * Sets the visual properties of the JFrame
     */
    private void setFrame() {
        // Sets the title of the window
        setTitle("Restaurant");
        // Sets the size of the window
        setSize(270, 260);
        // Sets the location to show up in the middle (null) 
        this.setLocationRelativeTo(null);
        // Sets the frame to be visible
        setVisible(true);
        // Sets the frame resizable property to false
        setResizable(false);
        // Sets to dispose on close
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogout = new javax.swing.JButton();
        jButtonOrder = new javax.swing.JButton();
        jButtonReceipts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogout.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 60));

        jButtonOrder.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButtonOrder.setText("Order");
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 60));

        jButtonReceipts.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButtonReceipts.setText("Receipts");
        jButtonReceipts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiptsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReceipts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        controller.logout();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderActionPerformed
        controller.order();
    }//GEN-LAST:event_jButtonOrderActionPerformed

    private void jButtonReceiptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiptsActionPerformed
        controller.receipt();
    }//GEN-LAST:event_jButtonReceiptsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controller.closing();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonOrder;
    private javax.swing.JButton jButtonReceipts;
    // End of variables declaration//GEN-END:variables
}

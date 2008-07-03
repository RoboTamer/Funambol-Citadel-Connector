/*
 * CitadelSourceAdmin.java
 *
 * Created on May 9, 2008, 10:45 PM
 * Funambol Citadel Connector
 * (C) 2007-2008 Mathew McBride
 * http://bionicmessage.net
 * 
 * Portions of code may come from: 
 * Funambol is a mobile platform developed by Funambol, Inc.
 * Copyright (C) 2003 - 2007 Funambol, Inc.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY FUNAMBOL, FUNAMBOL DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT  OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Funambol, Inc. headquarters at 643 Bair Island Road, Suite
 * 305, Redwood City, CA 94063, USA, or at email address info@funambol.com.
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * "Powered by Funambol" logo. If the display of the logo is not reasonably
 * feasible for technical reasons, the Appropriate Legal Notices must display
 * the words "Powered by Funambol".
 */
package net.bionicmessage.funambol.citadel.admin;

import com.funambol.admin.ui.SourceManagementPanel;
import com.funambol.framework.engine.source.ContentType;
import com.funambol.framework.engine.source.SyncSourceInfo;
import java.awt.event.ActionEvent;
import net.bionicmessage.funambol.citadel.sync.CitadelSyncSource;
import net.bionicmessage.funambol.citadel.store.CtdlFnblConstants;
import java.util.Properties;

/**
 *
 * @author  matt
 */
public class CitadelSourceAdmin extends SourceManagementPanel {

    protected CitadelSyncSource citadelSyncSource = null;
    protected Properties syncSourceProps = null;

    /** Creates new form CitadelSourceAdmin */
    public CitadelSourceAdmin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formTitle_Label = new javax.swing.JLabel();
        syncML_ID_Name = new javax.swing.JLabel();
        syncML_ID = new javax.swing.JTextField();
        ctdlServer_Label = new javax.swing.JLabel();
        ctdlServer = new javax.swing.JFormattedTextField();
        mailLabel = new javax.swing.JLabel();
        mailRoomName = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        serverPort = new javax.swing.JTextField();
        storeLocLabel = new javax.swing.JLabel();
        storeLoc = new javax.swing.JTextField();

        setLayout(null);

        formTitle_Label.setFont(formTitle_Label.getFont().deriveFont(formTitle_Label.getFont().getStyle() | java.awt.Font.BOLD, formTitle_Label.getFont().getSize()+6));
        formTitle_Label.setText("Citadel Mail Sync Source");
        add(formTitle_Label);
        formTitle_Label.setBounds(10, 10, 236, 23);

        syncML_ID_Name.setText("SyncML Name");
        add(syncML_ID_Name);
        syncML_ID_Name.setBounds(10, 45, 87, 16);

        syncML_ID.setText("mail");
        syncML_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncML_IDActionPerformed(evt);
            }
        });
        add(syncML_ID);
        syncML_ID.setBounds(120, 40, 120, 28);

        ctdlServer_Label.setText("Citadel server");
        add(ctdlServer_Label);
        ctdlServer_Label.setBounds(10, 75, 86, 16);

        ctdlServer.setText("localhost");
        add(ctdlServer);
        ctdlServer.setBounds(120, 70, 120, 28);

        mailLabel.setText("Mail room name");
        add(mailLabel);
        mailLabel.setBounds(10, 105, 101, 16);

        mailRoomName.setText("Mail");
        add(mailRoomName);
        mailRoomName.setBounds(120, 100, 120, 28);

        saveButton.setText("Save settings");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(90, 260, 140, 29);

        jLabel1.setText(":");
        add(jLabel1);
        jLabel1.setBounds(250, 80, 10, 16);

        serverPort.setText("504");
        add(serverPort);
        serverPort.setBounds(260, 70, 60, 28);

        storeLocLabel.setText("Store location");
        add(storeLocLabel);
        storeLocLabel.setBounds(10, 160, 100, 16);

        storeLoc.setText("/opt/Funambol/stores/mail");
        add(storeLoc);
        storeLoc.setBounds(120, 160, 270, 28);
    }// </editor-fold>//GEN-END:initComponents

private void syncML_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncML_IDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_syncML_IDActionPerformed

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if (syncSourceProps == null) {
        syncSourceProps = new Properties();
        
    }
    syncSourceProps.setProperty(CtdlFnblConstants.SERVER_HOST, ctdlServer.getText());
    syncSourceProps.setProperty(CtdlFnblConstants.SERVER_PORT, serverPort.getText());
    syncSourceProps.setProperty(CtdlFnblConstants.ROOM_MAIL, mailRoomName.getText());
    syncSourceProps.setProperty(CtdlFnblConstants.STORE_LOC, storeLoc.getText());
     SyncSourceInfo ssInfo = new SyncSourceInfo();
        ContentType[] ctypes = new ContentType[]{
            new ContentType("application/vnd.omads-email+xml", "1.2"),
            new ContentType("application/vnd.omads-folder+xml", "1.2")
        };
        ssInfo.setSupportedTypes(ctypes);
    citadelSyncSource.setInfo(ssInfo);
    citadelSyncSource.setSyncSourceProperties(syncSourceProps);
    if (getState() == STATE_INSERT) {
        citadelSyncSource.setSourceURI(syncML_ID.getText());
        citadelSyncSource.setName(syncML_ID.getText());
        this.actionPerformed(new ActionEvent(this, ACTION_EVENT_INSERT, evt.getActionCommand()));
    } else {
        this.actionPerformed(new ActionEvent(this, ACTION_EVENT_UPDATE, evt.getActionCommand()));
    }
}//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ctdlServer;
    private javax.swing.JLabel ctdlServer_Label;
    private javax.swing.JLabel formTitle_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailRoomName;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField serverPort;
    private javax.swing.JTextField storeLoc;
    private javax.swing.JLabel storeLocLabel;
    private javax.swing.JTextField syncML_ID;
    private javax.swing.JLabel syncML_ID_Name;
    // End of variables declaration//GEN-END:variables
    @Override
    public void updateForm() {
        citadelSyncSource = (CitadelSyncSource) getSyncSource();
        syncML_ID.setText(citadelSyncSource.getSourceURI());
        if (citadelSyncSource.getSyncSourceProperties() != null) {
            syncSourceProps =
                    citadelSyncSource.getSyncSourceProperties();
            ctdlServer.setText(syncSourceProps.getProperty(CtdlFnblConstants.SERVER_HOST));
            serverPort.setText(syncSourceProps.getProperty(CtdlFnblConstants.SERVER_PORT));
            mailRoomName.setText(syncSourceProps.getProperty(CtdlFnblConstants.ROOM_MAIL));
            storeLoc.setText(syncSourceProps.getProperty(CtdlFnblConstants.STORE_LOC));
        }
    }
}

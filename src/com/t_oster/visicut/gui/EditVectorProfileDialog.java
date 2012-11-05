/**
 * This file is part of VisiCut.
 * Copyright (C) 2012 Thomas Oster <thomas.oster@rwth-aachen.de>
 * RWTH Aachen University - 52062 Aachen, Germany
 *
 *     VisiCut is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *    VisiCut is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with VisiCut.  If not, see <http://www.gnu.org/licenses/>.
 **/
package com.t_oster.visicut.gui;

import com.t_oster.liblasercut.utils.VectorOptimizer;
import com.t_oster.visicut.model.VectorProfile;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Thomas Oster <thomas.oster@rwth-aachen.de>
 */
public class EditVectorProfileDialog extends javax.swing.JDialog
{

  private boolean okPressed = false;

  public boolean isOkPressed()
  {
    return okPressed;
  }

    private VectorProfile vectorProfile = new VectorProfile();
  public static final String PROP_VECTORPROFILE = "vectorProfile";

  /**
   * Get the value of vectorProfile
   *
   * @return the value of vectorProfile
   */
  public VectorProfile getVectorProfile()
  {
    return vectorProfile;
  }

  /**
   * Set the value of vectorProfile
   *
   * @param vectorProfile new value of vectorProfile
   */
  public void setVectorProfile(VectorProfile vectorProfile)
  {
    VectorProfile oldVectorProfile = this.vectorProfile;
    this.vectorProfile = vectorProfile;
    firePropertyChange(PROP_VECTORPROFILE, oldVectorProfile, vectorProfile);
  }

  /**
   * Creates new form EditVectorProfileDialog
   */
  public EditVectorProfileDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

    btThumbnail = new com.t_oster.visicut.gui.beans.SelectThumbnailButton();
    lbName = new javax.swing.JLabel();
    tfName = new javax.swing.JTextField();
    tfDescription = new javax.swing.JTextField();
    lbDesc = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jCheckBox1 = new javax.swing.JCheckBox();
    jComboBox1 = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    tfExactness = new javax.swing.JTextField();
    lbExactness = new javax.swing.JLabel();
    lbPPI = new javax.swing.JLabel();
    btSave = new javax.swing.JButton();
    btCancel = new javax.swing.JButton();
    tfLineWidth = new javax.swing.JTextField();
    lbLineWidth = new javax.swing.JLabel();
    lbMM = new javax.swing.JLabel();
    cbIsCut = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.thumbnailPath}"), btThumbnail, org.jdesktop.beansbinding.BeanProperty.create("thumbnailPath"), "thumbnailPath");
    bindingGroup.addBinding(binding);

    lbName.setText("Name");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.name}"), tfName, org.jdesktop.beansbinding.BeanProperty.create("text"), "name");
    bindingGroup.addBinding(binding);

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.description}"), tfDescription, org.jdesktop.beansbinding.BeanProperty.create("text"), "desc");
    bindingGroup.addBinding(binding);

    lbDesc.setText("Description");

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

    jLabel1.setText("use outline");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.useOutline}"), jCheckBox1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
    bindingGroup.addBinding(binding);

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(VectorOptimizer.OrderStrategy.values()));

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.orderStrategy}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"), "orderStrategy");
    bindingGroup.addBinding(binding);

    jLabel2.setText("Optimization");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.DPI}"), tfExactness, org.jdesktop.beansbinding.BeanProperty.create("text"), "ppi");
    bindingGroup.addBinding(binding);

    lbExactness.setText("Exactness");

    lbPPI.setText("PPI");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jLabel2)
          .addComponent(lbExactness))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jComboBox1, 0, 278, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jCheckBox1)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(tfExactness)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbPPI)))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCheckBox1)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tfExactness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbExactness)
          .addComponent(lbPPI))
        .addContainerGap(24, Short.MAX_VALUE))
    );

    btSave.setText("Save");
    btSave.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btSaveActionPerformed(evt);
      }
    });

    btCancel.setText("Cancel");
    btCancel.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btCancelActionPerformed(evt);
      }
    });

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.width}"), tfLineWidth, org.jdesktop.beansbinding.BeanProperty.create("text"), "width");
    bindingGroup.addBinding(binding);

    lbLineWidth.setText("Line width");

    lbMM.setText("mm");

    cbIsCut.setText("is cut");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${vectorProfile.isCut}"), cbIsCut, org.jdesktop.beansbinding.BeanProperty.create("selected"), "isCut");
    bindingGroup.addBinding(binding);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lbName)
              .addComponent(lbDesc)
              .addComponent(lbLineWidth))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tfDescription)
              .addComponent(tfName)
              .addGroup(layout.createSequentialGroup()
                .addComponent(tfLineWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbIsCut)
                .addGap(0, 61, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btCancel)
            .addGap(18, 18, 18)
            .addComponent(btSave)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lbName)
              .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lbDesc))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tfLineWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lbLineWidth)
              .addComponent(lbMM)
              .addComponent(cbIsCut))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btSave)
          .addComponent(btCancel))
        .addContainerGap())
    );

    bindingGroup.bind();

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCancelActionPerformed
  {//GEN-HEADEREND:event_btCancelActionPerformed
    okPressed = false;
    this.setVisible(false);
  }//GEN-LAST:event_btCancelActionPerformed

  private void btSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btSaveActionPerformed
  {//GEN-HEADEREND:event_btSaveActionPerformed
    okPressed = true;
    this.setVisible(false);
  }//GEN-LAST:event_btSaveActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btCancel;
  private javax.swing.JButton btSave;
  private com.t_oster.visicut.gui.beans.SelectThumbnailButton btThumbnail;
  private javax.swing.JCheckBox cbIsCut;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbDesc;
  private javax.swing.JLabel lbExactness;
  private javax.swing.JLabel lbLineWidth;
  private javax.swing.JLabel lbMM;
  private javax.swing.JLabel lbName;
  private javax.swing.JLabel lbPPI;
  private javax.swing.JTextField tfDescription;
  private javax.swing.JTextField tfExactness;
  private javax.swing.JTextField tfLineWidth;
  private javax.swing.JTextField tfName;
  private org.jdesktop.beansbinding.BindingGroup bindingGroup;
  // End of variables declaration//GEN-END:variables

  public void setOnlyEditParameters(boolean b)
  {
    this.tfLineWidth.setVisible(!b);
    this.lbMM.setVisible(!b);
    this.lbLineWidth.setVisible(!b);
    this.btThumbnail.setVisible(!b);
    this.cbIsCut.setVisible(!b);
    this.lbName.setVisible(!b);
    this.tfName.setVisible(!b);
    this.tfDescription.setVisible(!b);
    this.lbDesc.setVisible(!b);
    this.pack();
  }
}

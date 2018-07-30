/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class mouseClick {
    private
            int row=0;
            int col=0;
    
    public mouseClick(javax.swing.JTable jTable) {
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //鼠标右键
                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                    //通过点击位置找到点击为表格中的行
                    int focusedRowIndex = jTable.rowAtPoint(evt.getPoint());
                    if (focusedRowIndex == -1) {
                        return;
                    }
                    //将表格所选项设为当前右键点击的行
                    jTable.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);
                    //弹出菜单
                    JPopupMenu m_popupMenu = new JPopupMenu();

                    JMenuItem delMenItem = new JMenuItem();
                    delMenItem.setText("  删除  ");
                    delMenItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            //该操作需要做的事
                            DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                            tableModel.removeRow(jTable.getSelectedRow());
                        }
                    });
                    JMenuItem addMenItem = new JMenuItem();
                    addMenItem.setText("  添加  ");
                    addMenItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            //该操作需要做的事
                            DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
                            tableModel.insertRow(jTable.getSelectedRow(), new Object[]{});
                        }
                    });
                    m_popupMenu.add(addMenItem);
                    m_popupMenu.add(delMenItem);
                    m_popupMenu.show(jTable, evt.getX(), evt.getY());
                }
                //鼠标按下时的表格
                if (evt.getButton() == java.awt.event.MouseEvent.MOUSE_PRESSED){
                    //返回行列号
                    row = jTable.getSelectedRow();
                    col = jTable.getSelectedColumn();
                }
                //鼠标释放时的表格
                if (evt.getButton() == java.awt.event.MouseEvent.MOUSE_RELEASED){
                    //返回行列号
                    row = jTable.getSelectedRow();
                    col = jTable.getSelectedColumn();
                }
            }
        });
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
}

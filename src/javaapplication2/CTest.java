/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.*;
import javax.swing.table.*;

public class CTest {
 public static void main(String args[]) {
  JFrame jf = new JFrame("Table with cell spanning");

  CMap m = new CMap1();
  DefaultTableModel tm = new DefaultTableModel( 16, 10 ){
   public boolean isCellEditable( int indexRow, int indexColumn )
   {
    return true;
   }
  };
  //tm.isCellEditable( 16, 10 );
//  tm.setValueAt( "port1", 0, 0);//对一个合并的单元格填一个数据。
//  jf.getContentPane().add(new JScrollPane(new CTable(m, tm)));
    CTable table = new CTable(m, tm);
    jf.getContentPane().add(new JScrollPane(table));
  new mouseClick(table);//添加鼠标处理
  jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
  jf.setSize(500, 500);
  jf.show();
 }
}

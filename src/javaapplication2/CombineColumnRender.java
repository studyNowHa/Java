/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
* 设置需要合并的列的单元格不能被选中，不能聚焦
* @author hualun-alan
*/
class CombineColumnRender extends DefaultTableCellRenderer {
@Override
public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    CombineTable cTable = (CombineTable) table;
    if (cTable.combineData.combineColumns.contains(column)) {
        hasFocus = false;
    }
    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
}
}

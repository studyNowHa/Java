/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Administrator
 */


public interface CMap {
 /**
  * @param row
  *            logical cell row
  * @param column
  *            logical cell column
  * @return number of columns spanned a cell
  */
 int span(int row, int column);

 /**
  * @param row
  *            logical cell row
  * @param column
  *            logical cell column
  * @return the index of a visible cell covering a logical cell
  */
 int visibleCell(int row, int column);
}
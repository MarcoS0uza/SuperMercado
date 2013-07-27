
package interfaces;

import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{
    private String[] tituloColunas;
        private Object[][] dados;
        private int linhas, colunas;
       
        public ModeloTabela(String[] tituloColunas, int numLinhas, int numColunas){
                this.tituloColunas= tituloColunas;
                this.dados = new Object[numLinhas][numColunas];
                linhas=numLinhas;
                colunas=numColunas;
        }

        public String getColumnName(int col){
                return tituloColunas[col];
        }

        @Override
        public int getColumnCount() {
                return colunas;
        }

        @Override
        public int getRowCount() {
                return linhas;
        }

        @Override
        public Object getValueAt(int linha, int coluna) {
                return dados[linha][coluna];
        }

        public void setValueAt(Object valor, int linha, int coluna) {
                dados[linha][coluna]=valor.toString();
                fireTableCellUpdated(linha, coluna);
        }
}

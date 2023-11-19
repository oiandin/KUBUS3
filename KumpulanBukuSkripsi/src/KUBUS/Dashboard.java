package KUBUS;

import Persistance.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author lmao
 */
public class Dashboard extends javax.swing.JFrame {

    private final Timer refreshTimer;
    
    public Dashboard() {

        initComponents();
        tampilanBuku();
        tampilanSkripsi();
        refreshTimer = new Timer(5000, (ActionEvent e) -> {
        });
        refreshTimer.start();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        javax.swing.JPanel BukuMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditDataBuku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jTextFieldCari1 = new javax.swing.JTextField();
        jButtonCariBuku = new javax.swing.JButton();
        FilterBuku = new javax.swing.JComboBox<>();
        jButtonCetakSearchBuku = new javax.swing.JButton();
        SkripsiMenu1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonEditDataSkripsi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        Filter1 = new javax.swing.JComboBox<>();
        jTextFieldCari2 = new javax.swing.JTextField();
        jButtonCariSkripsi = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KUBUS");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        BukuMenu.setBackground(new java.awt.Color(255, 255, 255));
        BukuMenu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                BukuMenuInputMethodTextChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Buku");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Berikut data buku Program Studi Sistem Informasi UINSA");

        jButtonEditDataBuku.setText("Edit Data Buku");
        jButtonEditDataBuku.setDoubleBuffered(true);
        jButtonEditDataBuku.setPreferredSize(new java.awt.Dimension(114, 23));
        jButtonEditDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataBukuActionPerformed(evt);
            }
        });

        jScrollPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jScrollPane1ComponentAdded(evt);
            }
        });
        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentShown(evt);
            }
        });

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "JUDUL", "SUB JUDUL", "PENGARANG", "PENERBIT", "TAHUN", "HALAMAN", "ISBN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuku.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableBukuComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);
        if (jTableBuku.getColumnModel().getColumnCount() > 0) {
            jTableBuku.getColumnModel().getColumn(0).setResizable(false);
            jTableBuku.getColumnModel().getColumn(1).setResizable(false);
            jTableBuku.getColumnModel().getColumn(2).setResizable(false);
            jTableBuku.getColumnModel().getColumn(3).setResizable(false);
            jTableBuku.getColumnModel().getColumn(4).setResizable(false);
            jTableBuku.getColumnModel().getColumn(5).setResizable(false);
            jTableBuku.getColumnModel().getColumn(6).setResizable(false);
            jTableBuku.getColumnModel().getColumn(7).setResizable(false);
        }

        jTextFieldCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCari1ActionPerformed(evt);
            }
        });
        jTextFieldCari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCari1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCari1KeyTyped(evt);
            }
        });

        jButtonCariBuku.setText("CARI");
        jButtonCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariBukuActionPerformed(evt);
            }
        });

        FilterBuku.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        FilterBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Berdasarkan", "Kode Buku", "Judul", "Subjudul", "Pengarang", "Penerbit", "Tahun Terbit", "Halaman", "ISBN" }));
        FilterBuku.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        FilterBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FilterBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBukuActionPerformed(evt);
            }
        });

        jButtonCetakSearchBuku.setText("CETAK");
        jButtonCetakSearchBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakSearchBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BukuMenuLayout = new javax.swing.GroupLayout(BukuMenu);
        BukuMenu.setLayout(BukuMenuLayout);
        BukuMenuLayout.setHorizontalGroup(
            BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BukuMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BukuMenuLayout.createSequentialGroup()
                        .addComponent(jButtonCetakSearchBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BukuMenuLayout.createSequentialGroup()
                        .addComponent(FilterBuku, 0, 134, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        BukuMenuLayout.setVerticalGroup(
            BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BukuMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCariBuku)
                    .addComponent(FilterBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCetakSearchBuku))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buku   ", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\wpf_books.png"), BukuMenu); // NOI18N
        BukuMenu.getAccessibleContext().setAccessibleParent(BukuMenu);

        SkripsiMenu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Skripsi");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Berikut data Skripsi Program Studi Sistem Informasi UINSA");

        jButtonEditDataSkripsi.setText("Edit Data Skripsi");
        jButtonEditDataSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataSkripsiActionPerformed(evt);
            }
        });

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE", "JUDUL", "PENGARANG", "TAHUN", "HALAMAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSkripsi.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableSkripsiComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSkripsi);
        if (jTableSkripsi.getColumnModel().getColumnCount() > 0) {
            jTableSkripsi.getColumnModel().getColumn(0).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(1).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(2).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(3).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(4).setResizable(false);
        }

        Filter1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Filter1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Berdasarkan", "Judul", "Pengarang", "Tahun", "Halaman" }));
        Filter1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Filter1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonCariSkripsi.setText("CARI");

        jButton5.setText("CETAK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SkripsiMenu1Layout = new javax.swing.GroupLayout(SkripsiMenu1);
        SkripsiMenu1.setLayout(SkripsiMenu1Layout);
        SkripsiMenu1Layout.setHorizontalGroup(
            SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkripsiMenu1Layout.createSequentialGroup()
                        .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addComponent(Filter1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCari2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonEditDataSkripsi))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))))
        );
        SkripsiMenu1Layout.setVerticalGroup(
            SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCari2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDataSkripsi)
                    .addComponent(jButton5))
                .addGap(31, 31, 31))
        );

        jTextFieldCari2.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Skripsi   ", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\wpf_books(1).png"), SkripsiMenu1); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataBukuActionPerformed
        // TODO add your handling code here:
        DataBuku DataBukuFrame = new DataBuku();
        DataBukuFrame.setVisible(true);
        DataBukuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonEditDataBukuActionPerformed

    private void jButtonEditDataSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataSkripsiActionPerformed
        // TODO add your handling code here:
        DataSkripsi DataSkripsiFrame = new DataSkripsi();
        DataSkripsiFrame.setVisible(true);
        DataSkripsiFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonEditDataSkripsiActionPerformed

    private void jButtonCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariBukuActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButtonCariBukuActionPerformed

    private void jScrollPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentShown

    }//GEN-LAST:event_jScrollPane1ComponentShown

    private void BukuMenuInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_BukuMenuInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_BukuMenuInputMethodTextChanged

    private void jScrollPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentAdded

    }//GEN-LAST:event_jScrollPane1ComponentAdded

    private void jTableBukuComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableBukuComponentAdded
        // TODO add your handling code here:
        // TODO add your handling code here:
        tampilanBuku();
    }//GEN-LAST:event_jTableBukuComponentAdded

    private void jTableSkripsiComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableSkripsiComponentAdded
        // TODO add your handling code here:
        tampilanSkripsi();
    }//GEN-LAST:event_jTableSkripsiComponentAdded

    private void jButtonCetakSearchBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakSearchBukuActionPerformed
        // TODO add your handling code here:
        try {
            String reportPath = "src/Report/reportBuku.jrxml";
            String searchTerm = jTextFieldCari1.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (FilterBuku.getSelectedIndex()) {
                case 0:
                    break;
                case 1:
                    queryString += "LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(b.judulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(b.subjudulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                case 6:
                    queryString += "LOWER(b.tahunterbit) LIKE LOWER (:searchTerm)";
                case 7:
                    queryString += "LOWER(b.halaman) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
            Root<Buku> bok = cq.from(Buku.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Buku> q = em.createQuery(cq);
            List<Buku> list = q.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Buku> results = query.getResultList();

            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Buku result : results) {
                    Object[] rowData = {
                    result.getKodebuku(),
                    result.getJudulbuku(),
                    result.getSubjudulbuku(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunterbit(),
                    result.getHalaman(),
                    result.getIsbn(),
            };
                data.add(rowData);
            }
            em.getTransaction().commit();
            em.close();
            emf.close();

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakSearchBukuActionPerformed

    private void jTextFieldCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCari1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCari1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FilterBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBukuActionPerformed

    private void jTextFieldCari1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCari1KeyReleased
        // TODO add your handling code here:
        try {
            String selection = (String) FilterBuku.getSelectedItem();
            String searchTerm = jTextFieldCari1.getText().trim();

            // Check if a search criteria is selected
            if (selection == null || selection.isEmpty()) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (FilterBuku.getSelectedIndex()) {
                case 0:
                    break;
                case 1:
                    queryString += "LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(b.judulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(b.subjudulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                case 6:
                    queryString += "LOWER(b.tahunterbit) LIKE LOWER (:searchTerm)";
                case 7:
                    queryString += "LOWER(b.halaman) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            // Create and execute the JPA query
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Buku> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE");
                dataModel.addColumn("JUDUL");
                dataModel.addColumn("SUBJUDUL");
                dataModel.addColumn("PENGARANG");
                dataModel.addColumn("PENERBIT");
                dataModel.addColumn("TAHUN");
                dataModel.addColumn("HALAMAN");
                dataModel.addColumn("ISBN");

                // Add rows to the model
                for (Buku result : results) {
                    Object[] rowData = {
                    result.getKodebuku(),
                    result.getJudulbuku(),
                    result.getSubjudulbuku(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunterbit(),
                    result.getHalaman(),
                    result.getIsbn(),
            };
                dataModel.addRow(rowData);
            }

            // Set jTableBuku with the created model
            jTableBuku.setModel(dataModel);

        } catch (IllegalArgumentException ex) {
            // Handle the case where no search criteria selected
            ex.printStackTrace();
        } catch (Exception ex) {
            // Handle other exceptions
            ex.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }}
    
    catch (Exception ex) {
    ex.printStackTrace();}
    }//GEN-LAST:event_jTextFieldCari1KeyReleased

    private void jTextFieldCari1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCari1KeyTyped
        
    }//GEN-LAST:event_jTextFieldCari1KeyTyped

    public static void main(String args[])
            throws Exception {

        String UI = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        UIManager.setLookAndFeel(UI);
        //new Dashboard().setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Filter1;
    private javax.swing.JComboBox<String> FilterBuku;
    private javax.swing.JPanel SkripsiMenu1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCariBuku;
    private javax.swing.JButton jButtonCariSkripsi;
    private javax.swing.JButton jButtonCetakSearchBuku;
    private javax.swing.JButton jButtonEditDataBuku;
    private javax.swing.JButton jButtonEditDataSkripsi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JTextField jTextFieldCari1;
    private javax.swing.JTextField jTextFieldCari2;
    // End of variables declaration//GEN-END:variables

    private void tampilanBuku() {
        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery(Buku.class
        );
        Root<Buku> stud = cq.from(Buku.class
        );
        cq.select(stud.get("kodebuku"));

        CriteriaQuery<Buku> select = cq.select(stud);
        TypedQuery<Buku> q = em.createQuery(select);
        List<Buku> list = q.getResultList();

        for (Buku data : list) {
            Object[] baris = new Object[8];
            baris[0] = data.getKodebuku();
            baris[1] = data.getJudulbuku();
            baris[2] = data.getSubjudulbuku();
            baris[3] = data.getPengarang();
            baris[4] = data.getPenerbit();
            baris[5] = data.getTahunterbit();
            baris[6] = data.getHalaman();
            baris[7] = data.getIsbn();

            model.addRow(baris);
        }

        jTableBuku.setModel(model);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private void tampilanSkripsi() {

        DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class
        );
        Root<Skripsi> stud = cq.from(Skripsi.class
        );
        cq.select(stud.get("kodeskripsi"));

        CriteriaQuery<Skripsi> select = cq.select(stud);
        TypedQuery<Skripsi> q = em.createQuery(select);
        List<Skripsi> list = q.getResultList();

        for (Skripsi data : list) {
            Object[] baris = new Object[5];
            baris[0] = data.getKodeskripsi();
            baris[1] = data.getJudulskripsi();
            baris[2] = data.getPenulis();
            baris[3] = data.getTahun();
            baris[4] = data.getHalaman();

            model.addRow(baris);
        }

        jTableSkripsi.setModel(model);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

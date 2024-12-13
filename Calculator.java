/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scientificcalculator;

/**
 *
 * @author Laptop & Gadget
 */
public class calculator extends javax.swing.JFrame {

    public calculator() {
        initComponents();
    }
    private double num1,num2,result;
    private String opr;
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtndel = new javax.swing.JButton();
        jbtnac = new javax.swing.JButton();
        jtextfeild_display = new javax.swing.JTextField();
        jbtnpi = new javax.swing.JButton();
        jbtnroot = new javax.swing.JButton();
        jbtnfact = new javax.swing.JButton();
        jbtnxin = new javax.swing.JButton();
        jbtnln = new javax.swing.JButton();
        jbtnxy = new javax.swing.JButton();
        jbtnx2 = new javax.swing.JButton();
        jbtnx3 = new javax.swing.JButton();
        jbtnsin = new javax.swing.JButton();
        jbtncos = new javax.swing.JButton();
        jbtntan = new javax.swing.JButton();
        jbtnfb1 = new javax.swing.JButton();
        jbtnfb2 = new javax.swing.JButton();
        jbtninsin = new javax.swing.JButton();
        jbtnincos = new javax.swing.JButton();
        jbtnintan = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnmul = new javax.swing.JButton();
        jbtndiv = new javax.swing.JButton();
        jbtnsum = new javax.swing.JButton();
        jbtnsub = new javax.swing.JButton();
        jbtnpm = new javax.swing.JButton();
        jbtneql = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("                            Scientific Calculator");

        jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setBorder(null);
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setBorder(null);
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtndel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtndel.setText("DEL");
        jbtndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndelActionPerformed(evt);
            }
        });

        jbtnac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnac.setText("AC");
        jbtnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnacActionPerformed(evt);
            }
        });

        jtextfeild_display.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtextfeild_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextfeild_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfeild_displayActionPerformed(evt);
            }
        });

        jbtnpi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnpi.setText("π");
        jbtnpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpiActionPerformed(evt);
            }
        });

        jbtnroot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnroot.setText("√");
        jbtnroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrootActionPerformed(evt);
            }
        });

        jbtnfact.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnfact.setText("n!");
        jbtnfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnfactActionPerformed(evt);
            }
        });

        jbtnxin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnxin.setText("1/x");
        jbtnxin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnxinActionPerformed(evt);
            }
        });

        jbtnln.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtnln.setText("ln");
        jbtnln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlnActionPerformed(evt);
            }
        });

        jbtnxy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnxy.setText("x^y");
        jbtnxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnxyActionPerformed(evt);
            }
        });

        jbtnx2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnx2.setText("x^2");
        jbtnx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnx2ActionPerformed(evt);
            }
        });

        jbtnx3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnx3.setText("x^3");
        jbtnx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnx3ActionPerformed(evt);
            }
        });

        jbtnsin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtnsin.setText("sin");
        jbtnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsinActionPerformed(evt);
            }
        });

        jbtncos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtncos.setText("cos");
        jbtncos.setToolTipText("");
        jbtncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncosActionPerformed(evt);
            }
        });

        jbtntan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtntan.setText("tan");
        jbtntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntanActionPerformed(evt);
            }
        });

        jbtnfb1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnfb1.setText("(");
        jbtnfb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnfb1ActionPerformed(evt);
            }
        });

        jbtnfb2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnfb2.setText(")");
        jbtnfb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnfb2ActionPerformed(evt);
            }
        });

        jbtninsin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtninsin.setText("sinh");
        jbtninsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtninsinActionPerformed(evt);
            }
        });

        jbtnincos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtnincos.setText("cosh");
        jbtnincos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnincosActionPerformed(evt);
            }
        });

        jbtnintan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbtnintan.setText("tanh");
        jbtnintan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnintanActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setBorder(null);
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setBorder(null);
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setBorder(null);
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setBorder(null);
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnmul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnmul.setText("*");
        jbtnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmulActionPerformed(evt);
            }
        });

        jbtndiv.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtndiv.setText("/");
        jbtndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivActionPerformed(evt);
            }
        });

        jbtnsum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnsum.setText("+");
        jbtnsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsumActionPerformed(evt);
            }
        });

        jbtnsub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnsub.setText("-");
        jbtnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsubActionPerformed(evt);
            }
        });

        jbtnpm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnpm.setText("±");
        jbtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpmActionPerformed(evt);
            }
        });

        jbtneql.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtneql.setText("=");
        jbtneql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneqlActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setBorder(null);
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtndot.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jbtndot.setText(".");
        jbtndot.setBorder(null);
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnfb1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(jbtnroot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jbtnxin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnfact, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                        .addComponent(jbtnincos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtninsin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtndel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtndiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtntan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnintan, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtncos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnfb2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnln, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnpi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnx3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnsum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtneql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jtextfeild_display, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextfeild_display, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtntan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnintan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtncos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnx3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnincos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnfact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnsin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnxin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtninsin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnfb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnfb2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnln, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnpi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnroot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtndel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtneql, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jbtnsum, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"7");
    }                                     

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"8");
    }                                     

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"9");
    }                                     

    private void jbtndelActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String backspace = null;
        if(jtextfeild_display.getText().length()>0){
            StringBuilder obj = new StringBuilder(jtextfeild_display.getText());
            obj.deleteCharAt(jtextfeild_display.getText().length()-1);
            backspace = obj.toString();
            jtextfeild_display.setText(backspace);
        }
    }                                       

    private void jtextfeild_displayActionPerformed(java.awt.event.ActionEvent evt) {                                                   

    }                                                  

    private void jbtnpiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double t =Math.PI*(Double.parseDouble(jtextfeild_display.getText()));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                      

    private void jbtnrootActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double t = Math.sqrt(Double.parseDouble(jtextfeild_display.getText()));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                        

    private void jbtnfactActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
        int num = Integer.parseInt(jtextfeild_display.getText());
        if (num < 0) {
            jtextfeild_display.setText("Error");
            return;
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        jtextfeild_display.setText(String.valueOf(result));
    } catch (NumberFormatException e) {
        jtextfeild_display.setText("Error");
    }
    }                                        

    private void jbtnxinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
        double num = Double.parseDouble(jtextfeild_display.getText());
        if (num == 0) {
            jtextfeild_display.setText("Error");
            return;
        }
        double result = 1 / num;
        jtextfeild_display.setText(String.valueOf(result));
    } catch (NumberFormatException e) {
        jtextfeild_display.setText("Error");
    }
    }                                       

    private void jbtnlnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        double num = Double.parseDouble(jtextfeild_display.getText());
        if (num <= 0) {
            jtextfeild_display.setText("Error");
            return;
        }
        double result = Math.log(num);
        jtextfeild_display.setText(String.valueOf(result));
    } catch (NumberFormatException e) {
        jtextfeild_display.setText("Error");
    }
    }                                      

    private void jbtnxyActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        num1 = Double.parseDouble(jtextfeild_display.getText());
        jtextfeild_display.setText("");
        opr = "^";
    } catch (NumberFormatException e) {
        jtextfeild_display.setText("Error");
    }
    }                                      

    private void jbtnx2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
       double t = Double.parseDouble(jtextfeild_display.getText());
       t = t*t;
       jtextfeild_display.setText("");
       jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                      

    private void jbtnx3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
       double t = Double.parseDouble(jtextfeild_display.getText());
       t = t*t*t;
       jtextfeild_display.setText("");
       jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                      

    private void jbtnsinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double t = Math.sin( Math.toRadians (Double.parseDouble(jtextfeild_display.getText())));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                       

    private void jbtncosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double t = Math.cos( Math.toRadians (Double.parseDouble(jtextfeild_display.getText())));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                       

    private void jbtntanActionPerformed(java.awt.event.ActionEvent evt) {                                        
         double t = Math.tan( Math.toRadians (Double.parseDouble(jtextfeild_display.getText())));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                       

    private void jbtnfb1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         jtextfeild_display.setText(jtextfeild_display.getText()+"(");
    }                                       

    private void jbtnfb2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         jtextfeild_display.setText(jtextfeild_display.getText()+")");
    }                                       

    private void jbtninsinActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double t = 1/(Math.sin( Math.toRadians (Double.parseDouble(jtextfeild_display.getText()))));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                         

    private void jbtnincosActionPerformed(java.awt.event.ActionEvent evt) {                                          
         double t = 1/(Math.cos( Math.toRadians (Double.parseDouble(jtextfeild_display.getText()))));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                         

    private void jbtnintanActionPerformed(java.awt.event.ActionEvent evt) {                                          
         double t = 1/(Math.tan( Math.toRadians (Double.parseDouble(jtextfeild_display.getText()))));
        jtextfeild_display.setText("");
        jtextfeild_display.setText(jtextfeild_display.getText()+t);
    }                                         

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"4");
    }                                     

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       jtextfeild_display.setText(jtextfeild_display.getText()+"5");
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"6");
    }                                     

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"1");
    }                                     

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"2");
    }                                     

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"3");
    }                                     

    private void jbtnmulActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num1 = Double.parseDouble(jtextfeild_display.getText());
        jtextfeild_display.setText("");
        opr = "*"; 
    }                                       

    private void jbtndivActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num1 = Double.parseDouble(jtextfeild_display.getText());
        jtextfeild_display.setText(""); 
        opr = "/"; 
    }                                       

    private void jbtnsumActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num1 = Double.parseDouble(jtextfeild_display.getText());
        jtextfeild_display.setText(""); 
        opr = "+"; 
    }                                       

    private void jbtnsubActionPerformed(java.awt.event.ActionEvent evt) {                                        
         num1 = Double.parseDouble(jtextfeild_display.getText());
        jtextfeild_display.setText("");
        opr = "-"; 
    }                                       

    private void jbtneqlActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num2=Double.parseDouble(jtextfeild_display.getText());
          if(opr == "+"){
              result = num1+num2;
              jtextfeild_display.setText(Double.toString(result));
    }else if(opr == "-"){
        result = num1-num2;
        jtextfeild_display.setText(Double.toString(result));
    }else if(opr == "*"){
        result = num1*num2;
        jtextfeild_display.setText(Double.toString(result));
    }else if(opr == "/"){
        result = num1/num2;
        jtextfeild_display.setText(Double.toString(result));
    }else if(opr == "%"){
        result = num1*100/num2;
        jtextfeild_display.setText(Double.toString(result));
    }else if(opr == "x^y"){ 
              for(int i=0; i<num2; i++){
              result = num2*num1; 
            }
              jtextfeild_display.setText(Double.toString(result));  
        }
    try {
        double num2 = Double.parseDouble(jtextfeild_display.getText());
        if ("^".equals(opr)) {
            double result = Math.pow(num1, num2);
            jtextfeild_display.setText(String.valueOf(result));
        }
    } catch (NumberFormatException e) {
        jtextfeild_display.setText("Error");
    }
     
    }                                       

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtextfeild_display.setText(jtextfeild_display.getText()+"0");
    }                                     

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jtextfeild_display.setText(jtextfeild_display.getText()+".");
    }                                       

    private void jbtnacActionPerformed(java.awt.event.ActionEvent evt) {                                       
       jtextfeild_display.setText("");
    }                                      

    private void jbtnpmActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        double num = Double.parseDouble(jtextfeild_display.getText());
        num = -num;
        jtextfeild_display.setText(String.valueOf(num));
    } catch (NumberFormatException e) {
        jtextfeild_display.setText("Error");
    }
    }                                      

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnac;
    private javax.swing.JButton jbtncos;
    private javax.swing.JButton jbtndel;
    private javax.swing.JButton jbtndiv;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtneql;
    private javax.swing.JButton jbtnfact;
    private javax.swing.JButton jbtnfb1;
    private javax.swing.JButton jbtnfb2;
    private javax.swing.JButton jbtnincos;
    private javax.swing.JButton jbtninsin;
    private javax.swing.JButton jbtnintan;
    private javax.swing.JButton jbtnln;
    private javax.swing.JButton jbtnmul;
    private javax.swing.JButton jbtnpi;
    private javax.swing.JButton jbtnpm;
    private javax.swing.JButton jbtnroot;
    private javax.swing.JButton jbtnsin;
    private javax.swing.JButton jbtnsub;
    private javax.swing.JButton jbtnsum;
    private javax.swing.JButton jbtntan;
    private javax.swing.JButton jbtnx2;
    private javax.swing.JButton jbtnx3;
    private javax.swing.JButton jbtnxin;
    private javax.swing.JButton jbtnxy;
    private javax.swing.JTextField jtextfeild_display;
    // End of variables declaration                   
}

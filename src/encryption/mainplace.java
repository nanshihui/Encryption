/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

/**
 *
 * @author x
 */
public class mainplace extends javax.swing.JFrame {

    /**
     * Creates new form mainplace
     */
    public mainplace() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mingwen = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        miwen = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(mingwen);

        jScrollPane2.setViewportView(miwen);

        jButton1.setText("加密");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("解密");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(72, 72, 72))
        );

        jLabel1.setText("请输入明文");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel2.setText("密文");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2))
        );

        jMenu1.setText("文件");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("关于");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String privatekey="110010";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String tempmessage=mingwen.getText();
            String localtemp="";
           
            
               //localtemp+=tempmessage.charAt(i);
          for(int i=0;i<tempmessage.length();i++){
             String tempchar="";
                switch(tempmessage.charAt(i)){
                    case 'A':tempchar="001000";break;
                    case 'B':tempchar="011111";break;
                    case 'C':tempchar="101100";break;
                    case 'D':tempchar="010000";break;
                    case 'E':tempchar="110110";break;
                    case 'F':tempchar="100101";break;
                    case 'G':tempchar="101101";break;
                    case 'H':tempchar="011001";break;
                    case 'I':tempchar="111010";break;
                    case 'J':tempchar="001001";break;
                    case 'K':tempchar="010001";break;
                    case 'L':tempchar="111110";break;
                    case 'M':tempchar="111011";break;
                    case 'N':tempchar="011000";break;
                    case 'O':tempchar="110101";break;
                    case 'P':tempchar="100110";break;
                    case 'Q':tempchar="111001";break;
                    case 'R':tempchar="010010";break;
                    case 'S':tempchar="001010";break;
                    case 'T':tempchar="100000";break;
                    case 'U':tempchar="111101";break;
                    case 'V':tempchar="111100";break;
                    case 'W':tempchar="011010";break;
                    case 'X':tempchar="101110";break;
                    case 'Y':tempchar="100111";break;
                    case 'Z':tempchar="010011";break;
                    case 'a':tempchar="000111";break;
                    case 'b':tempchar="101011";break;
                    case 'c':tempchar="110100";break;
                    case 'd':tempchar="111000";break;
                    case 'e':tempchar="011011";break;
                    case 'f':tempchar="100001";break;
                    case 'g':tempchar="001011";break;
                    case 'h':tempchar="110111";break;
                    case 'i':tempchar="011100";break;
                    case 'j':tempchar="101111";break;
                    case 'k':tempchar="001100";break;
                    case 'l':tempchar="010100";break;
                    case 'm':tempchar="000000";break;
                    case 'n':tempchar="100010";break;
                    case 'o':tempchar="101010";break;
                    case 'p':tempchar="000101";break;
                    case 'q':tempchar="110010";break;
                    case 'r':tempchar="110011";break;
                    case 's':tempchar="000001";break;
                    case 't':tempchar="101000";break;
                    case 'u':tempchar="010101";break;
                    case 'v':tempchar="110000";break;
                    case 'w':tempchar="001101";break;
                    case 'x':tempchar="011101";break;
                    case 'y':tempchar="110001";break;
                    case 'z':tempchar="010110";break;
                    case '0':tempchar="000010";break;
                    case '1':tempchar="101001";break;
                    case '8':tempchar="000110";break;
                    case '3':tempchar="100011";break;
                    case '2':tempchar="000011";break;
                    case '5':tempchar="011110";break;
                    case '6':tempchar="001110";break;
                    case '7':tempchar="010111";break;
                    case '*':tempchar="000100";break;
                    case '9':tempchar="100100";break;
                    case '&':tempchar="001111";break;
                    case '4':tempchar="111111";break;
                    default:tempchar=String.valueOf(tempmessage.charAt(i));break;
                    
                }
                localtemp+=tempchar;
            }
             System.out.println("249: "+localtemp);     
           // localtemp=mingwen.getText();
          StringBuffer changetext = new StringBuffer();
                int y=0;
                for(;y<localtemp.length()&&y+2<localtemp.length();){
                    if(localtemp.substring(y, y+3).equals("101")){
                        changetext.append("1010");
                         y=y+3;
                    }else if(localtemp.substring(y, y+3).equals("010")){
                        changetext.append("0101");
                         y=y+3;
                    }else{
                        changetext.append(localtemp.substring(y, y+1));
                         y=y+1;
                    }
                   
                }
                if(y<localtemp.length()){
                    changetext.append(localtemp.substring(y));
                }
           System.out.println("替换后的长度为");
        //  String changetext=mingwen.getText();
            int length=changetext.length()/6;
            int mol=changetext.length()%6;
                System.out.println("length: "+length);
                System.out.println("mol: "+mol);
                System.out.println("275: "+changetext);    
             StringBuilder newtext=new StringBuilder(changetext);
            for(int u=0;u<changetext.length()-mol;){
            for(int tempindex=0;tempindex<6;++tempindex){
            if(changetext.charAt(u+tempindex)==privatekey.charAt(tempindex)){
            
                    newtext.replace(u+tempindex, u+tempindex+1, "0");
            }else{
                 newtext.replace(u+tempindex, u+tempindex+1, "1");
            }
            }
            u+=6;
            }
            if(changetext.length()%6>0){
                int u=0;
                for(int now=changetext.length()-mol;now+u<changetext.length();u++) {
                        
                       if(changetext.charAt(u+now)==privatekey.charAt(u)){
            
                      
                          newtext.replace(u+now, u+now+1, "0");
                        }else{
                           newtext.replace(u+now, u+now+1, "1");
                        }
            
                    
                } 
            }
                System.out.println("303: "+newtext);    
            String miwenl="";
            int lastchange=0;
            System.out.println("最终长度为： "+newtext.length());
            for(;lastchange<newtext.length()-mol;){
                String tempchar="";
                switch(newtext.substring(lastchange, lastchange+6)){
                    case "001000":tempchar="0";break;
                    case "011111":tempchar="1";break;
                    case "101100":tempchar="8";break;
                    case "010000":tempchar="3";break;
                    case "110110":tempchar="&";break;
                    case "100101":tempchar="2";break;
                    case "101101":tempchar="6";break;
                    case "011001":tempchar="7";break;
                    case "111010":tempchar="*";break;
                    case "001001":tempchar="9";break;
                    case "010001":tempchar="5";break;
                    case "111110":tempchar="A";break;
                    case "111011":tempchar="B";break;
                    case "011000":tempchar="C";break;
                    case "110101":tempchar="D";break;
                    case "100110":tempchar="E";break;
                    case "111001":tempchar="F";break;
                    case "010010":tempchar="G";break;
                    case "001010":tempchar="H";break;
                    case "100000":tempchar="J";break;
                    case "111101":tempchar="I";break;
                    case "111100":tempchar="K";break;
                    case "011010":tempchar="L";break;
                    case "101110":tempchar="M";break;
                    case "100111":tempchar="N";break;
                    case "010011":tempchar="O";break;
                    case "000111":tempchar="P";break;
                    case "101011":tempchar="Q";break;
                    case "110100":tempchar="R";break;
                    case "111000":tempchar="S";break;
                    case "011011":tempchar="T";break;
                    case "100001":tempchar="U";break;
                    case "001011":tempchar="V";break;
                    case "110111":tempchar="W";break;
                    case "011100":tempchar="X";break;
                    case "101111":tempchar="Y";break;
                    case "001100":tempchar="Z";break;
                    case "010100":tempchar="a";break;
                    case "000000":tempchar="b";break;
                    case "100010":tempchar="c";break;
                    case "101010":tempchar="d";break;
                    case "000101":tempchar="e";break;
                    case "110010":tempchar="f";break;
                    case "110011":tempchar="g";break;
                    case "000001":tempchar="h";break;
                    case "101000":tempchar="i";break;
                    case "010101":tempchar="j";break;
                    case "110000":tempchar="k";break;
                    case "001101":tempchar="l";break;
                    case "011101":tempchar="n";break;
                    case "110001":tempchar="m";break;
                    case "010110":tempchar="o";break;
                    case "000010":tempchar="p";break;
                    case "101001":tempchar="q";break;
                    case "000110":tempchar="r";break;
                    case "100011":tempchar="s";break;
                    case "000011":tempchar="t";break;
                    case "011110":tempchar="u";break;
                    case "001110":tempchar="v";break;
                    case "010111":tempchar="w";break;
                    case "000100":tempchar="x";break;
                    case "100100":tempchar="y";break;
                    case "001111":tempchar="z";break;
                    case "111111":tempchar="4";break;
                    default:;break;
                }
            lastchange+=6;
           miwenl+=tempchar;
            }
            
            
            if(mol>0){
              String Stenps=newtext.substring(lastchange);
               for(int r=0;r<6-mol;++r){
                   Stenps+="0";
               } 
                    String tempchar="";
                switch(Stenps){
                    case "001000":tempchar="0";break;
                    case "011111":tempchar="1";break;
                    case "101100":tempchar="8";break;
                    case "010000":tempchar="3";break;
                    case "110110":tempchar="&";break;
                    case "100101":tempchar="2";break;
                    case "101101":tempchar="6";break;
                    case "011001":tempchar="7";break;
                    case "111010":tempchar="*";break;
                    case "001001":tempchar="9";break;
                    case "010001":tempchar="5";break;
                    case "111110":tempchar="A";break;
                    case "111011":tempchar="B";break;
                    case "011000":tempchar="C";break;
                    case "110101":tempchar="D";break;
                    case "100110":tempchar="E";break;
                    case "111001":tempchar="F";break;
                    case "010010":tempchar="G";break;
                    case "001010":tempchar="H";break;
                    case "100000":tempchar="J";break;
                    case "111101":tempchar="I";break;
                    case "111100":tempchar="K";break;
                    case "011010":tempchar="L";break;
                    case "101110":tempchar="M";break;
                    case "100111":tempchar="N";break;
                    case "010011":tempchar="O";break;
                    case "000111":tempchar="P";break;
                    case "101011":tempchar="Q";break;
                    case "110100":tempchar="R";break;
                    case "111000":tempchar="S";break;
                    case "011011":tempchar="T";break;
                    case "100001":tempchar="U";break;
                    case "001011":tempchar="V";break;
                    case "110111":tempchar="W";break;
                    case "011100":tempchar="X";break;
                    case "101111":tempchar="Y";break;
                    case "001100":tempchar="Z";break;
                    case "010100":tempchar="a";break;
                    case "000000":tempchar="b";break;
                    case "100010":tempchar="c";break;
                    case "101010":tempchar="d";break;
                    case "000101":tempchar="e";break;
                    case "110010":tempchar="f";break;
                    case "110011":tempchar="g";break;
                    case "000001":tempchar="h";break;
                    case "101000":tempchar="i";break;
                    case "010101":tempchar="j";break;
                    case "110000":tempchar="k";break;
                    case "001101":tempchar="l";break;
                    case "011101":tempchar="n";break;
                    case "110001":tempchar="m";break;
                    case "010110":tempchar="o";break;
                    case "000010":tempchar="p";break;
                    case "101001":tempchar="q";break;
                    case "000110":tempchar="r";break;
                    case "100011":tempchar="s";break;
                    case "000011":tempchar="t";break;
                    case "011110":tempchar="u";break;
                    case "001110":tempchar="v";break;
                    case "010111":tempchar="w";break;
                    case "000100":tempchar="x";break;
                    case "100100":tempchar="y";break;
                    case "001111":tempchar="z";break;
                    case "111111":tempchar="4";break;
                    default:;break;
                }
                  miwenl+=tempchar;
            }
           if(mol>0){
           miwenl+=String.valueOf(mol);}
           else{
                miwenl+="0";
           }
           System.out.println(miwenl.length());
            miwen.setText(miwenl);


     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String tempmessage=miwen.getText();
            String localtemp="";
           int moll=Integer.parseInt(String.valueOf(tempmessage.charAt(tempmessage.length()-1)));
            
               //localtemp+=tempmessage.charAt(i);
          for(int i=0;i<tempmessage.length()-1;i++){
             String tempchar="";
                switch(tempmessage.charAt(i)){
                   case '0':tempchar="001000";break;
                    case '1':tempchar="011111";break;
                    case '8':tempchar="101100";break;
                    case '3':tempchar="010000";break;
                    case '&':tempchar="110110";break;
                    case '2':tempchar="100101";break;
                    case '6':tempchar="101101";break;
                    case '7':tempchar="011001";break;
                    case '*':tempchar="111010";break;
                    case '9':tempchar="001001";break;
                    case '5':tempchar="010001";break;
                    case 'A':tempchar="111110";break;
                    case 'B':tempchar="111011";break;
                    case 'C':tempchar="011000";break;
                    case 'D':tempchar="110101";break;
                    case 'E':tempchar="100110";break;
                    case 'F':tempchar="111001";break;
                    case 'G':tempchar="010010";break;
                    case 'H':tempchar="001010";break;
                    case 'J':tempchar="100000";break;
                    case 'I':tempchar="111101";break;
                    case 'K':tempchar="111100";break;
                    case 'L':tempchar="011010";break;
                    case 'M':tempchar="101110";break;
                    case 'N':tempchar="100111";break;
                    case 'O':tempchar="010011";break;
                    case 'P':tempchar="000111";break;
                    case 'Q':tempchar="101011";break;
                    case 'R':tempchar="110100";break;
                    case 'S':tempchar="111000";break;
                    case 'T':tempchar="011011";break;
                    case 'U':tempchar="100001";break;
                    case 'V':tempchar="001011";break;
                    case 'W':tempchar="110111";break;
                    case 'X':tempchar="011100";break;
                    case 'Y':tempchar="101111";break;
                    case 'Z':tempchar="001100";break;
                    case 'a':tempchar="010100";break;
                    case 'b':tempchar="000000";break;
                    case 'c':tempchar="100010";break;
                    case 'd':tempchar="101010";break;
                    case 'e':tempchar="000101";break;
                    case 'f':tempchar="110010";break;
                    case 'g':tempchar="110011";break;
                    case 'h':tempchar="000001";break;
                    case 'i':tempchar="101000";break;
                    case 'j':tempchar="010101";break;
                    case 'k':tempchar="110000";break;
                    case 'l':tempchar="001101";break;
                    case 'n':tempchar="011101";break;
                    case 'm':tempchar="110001";break;
                    case 'o':tempchar="010110";break;
                    case 'p':tempchar="000010";break;
                    case 'q':tempchar="101001";break;
                    case 'r':tempchar="000110";break;
                    case 's':tempchar="100011";break;
                    case 't':tempchar="000011";break;
                    case 'u':tempchar="011110";break;
                    case 'v':tempchar="001110";break;
                    case 'w':tempchar="010111";break;
                    case 'x':tempchar="000100";break;
                    case 'y':tempchar="100100";break;
                    case 'z':tempchar="001111";break;
                    case '4':tempchar="111111";break;
                    default:;break;
                }
                localtemp+=tempchar;
            }
          System.out.println(" 544: "+localtemp.substring(0));
          if(moll==0)
              moll=6;
               String temp=localtemp.substring(0,localtemp.length()-(6-moll));
                  System.out.println(" 546: "+temp);
               
                 int length=temp.length()/6;
            int mol=temp.length()%6;
              System.out.println("length0: "+length);
          
                System.out.println("mol0: "+mol);
             StringBuilder newtext=new StringBuilder(temp);
            for(int u=0;u<temp.length()-mol;){
            for(int tempindex=0;tempindex<6;++tempindex){
            if(temp.charAt(u+tempindex)==privatekey.charAt(tempindex)){
            
                    newtext.replace(u+tempindex, u+tempindex+1, "0");
            }else{
                 newtext.replace(u+tempindex, u+tempindex+1, "1");
            }
            }
            u+=6;
            }
            if(temp.length()%6>0){
                int u=0;
                for(int now=temp.length()-mol;now+u<temp.length();u++) {
                        
                       if(temp.charAt(u+now)==privatekey.charAt(u)){
            
                      
                          newtext.replace(u+now, u+now+1, "0");
                        }else{
                           newtext.replace(u+now, u+now+1, "1");
                        }
            
                    
                } 
            }
                 System.out.println(" 583: "+newtext);
               
              System.out.println("length1: "+newtext.length());
            System.out.println("length1: "+newtext);
          
           // localtemp=mingwen.getText();
          StringBuffer changetext = new StringBuffer();
                int y=0;
                for(;y<newtext.length()&&y+3<newtext.length();){
                    if(newtext.substring(y, y+4).equals("1010")){
                        changetext.append("101");
                         y=y+4;
                    }else if(newtext.substring(y, y+4).equals("0101")){
                        changetext.append("010");
                         y=y+4;
                    }else{
                        changetext.append(newtext.substring(y, y+1));
                         y=y+1;
                    }
                   
                }
                if(y<newtext.length()){
                    changetext.append(newtext.substring(y));
                }
              System.out.println("604: "+changetext);
        //  String changetext=mingwen.getText();
         
            String miwenl="";
            int lastchange=0;
           System.out.println("最终变化： "+changetext);
            for(;lastchange<changetext.length();){
                String tempchar="";
                 String tempchang="";
                if(lastchange+6<changetext.length()){
                    tempchang=changetext.substring(lastchange, lastchange+6);
                }else{
                    tempchang=changetext.substring(lastchange);

                }
               
                switch(tempchang){
                    case "001000":tempchar="A";break;
                    case "011111":tempchar="B";break;
                    case "101100":tempchar="C";break;
                    case "010000":tempchar="D";break;
                    case "110110":tempchar="E";break;
                    case "100101":tempchar="F";break;
                    case "101101":tempchar="G";break;
                    case "011001":tempchar="H";break;
                    case "111010":tempchar="I";break;
                    case "001001":tempchar="J";break;
                    case "010001":tempchar="K";break;
                    case "111110":tempchar="L";break;
                    case "111011":tempchar="M";break;
                    case "011000":tempchar="N";break;
                    case "110101":tempchar="O";break;
                    case "100110":tempchar="P";break;
                    case "111001":tempchar="Q";break;
                    case "010010":tempchar="R";break;
                    case "001010":tempchar="S";break;
                    case "100000":tempchar="T";break;
                    case "111101":tempchar="U";break;
                    case "111100":tempchar="V";break;
                    case "011010":tempchar="W";break;
                    case "101110":tempchar="X";break;
                    case "100111":tempchar="Y";break;
                    case "010011":tempchar="Z";break;
                    case "000111":tempchar="a";break;
                    case "101011":tempchar="b";break;
                    case "110100":tempchar="c";break;
                    case "111000":tempchar="d";break;
                    case "011011":tempchar="e";break;
                    case "100001":tempchar="f";break;
                    case "001011":tempchar="g";break;
                    case "110111":tempchar="h";break;
                    case "011100":tempchar="i";break;
                    case "101111":tempchar="j";break;
                    case "001100":tempchar="k";break;
                    case "010100":tempchar="l";break;
                    case "000000":tempchar="m";break;
                    case "100010":tempchar="n";break;
                    case "101010":tempchar="o";break;
                    case "000101":tempchar="p";break;
                    case "110010":tempchar="q";break;
                    case "110011":tempchar="r";break;
                    case "000001":tempchar="s";break;
                    case "101000":tempchar="t";break;
                    case "010101":tempchar="u";break;
                    case "110000":tempchar="v";break;
                    case "001101":tempchar="w";break;
                    case "011101":tempchar="x";break;
                    case "110001":tempchar="y";break;
                    case "010110":tempchar="z";break;
                    case "000010":tempchar="0";break;
                    case "101001":tempchar="1";break;
                    case "000110":tempchar="8";break;
                    case "100011":tempchar="3";break;
                    case "000011":tempchar="2";break;
                    case "011110":tempchar="5";break;
                    case "001110":tempchar="6";break;
                    case "010111":tempchar="7";break;
                    case "000100":tempchar="*";break;
                    case "100100":tempchar="9";break;
                    case "001111":tempchar="&";break;
                    case "111111":tempchar="4";break;
                    default:;break;
                }
            lastchange+=6;
           miwenl+=tempchar;
            }
            
            
            mingwen.setText(miwenl);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(mainplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainplace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane mingwen;
    private javax.swing.JTextPane miwen;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassino;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.net.URL;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author DemersonFreire
 */
public class Jogo extends javax.swing.JFrame {
    CartaBaralho CartasCassino[] = CartaBaralho.geraBaralho();
    CartaBaralho CartasJogador[] = CartaBaralho.geraBaralho();
    int SomaC1 = 0, SomaC2 =0, SomaC3 =0, SomaC4 =0, SomaC5 =0;
    int SomaJ1 = 0, SomaJ2 = 0, SomaJ3 = 0, SomaJ4 = 0, SomaJ5 = 0;
    int SomaPontosC = 0;
    int SomaPontosJ = 0;
    String Resultado;
    int WinC = 0;
    int WinJ = 0;
    int Resposta;

    
    public Jogo() {
        initComponents();
        Mao1.setEnabled(false);
        Cassino2.setEnabled(false);
        Mao2.setEnabled(false);
        Cassino3.setEnabled(false);
        Mao3.setEnabled(false);
        Cassino4.setEnabled(false);
        Mao4.setEnabled(false);
        Cassino5.setEnabled(false);
        Mao5.setEnabled(false);
        
    }
    
    public void PuxarCartaCassino1(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasCassino[0].getNaipe().getNome() + CartasCassino[0].getCarta().getNome() + ".png"));
        CartaCassino1.setIcon(figura);
    }
    public void PuxarCartaJogador1(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasJogador[0].getNaipe().getNome() + CartasJogador[0].getCarta().getNome() + ".png"));
        CartaMao1.setIcon(figura);
    }
    public void PuxarCartaCassino2(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasCassino[1].getNaipe().getNome() + CartasCassino[1].getCarta().getNome() + ".png"));
        CartaCassino2.setIcon(figura);
    }
    public void PuxarCartaJogador2(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasJogador[1].getNaipe().getNome() + CartasJogador[1].getCarta().getNome() + ".png"));
        CartaMao2.setIcon(figura);
    }
    public void PuxarCartaCassino3(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasCassino[2].getNaipe().getNome() + CartasCassino[2].getCarta().getNome() + ".png"));
        CartaCassino3.setIcon(figura);
    }
    public void PuxarCartaJogador3(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasJogador[2].getNaipe().getNome() + CartasJogador[2].getCarta().getNome() + ".png"));
        CartaMao3.setIcon(figura);
    }
    public void PuxarCartaCassino4(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasCassino[3].getNaipe().getNome() + CartasCassino[3].getCarta().getNome() + ".png"));
        CartaCassino4.setIcon(figura);
    }
    public void PuxarCartaJogador4(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasJogador[3].getNaipe().getNome() + CartasJogador[3].getCarta().getNome() + ".png"));
        CartaMao4.setIcon(figura);
    }
    public void PuxarCartaCassino5(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasCassino[4].getNaipe().getNome() + CartasCassino[4].getCarta().getNome() + ".png"));
        CartaCassino5.setIcon(figura);
    }
    public void PuxarCartaJogador5(){
        ImageIcon figura = new ImageIcon(getClass().getResource("..\\CartaBaralho\\" + CartasJogador[4].getNaipe().getNome() + CartasJogador[4].getCarta().getNome() + ".png"));
        CartaMao5.setIcon(figura);
    }
    public void Soma1(){
        if(CartasCassino[0].getCarta().getPontos() > CartasJogador[0].getCarta().getPontos()) {
            SomaPontosC = SomaPontosC + CartasCassino[0].getCarta().getPontos() + CartasJogador[0].getCarta().getPontos();
            PontosCassino.setText(Integer.toString(SomaPontosC));
            SomaC1 = SomaPontosC + CartasCassino[0].getCarta().getPontos() + CartasJogador[0].getCarta().getPontos();
        }
        else if (CartasCassino[0].getCarta().getPontos() < CartasJogador[0].getCarta().getPontos()){
            SomaPontosJ = SomaPontosJ + CartasCassino[0].getCarta().getPontos() + CartasJogador[0].getCarta().getPontos();
            PontosJogador.setText(Integer.toString(SomaPontosJ));
            SomaJ1 = SomaPontosC + CartasCassino[0].getCarta().getPontos() + CartasJogador[0].getCarta().getPontos();
        }
        if(SomaC1 > SomaJ1){
            Cassino1.setBackground(Color.RED);
        }
        else if(SomaC1 < SomaJ1){
            Mao1.setBackground(Color.RED);
        }
        
    }
    public void Soma2(){
        if(CartasCassino[1].getCarta().getPontos() > CartasJogador[1].getCarta().getPontos()) {
            SomaPontosC = SomaPontosC + CartasCassino[1].getCarta().getPontos() + CartasJogador[1].getCarta().getPontos();
            PontosCassino.setText(Integer.toString(SomaPontosC));
            SomaC2 = SomaPontosC + CartasCassino[1].getCarta().getPontos() + CartasJogador[1].getCarta().getPontos();
        }
        else if (CartasCassino[1].getCarta().getPontos() < CartasJogador[1].getCarta().getPontos()){
            SomaPontosJ = SomaPontosJ + CartasCassino[1].getCarta().getPontos() + CartasJogador[1].getCarta().getPontos();
            PontosJogador.setText(Integer.toString(SomaPontosJ));
            SomaJ2 = SomaPontosC + CartasCassino[1].getCarta().getPontos() + CartasJogador[1].getCarta().getPontos();
        }
        if(SomaC2 > SomaJ2){
            Cassino2.setBackground(Color.RED);
        }
        else if(SomaC2 < SomaJ2){
            Mao2.setBackground(Color.RED);
        }
    }
    public void Soma3(){
        if(CartasCassino[2].getCarta().getPontos() > CartasJogador[2].getCarta().getPontos()) {
            SomaPontosC = SomaPontosC + CartasCassino[2].getCarta().getPontos() + CartasJogador[2].getCarta().getPontos();
            PontosCassino.setText(Integer.toString(SomaPontosC));
            SomaC3 = SomaPontosC + CartasCassino[2].getCarta().getPontos() + CartasJogador[2].getCarta().getPontos();
        }
        else if (CartasCassino[2].getCarta().getPontos() < CartasJogador[2].getCarta().getPontos()){
            SomaPontosJ = SomaPontosJ + CartasCassino[2].getCarta().getPontos() + CartasJogador[2].getCarta().getPontos();
            PontosJogador.setText(Integer.toString(SomaPontosJ));
            SomaJ3 = SomaPontosC + CartasCassino[2].getCarta().getPontos() + CartasJogador[2].getCarta().getPontos();
        }
        if(SomaC3 > SomaJ3){
            Cassino3.setBackground(Color.RED);
        }
        else if(SomaC3 < SomaJ3){
            Mao3.setBackground(Color.RED);
        }
    }
    public void Soma4(){
        if(CartasCassino[3].getCarta().getPontos() > CartasJogador[3].getCarta().getPontos()) {
            SomaPontosC = SomaPontosC + CartasCassino[3].getCarta().getPontos() + CartasJogador[3].getCarta().getPontos();
            PontosCassino.setText(Integer.toString(SomaPontosC));
            SomaC4 = SomaPontosC + CartasCassino[3].getCarta().getPontos() + CartasJogador[3].getCarta().getPontos();
        }
        else if (CartasCassino[3].getCarta().getPontos() < CartasJogador[3].getCarta().getPontos()){
            SomaPontosJ = SomaPontosJ + CartasCassino[3].getCarta().getPontos() + CartasJogador[3].getCarta().getPontos();
            PontosJogador.setText(Integer.toString(SomaPontosJ));
            SomaJ4 = SomaPontosC + CartasCassino[3].getCarta().getPontos() + CartasJogador[3].getCarta().getPontos();
        }
        if(SomaC4 > SomaJ4){
            Cassino4.setBackground(Color.RED);
        }
        else if(SomaC4 < SomaJ4){
            Mao4.setBackground(Color.RED);
        }
    }
    public void Soma5(){
        if(CartasCassino[4].getCarta().getPontos() > CartasJogador[4].getCarta().getPontos()) {
            SomaPontosC = SomaPontosC + CartasCassino[4].getCarta().getPontos() + CartasJogador[4].getCarta().getPontos();
            PontosCassino.setText(Integer.toString(SomaPontosC));
            SomaC5 = SomaPontosC + CartasCassino[4].getCarta().getPontos() + CartasJogador[4].getCarta().getPontos();
        }
        else if (CartasCassino[4].getCarta().getPontos() < CartasJogador[4].getCarta().getPontos()){
            SomaPontosJ = SomaPontosJ + CartasCassino[4].getCarta().getPontos() + CartasJogador[4].getCarta().getPontos();
            PontosJogador.setText(Integer.toString(SomaPontosJ));
            SomaJ5 = SomaPontosC + CartasCassino[4].getCarta().getPontos() + CartasJogador[4].getCarta().getPontos();
        }
        if(SomaC5 > SomaJ5){
            Cassino5.setBackground(Color.RED);
        }
        else if(SomaC5 < SomaJ5){
            Mao5.setBackground(Color.RED);
        }
    }
    
    public void Vencedor(){
        if (SomaPontosC > SomaPontosJ){
            Resultado = "O Cassino venceu!";
            WinC++;
            WinCassino.setText(Integer.toString(WinC));
        }
        else if (SomaPontosC < SomaPontosJ){
            Resultado = "O Jogador venceu!";
            WinJ++;
            WinJogador.setText(Integer.toString(WinJ));
        }
        else if (SomaPontosC == SomaPontosJ){
            Resultado = "Empate!";
        }
        JOptionPane.showMessageDialog(null, Resultado);
    }
   
    public void JogarNovamente(){
        SomaPontosC = 0;
        SomaPontosJ = 0;
        Cassino1.setEnabled(true);
        Mao1.setEnabled(true);
        Cassino2.setEnabled(true);
        Mao2.setEnabled(true);
        Cassino3.setEnabled(true);
        Mao3.setEnabled(true);
        Cassino4.setEnabled(true);
        Mao4.setEnabled(true);
        Cassino5.setEnabled(true);
        Mao5.setEnabled(true);
        initComponents();
    }
    public void Sair(){
        Resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja sair?");
       if(Resposta == 0){
           System.exit(0);
       }
        System.out.println(Resposta);
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
        Cassino1 = new javax.swing.JButton();
        Mao1 = new javax.swing.JButton();
        Cassino2 = new javax.swing.JButton();
        Mao2 = new javax.swing.JButton();
        Cassino3 = new javax.swing.JButton();
        Mao3 = new javax.swing.JButton();
        Cassino4 = new javax.swing.JButton();
        Mao4 = new javax.swing.JButton();
        Cassino5 = new javax.swing.JButton();
        Mao5 = new javax.swing.JButton();
        CartaCassino1 = new javax.swing.JLabel();
        CartaMao1 = new javax.swing.JLabel();
        CartaCassino2 = new javax.swing.JLabel();
        CartaMao2 = new javax.swing.JLabel();
        CartaCassino3 = new javax.swing.JLabel();
        CartaMao3 = new javax.swing.JLabel();
        CartaCassino4 = new javax.swing.JLabel();
        CartaMao4 = new javax.swing.JLabel();
        CartaCassino5 = new javax.swing.JLabel();
        CartaMao5 = new javax.swing.JLabel();
        Cassino = new javax.swing.JLabel();
        PontosCassino = new javax.swing.JLabel();
        Jogador = new javax.swing.JLabel();
        PontosJogador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JogarNovamente = new javax.swing.JButton();
        WinCassino = new javax.swing.JLabel();
        WinJogador = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cassino1.setBackground(new java.awt.Color(0, 0, 0));
        Cassino1.setForeground(new java.awt.Color(255, 255, 255));
        Cassino1.setText("Cassino 1");
        Cassino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cassino1ActionPerformed(evt);
            }
        });

        Mao1.setBackground(new java.awt.Color(0, 0, 0));
        Mao1.setForeground(new java.awt.Color(255, 255, 255));
        Mao1.setText("Mão 1");
        Mao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mao1ActionPerformed(evt);
            }
        });

        Cassino2.setBackground(new java.awt.Color(0, 0, 0));
        Cassino2.setForeground(new java.awt.Color(255, 255, 255));
        Cassino2.setText("Cassino 2");
        Cassino2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cassino2ActionPerformed(evt);
            }
        });

        Mao2.setBackground(new java.awt.Color(0, 0, 0));
        Mao2.setForeground(new java.awt.Color(255, 255, 255));
        Mao2.setText("Mão 2");
        Mao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mao2ActionPerformed(evt);
            }
        });

        Cassino3.setBackground(new java.awt.Color(0, 0, 0));
        Cassino3.setForeground(new java.awt.Color(255, 255, 255));
        Cassino3.setText("Cassino 3");
        Cassino3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cassino3ActionPerformed(evt);
            }
        });

        Mao3.setBackground(new java.awt.Color(0, 0, 0));
        Mao3.setForeground(new java.awt.Color(255, 255, 255));
        Mao3.setText("Mão 3");
        Mao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mao3ActionPerformed(evt);
            }
        });

        Cassino4.setBackground(new java.awt.Color(0, 0, 0));
        Cassino4.setForeground(new java.awt.Color(255, 255, 255));
        Cassino4.setText("Cassino 4");
        Cassino4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cassino4ActionPerformed(evt);
            }
        });

        Mao4.setBackground(new java.awt.Color(0, 0, 0));
        Mao4.setForeground(new java.awt.Color(255, 255, 255));
        Mao4.setText("Mão 4");
        Mao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mao4ActionPerformed(evt);
            }
        });

        Cassino5.setBackground(new java.awt.Color(0, 0, 0));
        Cassino5.setForeground(new java.awt.Color(255, 255, 255));
        Cassino5.setText("Cassino 5");
        Cassino5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cassino5ActionPerformed(evt);
            }
        });

        Mao5.setBackground(new java.awt.Color(0, 0, 0));
        Mao5.setForeground(new java.awt.Color(255, 255, 255));
        Mao5.setText("Mão 5");
        Mao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mao5ActionPerformed(evt);
            }
        });

        CartaCassino1.setText("CartaCassino1");

        CartaMao1.setText("CartaMão1");

        CartaCassino2.setText("CartaCassino2");

        CartaMao2.setText("CartaMão2");

        CartaCassino3.setText("CartaCassino3");

        CartaMao3.setText("CartaMão3");

        CartaCassino4.setText("CartaCassino4");

        CartaMao4.setText("CartaMão4");

        CartaCassino5.setText("CartaCassino5");

        CartaMao5.setText("CartaMão5");

        Cassino.setText("Pontos Cassino:");

        PontosCassino.setText("0");

        Jogador.setText("Pontos Jogador:");

        PontosJogador.setText("0");

        jLabel5.setText("Vitórias:");

        jLabel6.setText("Vitórias:");

        JogarNovamente.setText("Jogar Novamente");
        JogarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JogarNovamenteActionPerformed(evt);
            }
        });

        WinCassino.setText("0");

        WinJogador.setText("0");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Mao1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mao2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CartaCassino1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cassino1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cassino2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaCassino2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CartaMao1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CartaMao2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cassino3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CartaCassino3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CartaCassino4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cassino4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cassino5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CartaCassino5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mao3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaMao3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mao4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaMao4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mao5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaMao5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cassino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PontosCassino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jogador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PontosJogador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WinCassino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WinJogador))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JogarNovamente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cassino1)
                    .addComponent(Cassino2)
                    .addComponent(Cassino3)
                    .addComponent(Cassino4)
                    .addComponent(Cassino5)
                    .addComponent(Cassino)
                    .addComponent(PontosCassino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CartaCassino3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaCassino2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaCassino4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaCassino5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(WinCassino))
                    .addComponent(CartaCassino1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Mao4)
                        .addComponent(Mao5)
                        .addComponent(Jogador)
                        .addComponent(PontosJogador))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Mao1)
                        .addComponent(Mao2)
                        .addComponent(Mao3)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(WinJogador))
                        .addGap(18, 18, 18)
                        .addComponent(JogarNovamente)
                        .addGap(18, 18, 18)
                        .addComponent(Sair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CartaMao4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaMao5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaMao3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaMao2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CartaMao1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cassino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cassino1ActionPerformed
        PuxarCartaCassino1();
        Mao1.setEnabled(true);
        Cassino1.setEnabled(false);
    }//GEN-LAST:event_Cassino1ActionPerformed

    private void Mao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mao1ActionPerformed
        PuxarCartaJogador1();
        Cassino2.setEnabled(true);
        Mao1.setEnabled(false);
        Soma1();
    }//GEN-LAST:event_Mao1ActionPerformed

    private void Cassino2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cassino2ActionPerformed
        PuxarCartaCassino2();
        Mao2.setEnabled(true);
        Cassino2.setEnabled(false);
    }//GEN-LAST:event_Cassino2ActionPerformed

    private void Mao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mao2ActionPerformed
        PuxarCartaJogador2();
        Cassino3.setEnabled(true);
        Mao2.setEnabled(false);
        Soma2();
    }//GEN-LAST:event_Mao2ActionPerformed

    private void Cassino3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cassino3ActionPerformed
        PuxarCartaCassino3();
        Mao3.setEnabled(true);
        Cassino3.setEnabled(false);
    }//GEN-LAST:event_Cassino3ActionPerformed

    private void Mao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mao3ActionPerformed
        PuxarCartaJogador3();
        Cassino4.setEnabled(true);
        Mao3.setEnabled(false);
        Soma3();
    }//GEN-LAST:event_Mao3ActionPerformed

    private void Cassino4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cassino4ActionPerformed
        PuxarCartaCassino4();
        Mao4.setEnabled(true);
        Cassino4.setEnabled(false);
    }//GEN-LAST:event_Cassino4ActionPerformed

    private void Mao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mao4ActionPerformed
        PuxarCartaJogador4();
        Cassino5.setEnabled(true);
        Mao4.setEnabled(false);
        Soma4();
    }//GEN-LAST:event_Mao4ActionPerformed

    private void Cassino5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cassino5ActionPerformed
        PuxarCartaCassino5();
        Mao5.setEnabled(true);
        Cassino5.setEnabled(false);
    }//GEN-LAST:event_Cassino5ActionPerformed

    private void Mao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mao5ActionPerformed
        PuxarCartaJogador5();
        Soma5();
        Vencedor();
        Mao5.setEnabled(false);
    }//GEN-LAST:event_Mao5ActionPerformed

    private void JogarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JogarNovamenteActionPerformed
        JogarNovamente();
    }//GEN-LAST:event_JogarNovamenteActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Sair();
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CartaCassino1;
    private javax.swing.JLabel CartaCassino2;
    private javax.swing.JLabel CartaCassino3;
    private javax.swing.JLabel CartaCassino4;
    private javax.swing.JLabel CartaCassino5;
    private javax.swing.JLabel CartaMao1;
    private javax.swing.JLabel CartaMao2;
    private javax.swing.JLabel CartaMao3;
    private javax.swing.JLabel CartaMao4;
    private javax.swing.JLabel CartaMao5;
    private javax.swing.JLabel Cassino;
    private javax.swing.JButton Cassino1;
    private javax.swing.JButton Cassino2;
    private javax.swing.JButton Cassino3;
    private javax.swing.JButton Cassino4;
    private javax.swing.JButton Cassino5;
    private javax.swing.JLabel Jogador;
    private javax.swing.JButton JogarNovamente;
    private javax.swing.JButton Mao1;
    private javax.swing.JButton Mao2;
    private javax.swing.JButton Mao3;
    private javax.swing.JButton Mao4;
    private javax.swing.JButton Mao5;
    private javax.swing.JLabel PontosCassino;
    private javax.swing.JLabel PontosJogador;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel WinCassino;
    private javax.swing.JLabel WinJogador;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}

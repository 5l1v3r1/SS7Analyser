package com.inov.ss7analayser.beans;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import org.jnetpcap.Pcap;
import org.jnetpcap.PcapDumper;
import org.jnetpcap.PcapIf;
import org.jnetpcap.packet.JScanner;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.packet.PcapPacketHandler;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Satityr
 */
public class JFrame1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creates new form JFrame1
	 */
	public JFrame1() {
		initComponents();
		jButton_select.setVisible(false);
		jButton_capture.setVisible(false);
		jButton_analyse_int.setVisible(false);
		jTextField1.setVisible(false);
		jButton_analyse.setEnabled(false);

		cloro();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jButton_analyse_int = new JButton();
		jButton_capture = new JButton();
		jTextField1 = new JTextField();
		jButton_list = new JButton();
		jButton_laod = new JButton();
		jButton_select = new JButton();
		jButton_analyse = new JButton();
		jTabbedPane1 = new JTabbedPane();
		jScrollPane3 = new JScrollPane();
		jList1 = new JList<>();
		jScrollPane2 = new JScrollPane();
		jTextArea1 = new JTextArea();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("SS7 ANALYZER");
		setBackground(new Color(117, 125, 250));

		jButton_analyse_int.setForeground(new Color(40, 21, 233));
		jButton_analyse_int.setText("Analyse");
		jButton_analyse_int
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton_analyse_intActionPerformed(evt);
					}
				});

		jButton_capture.setForeground(new Color(40, 21, 233));
		jButton_capture.setText("Capture");
		jButton_capture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton_captureActionPerformed(evt);
			}
		});

		jTextField1.setForeground(new Color(40, 21, 233));
		jTextField1.setText("2");

		jButton_list.setForeground(new Color(40, 21, 233));
		jButton_list.setText("List");
		jButton_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton_listActionPerformed(evt);
			}
		});

		jButton_laod.setForeground(new Color(253, 0, 0));
		jButton_laod.setText("Load ");
		jButton_laod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton_laodActionPerformed(evt);
			}
		});

		jButton_select.setForeground(new Color(40, 21, 233));
		jButton_select.setText("Select");
		jButton_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton_selectActionPerformed(evt);
			}
		});

		jButton_analyse.setForeground(new Color(253, 0, 0));
		jButton_analyse.setText("Analyse");
		jButton_analyse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton_analyseActionPerformed(evt);
			}
		});

		jList1.setFont(new Font("Consolas", 0, 12)); // NOI18N
		jScrollPane3.setViewportView(jList1);

		jTabbedPane1.addTab("PACKET LIST", jScrollPane3);

		jTextArea1.setEditable(false);
		jTextArea1.setColumns(20);
		jTextArea1.setFont(new Font("Consolas", 0, 12)); // NOI18N
		jTextArea1.setRows(5);
		jScrollPane2.setViewportView(jTextArea1);

		GroupLayout layout = new GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.TRAILING)
												.addComponent(jScrollPane2)
												.addGroup(
														GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton_list,
																		GroupLayout.PREFERRED_SIZE,
																		83,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton_select,
																		GroupLayout.PREFERRED_SIZE,
																		82,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextField1,
																		GroupLayout.PREFERRED_SIZE,
																		32,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton_capture,
																		GroupLayout.PREFERRED_SIZE,
																		82,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton_analyse_int,
																		GroupLayout.PREFERRED_SIZE,
																		92,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		46,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton_laod,
																		GroupLayout.PREFERRED_SIZE,
																		86,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton_analyse,
																		GroupLayout.PREFERRED_SIZE,
																		71,
																		GroupLayout.PREFERRED_SIZE))
												.addComponent(
														jTabbedPane1,
														GroupLayout.Alignment.LEADING))
								.addContainerGap()));

		layout.linkSize(SwingConstants.HORIZONTAL,
				new java.awt.Component[] { jButton_analyse,
						jButton_analyse_int, jButton_capture, jButton_laod,
						jButton_list, jButton_select });

		layout.setVerticalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jTabbedPane1,
										GroupLayout.PREFERRED_SIZE,
										134,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane2,
										GroupLayout.DEFAULT_SIZE,
										346, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jButton_laod)
																.addComponent(
																		jButton_analyse))
												.addGroup(
														layout.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jButton_list,
																		GroupLayout.PREFERRED_SIZE,
																		23,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton_select)
																.addComponent(
																		jTextField1,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton_capture)
																.addComponent(
																		jButton_analyse_int)))
								.addContainerGap()));

		layout.linkSize(SwingConstants.VERTICAL,
				new java.awt.Component[] { jButton_analyse,
						jButton_analyse_int, jButton_capture, jButton_laod,
						jButton_list, jButton_select, jTextField1 });

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton_analyse_intActionPerformed(
			ActionEvent evt) {// GEN-FIRST:event_jButton_analyse_intActionPerformed

		// Initialize the list with items
		DefaultListModel model = new DefaultListModel();
		final StringBuilder errbuf = new StringBuilder(); // For any error msgs
		final String file = "tmp-capture-file.cap";

		jTextArea1.setText("Opening file for reading: " + file + "\n \n");

		Pcap pcap = Pcap.openOffline(file, errbuf);

		if (pcap == null) {
			jTextArea1.setText("Error while opening device for capture: "
					+ errbuf.toString());
			return;
		}
		// -//////////////////////////////////////////
		JScanner.getThreadLocal().setFrameNumber(1);
		// -//////////////////////////////////////////
		PcapPacketHandler<String> jpacketHandler = new PcapPacketHandler<String>() {

			public void nextPacket(PcapPacket packet, String user) {

				model.addElement(packet.getFrameNumber()
						- 1
						+ ": Received at:"
						+ new Date(packet.getCaptureHeader()
								.timestampInMillis()) + " capture lenght: "
						+ packet.getCaptureHeader().caplen() + " lenght: "
						+ packet.getCaptureHeader().wirelen() + " \n \n");

				jList1.setModel(model);

				jTextArea1.append("Packet number: "
						+ (packet.getFrameNumber() - 1) + "\n\n"
						+ packet.toHexdump(packet.size(), true, true, true)
						+ packet.toString() + "\n \n");

				// ****************************************************************

				// jTextArea1.append(packet.toHexdump(packet.size(), true, true,
				// true)+packet.getHeader(tcp)+ "\n \n");
			}

		};
		try {

			pcap.loop(Pcap.LOOP_INFINITE, jpacketHandler, "\b");

		} finally {

			pcap.close();

		}

	}// GEN-LAST:event_jButton_analyse_intActionPerformed

	private void jButton_captureActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton_captureActionPerformed
    
        JScanner.getThreadLocal().setFrameNumber(0); 
 
        List<PcapIf> alldevs = new ArrayList<>(); // Will be filled with NICs  
        StringBuilder errbuf = new StringBuilder(); // For any error msgs  
               DefaultListModel model = new DefaultListModel();

        /*************************************************************************** 
         * First get a list of devices on this system 
         **************************************************************************/  
        int r = Pcap.findAllDevs(alldevs, errbuf);  
        if (r == Pcap.NOT_OK || alldevs.isEmpty()) {  
            System.err.printf("Can't read list of devices, error is %s", errbuf  
                .toString());  
            return;  
        }  
  
        System.out.println("Network devices found:");  
  
       
      for (PcapIf device : alldevs) {  
            String description =  
                (device.getDescription() != null) ? device.getDescription()  
                    : "No description available";  
           // System.out.printf("#%d: %s [%s]\n", j++, device.getName(), description); 
        }  
  
        int k= Integer.parseInt(jTextField1.getText());  
        
        PcapIf device = alldevs.get(k); // We know we have atleast 1 device  
        jTextArea1.append((device.getDescription() != null) ? device.getDescription(): device.getName()+"\n"); 
  
        /*************************************************************************** 
         * Second we open up the selected device 
         **************************************************************************/  
        
        int snaplen = 64 * 1024;           // Capture all packets, no trucation  
        int flags = Pcap.MODE_PROMISCUOUS; // capture all packets  
        int timeout = 10 * 1000;           // 10 seconds in millis  
        Pcap pcap =  
            Pcap.openLive(device.getName(), snaplen, flags, timeout, errbuf);  
  
        if (pcap == null) {  
            System.err.printf("Error while opening device for capture: "  
                + errbuf.toString());  
            return;  
        }  
  
        /*************************************************************************** 
         * Third we create a packet handler which will receive packets from the 
         * libpcap loop. 
         **************************************************************************/
          
        PcapPacketHandler<String> jpacketHandler = (PcapPacket packet, String user) -> {
     
        model.addElement(packet.getFrameNumber()+" Received at: " + new Date(packet.getCaptureHeader().timestampInMillis())
        + " capture lenght: " + packet.getCaptureHeader().caplen() + 
        " lenght: " + packet.getCaptureHeader().wirelen());
                jList1.setModel(model);
               
        };  
         
        pcap.loop(5, jpacketHandler,"");
        
              /*************************************************************************** 
         * save on output file
         **************************************************************************/  
        
            String ofile = "tmp-capture-file.cap";
            PcapDumper dumper = pcap.dumpOpen(ofile); // output file

            pcap.loop(5, dumper); // Special native dumper call to loop

            File file = new File(ofile);
            jTextArea1.setText("file name: ["+ofile+"] has: "+file.length()+" bytes in it! saved into application's folder. \n" );
           // System.out.printf("%s file has %d bytes in it!\n", ofile, file.length());
             


            dumper.close(); // Won't be able to delete without explicit close
   
        
            pcap.close();
            jButton_analyse_int.setVisible(true);
            
    }//GEN-LAST:event_jButton_captureActionPerformed

	private void jButton_listActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton_listActionPerformed

		List<PcapIf> alldevs = new ArrayList<>(); // Will be filled with NICs
		StringBuilder errbuf = new StringBuilder(); // For any error msgs

		/***************************************************************************
		 * First get a list of devices on this system
		 **************************************************************************/
		int r = Pcap.findAllDevs(alldevs, errbuf);
		if (r == Pcap.NOT_OK || alldevs.isEmpty()) {
			System.err.printf("Can't read list of devices, error is %s",
					errbuf.toString());
			return;
		}

		jTextArea1.setText("Network devices found: \n");

		int i = 0;
		for (PcapIf device : alldevs) {
			String description = (device.getDescription() != null) ? device
					.getDescription() : "No description available";
			jTextArea1.append((i++) + ": " + device.getName() + " ["
					+ description + "]\n");
		}
		jButton_select.setVisible(true);
		jTextField1.setVisible(true);
	}// GEN-LAST:event_jButton_listActionPerformed

	private void jButton_selectActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton_selectActionPerformed

		List<PcapIf> alldevs = new ArrayList<>(); // Will be filled with NICs
		StringBuilder errbuf = new StringBuilder(); // For any error msgs

		/***************************************************************************
		 * First get a list of devices on this system
		 **************************************************************************/
		int r = Pcap.findAllDevs(alldevs, errbuf);
		if (r == Pcap.NOT_OK || alldevs.isEmpty()) {
			System.err.printf("Can't read list of devices, error is %s",
					errbuf.toString());
			return;
		}

		jTextArea1.setText("Network devices found: \n");

		int i = 0;
		for (PcapIf device : alldevs) {
			String description = (device.getDescription() != null) ? device
					.getDescription() : "No description available";
			jTextArea1.append((i++) + ": " + device.getName() + " ["
					+ description + "]\n");
		}
		int k = Integer.parseInt(jTextField1.getText());

		jTextArea1.append("\n Interface choosed is: ");
		PcapIf device = alldevs.get(k); // We know we have atleast 1 device
		jTextArea1.append((device.getDescription() != null) ? device
				.getDescription() : device.getName() + "\n");

		/***************************************************************************
		 * Second we open up the selected device
		 **************************************************************************/
		int snaplen = 64 * 1024; // Capture all packets, no trucation
		int flags = Pcap.MODE_PROMISCUOUS; // capture all packets
		int timeout = 10 * 1000; // 10 seconds in millis
		Pcap pcap = Pcap.openLive(device.getName(), snaplen, flags, timeout,
				errbuf);

		if (pcap == null) {
			jTextArea1.append("Error while opening device for capture: "
					+ errbuf.toString());
			return;
		}
		jButton_capture.setVisible(true);
	}// GEN-LAST:event_jButton_selectActionPerformed

	private void jButton_laodActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton_laodActionPerformed
		try {

			jButton_select.setVisible(false);
			jButton_capture.setVisible(false);
			jButton_analyse_int.setVisible(false);
			jTextField1.setVisible(false);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showOpenDialog(null);
			File f = fileChooser.getSelectedFile();
			String filename = f.getAbsolutePath();

			jTextArea1.setText(filename);
			jButton_analyse.setEnabled(true);
		} catch (Exception e) {
			jTextArea1.setText("You need to laod a file");
		}
	}// GEN-LAST:event_jButton_laodActionPerformed

	private void jButton_analyseActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton_analyseActionPerformed

		// Initialize the list with items
		DefaultListModel model = new DefaultListModel();
		final StringBuilder errbuf = new StringBuilder(); // For any error msgs

		final String file = jTextArea1.getText();
		jTextArea1.setText("Opening file for reading: " + file + "\n \n");
		Pcap pcap = Pcap.openOffline(file, errbuf);

		if (pcap == null) {
			jTextArea1.setText("Error while opening device for capture: "
					+ errbuf.toString());
			return;
		}

		JScanner.getThreadLocal().setFrameNumber(1);
		PcapPacketHandler<String> jpacketHandler = new PcapPacketHandler<String>() {

			public void nextPacket(PcapPacket packet, String user) {

				model.addElement(packet.getFrameNumber()
						- 1
						+ ": Received at:"
						+ new Date(packet.getCaptureHeader()
								.timestampInMillis()) + " capture lenght: "
						+ packet.getCaptureHeader().caplen() + " lenght: "
						+ packet.getCaptureHeader().wirelen() + " \n \n");

				jList1.setModel(model);

				jTextArea1.append("Packet number: "
						+ (packet.getFrameNumber() - 1) + "\n\n"
						+ packet.toHexdump(packet.size(), true, true, true)
						+ packet.toString() + "\n \n");

				String hexdump = packet.toHexdump(packet.size(), false, false,
						true);
				System.out.println(hexdump + "\n");

			}
		};

		try {

			pcap.loop(Pcap.LOOP_INFINITE, jpacketHandler, "\b");

		} finally {
			pcap.close();
			int i = 0;
			jButton_analyse.setEnabled(false);
		}
	}// GEN-LAST:event_jButton_analyseActionPerformed

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Metal".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrame1().setVisible(true);
			}
		});
	}

	void cloro() {
		Color c = new Color(0, 100, 100);
		this.getContentPane().setBackground(c);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton_analyse;
	private javax.swing.JButton jButton_analyse_int;
	private javax.swing.JButton jButton_capture;
	private javax.swing.JButton jButton_laod;
	private javax.swing.JButton jButton_list;
	private javax.swing.JButton jButton_select;
	private javax.swing.JList<String> jList1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables
}

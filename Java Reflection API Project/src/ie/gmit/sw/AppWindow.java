package ie.gmit.sw;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class AppWindow
{
	private JFrame frame;

	public AppWindow()
	{
		//Create a window for the application
		frame = new JFrame();
		frame.setTitle("B.Sc. in Software Development - GMIT");
		frame.setSize(550, 550);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());

        //The file panel will contain the file chooser
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEADING));
        top.setBorder(new javax.swing.border.TitledBorder("Get the info for any of these classes"));
        top.setPreferredSize(new java.awt.Dimension(500, 150));
        top.setMaximumSize(new java.awt.Dimension(500, 150));
        top.setMinimumSize(new java.awt.Dimension(500, 150));

        /*final JTextField txtFileName =  new JTextField(20);
		txtFileName.setPreferredSize(new java.awt.Dimension(100, 30));
		txtFileName.setMaximumSize(new java.awt.Dimension(100, 30));
		txtFileName.setMargin(new java.awt.Insets(2, 2, 2, 2));
		txtFileName.setMinimumSize(new java.awt.Dimension(100, 30));*/

		/*JButton btnChooseFile = new JButton("Browse...");
		btnChooseFile.setToolTipText("Select File to Encode");
        btnChooseFile.setPreferredSize(new java.awt.Dimension(90, 30));
        btnChooseFile.setMaximumSize(new java.awt.Dimension(90, 30));
        btnChooseFile.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnChooseFile.setMinimumSize(new java.awt.Dimension(90, 30));
		btnChooseFile.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
        		JFileChooser fc = new JFileChooser("./");
        		int returnVal = fc.showOpenDialog(frame);
            	if (returnVal == JFileChooser.APPROVE_OPTION) {
                	File file = fc.getSelectedFile().getAbsoluteFile();
                	String name = file.getAbsolutePath();
                	txtFileName.setText(name);
                	System.out.println("You selected the following file: " + name);
            	}
			}
        });*/

		JButton btnOther = new JButton("Algorithm Runner");
		btnOther.setToolTipText("Algorithm Runner");
		btnOther.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionAlgorithmRunner.ReflectionAlgoRunnerReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther2 = new JButton("Algo Strings");
		btnOther2.setToolTipText("Algo Strings");
		btnOther2.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther2.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther2.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther2.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther2.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionAlgoStrings.ReflectionAlgoStringsReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther3 = new JButton("Compare Stringable");
		btnOther3.setToolTipText("Compare Stringable");
		btnOther3.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther3.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther3.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther3.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther3.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionCompareStringable.ReflectionCompareStringableReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther4 = new JButton("CompareStringImpl");
		btnOther4.setToolTipText("CompareStringImpl");
		btnOther4.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther4.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther4.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther4.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther4.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionCompareStringImpl.ReflectionCompareStringImplReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther5 = new JButton("Job Assign");
		btnOther5.setToolTipText("Job Assign");
		btnOther5.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther5.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther5.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther5.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther5.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionJobAssign.ReflectionJobAssignReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther6 = new JButton("Resultator");
		btnOther6.setToolTipText("Resultator");
		btnOther6.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther6.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther6.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther6.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther6.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionResultator.ReflectionResultatorReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther7 = new JButton("ResultatorImpl");
		btnOther7.setToolTipText("ResultatorImpl");
		btnOther7.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther7.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther7.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther7.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther7.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionResultatorImpl.ReflectionResultatorImplReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther8 = new JButton("StringService");
		btnOther8.setToolTipText("StringService");
		btnOther8.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther8.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther8.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther8.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther8.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionStringService.ReflectionStringServiceReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

		JButton btnOther9 = new JButton("StringServiceImpl");
		btnOther9.setToolTipText("StringServiceImpl");
		btnOther9.setPreferredSize(new java.awt.Dimension(100, 30));
		btnOther9.setMaximumSize(new java.awt.Dimension(100, 30));
		btnOther9.setMargin(new java.awt.Insets(2, 2, 2, 2));
		btnOther9.setMinimumSize(new java.awt.Dimension(100, 30));
		btnOther9.addActionListener(new java.awt.event.ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
            {
       	     try {
				ReflectionStringServiceImpl.ReflectionStringServiceImplReference();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
        });

        //top.add(txtFileName);
        //top.add(btnChooseFile);
        top.add(btnOther);
        top.add(btnOther2);
        top.add(btnOther3);
        top.add(btnOther4);
        top.add(btnOther5);
        top.add(btnOther6);
        top.add(btnOther7);
        top.add(btnOther8);
        top.add(btnOther9);
        frame.getContentPane().add(top); //Add the panel to the window


        //A separate panel for the programme output
        JPanel mid = new JPanel(new FlowLayout(FlowLayout.LEADING));
        mid.setBorder(new BevelBorder(BevelBorder.RAISED));
        mid.setPreferredSize(new java.awt.Dimension(500, 300));
        mid.setMaximumSize(new java.awt.Dimension(500, 300));
        mid.setMinimumSize(new java.awt.Dimension(500, 300));

        CustomControl cc = new CustomControl(new java.awt.Dimension(500, 300));
        cc.setBackground(Color.WHITE);
        cc.setPreferredSize(new java.awt.Dimension(300, 300));
        cc.setMaximumSize(new java.awt.Dimension(300, 300));
        cc.setMinimumSize(new java.awt.Dimension(300, 300));
        mid.add(cc);
		frame.getContentPane().add(mid);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.setPreferredSize(new java.awt.Dimension(500, 50));
        bottom.setMaximumSize(new java.awt.Dimension(500, 50));
        bottom.setMinimumSize(new java.awt.Dimension(500, 50));

        JButton btnDialog = new JButton("Instability of JAR"); //Create Quit button
        btnDialog.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
            	AppSummary as =  new AppSummary(frame, true);
            	as.show();
			}
        });

        JButton btnQuit = new JButton("Quit"); //Create Quit button
        btnQuit.addActionListener(new java.awt.event.ActionListener()
        {
        public void actionPerformed(ActionEvent evt)
        {
        	System.exit(0);
        }
    });
        bottom.add(btnDialog);
        bottom.add(btnQuit);

        frame.getContentPane().add(bottom);
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		new AppWindow();
	}
}
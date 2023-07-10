package decorator.test;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

//抽象构件
interface ICopy{
	void copy(String src,String dest)throws Exception;
}
//具体构件实现文件的拷贝功能
class Copy implements ICopy{
	public void copy(String srcFile, String destFile)throws Exception{
		//TODO:自己实现拷贝文件的功能
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		byte []buffer = new byte[1024];
		int len;
		while((len=fis.read(buffer))!=-1){
			fos.write(buffer,0,len);
		}
		fos.close();
		fis.close();
	}
}

abstract class Decorator implements ICopy{
	//TODO:定义抽象装饰者
	ICopy copy;
   public Decorator(ICopy copy){
		this.copy=copy;
	}
}

class DirectCopy extends Decorator{

	public DirectCopy(ICopy copy) {
		super(copy);
	}

	//TODO:完善具体装饰者的代码
	//实现整个目录的拷贝功能
    public void copy(String oldFolder,String newFolder)throws Exception{
    	//TODO:请按照注释补全代码实现对目录的拷贝功能
		File src = new File(oldFolder);
		File dest = new File(newFolder);
		if(!dest.exists()){
			dest.mkdir();
		}
		File[] srcFiles = src.listFiles();
		for (File srcFile : srcFiles) {
			if(srcFile.isFile()){
				copy.copy(srcFile.getAbsolutePath(),newFolder+File.separator+srcFile.getName());
			}
			else{
				this.copy(srcFile.getAbsolutePath(),newFolder+File.separator+srcFile.getName());
			}
		}

	}
    }


public class MyFrame extends JFrame{
	private String directSrc;
	private String directDest;
	JTextField fromtxt = new JTextField(60);
	JTextField totxt = new JTextField(60);
	public void init(){
		setLayout(null);
		JButton frombtn = new JButton("选择源目录");
		JButton tobtn = new JButton("选择目的目录");
		JButton btn = new JButton("开始拷贝");
		fromtxt.setEnabled(false);
		totxt.setEnabled(false);
		frombtn.setBounds(20, 30, 100, 30);
		tobtn.setBounds(20, 70, 100, 30);
		btn.setBounds(200, 220, 100, 30);
		fromtxt.setBounds(140,30,300,30);
		totxt.setBounds(140,70,300,30);	
		add(frombtn);add(fromtxt);
		add(tobtn);add(totxt);
		add(btn);
		
		frombtn.addActionListener(new ActionListener(){//选择源目录
			public void actionPerformed(ActionEvent e){
				directSrc = getDirect();
				fromtxt.setText(directSrc);
			}
		});
		tobtn.addActionListener(new ActionListener(){//选择目标目录
			public void actionPerformed(ActionEvent e){
				directDest = getDirect();
				totxt.setText(directDest);
			}
		});
		btn.addActionListener(new ActionListener(){//目录拷贝按钮响应时间
			public void actionPerformed(ActionEvent e){
				//TODO:实现directSrc到directDest两个目录的文件拷贝
				try {
					new DirectCopy(new Copy()).copy(directSrc,directDest);
				} catch (Exception exception) {
					exception.printStackTrace();
				}


			}
		});
		setSize(460,300); setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	private String getDirect(){
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int ret = fc.showDialog(this, "请选择目录");
		if(ret == JFileChooser.APPROVE_OPTION)
			return fc.getSelectedFile().getAbsolutePath();
		return null;		
	}
	public static void main(String[] args) throws Exception {
		new MyFrame().init();
	}

}
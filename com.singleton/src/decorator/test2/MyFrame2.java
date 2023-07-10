package decorator.test2;
import javax.swing.*;

import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


//抽象构件
interface ICopy{
	void copy(String src,String dest)throws Exception;
}
//具体构件实现文件的拷贝功能
class Copy implements ICopy{
	public void copy(String srcFile, String destFile)throws Exception{
		//TODO:自己实现拷贝文件的功能
		//src java内存---dest
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[1024];
		//-1 文件末尾
		while (in.read(buf) != -1) {
			out.write(buf);
		}
		in.close();
		out.close();

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
    public void copy(String oldFolder,String newFolder)throws Exception{
        //文件夹拷贝：F:/A   a.txt  B(b.txt)
		File src=new File(oldFolder);
		File dest=new File(newFolder);
		if(!dest.exists()){
			dest.mkdir();
		}
		File[] list=src.listFiles();
		for(File item:list){
			if(item.isFile()){
				//在windows中文件分隔符是“\”linux中是"/"
				copy.copy(item.getAbsolutePath(),newFolder+File.separator+item.getName());
			}else {
				copy(item.getAbsolutePath(),newFolder+File.separator+item.getName());
			}
		}

    }	
}


public class MyFrame2 extends JFrame{
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
				ICopy copy=new Copy();
				ICopy copyDir = new DirectCopy(copy);
				try {
					copyDir.copy(directSrc,directDest);
					JOptionPane.showMessageDialog(null, "拷贝完毕");
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
        new MyFrame2().init();
	}

}
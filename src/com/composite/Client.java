package com.composite;

/**
 * 测试树形结构的病毒查杀
 *
 * @author Administrator
 * @date 2018/8/21
 */
public class Client {

	public static void main(String[] args) {
		Component f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15;
		f1 = new ImageLeaf("myImage.jpg");
		f2 = new ImageLeaf("picture.png");
		f3 = new ImageLeaf("psd.bmp");
		f4 = new ImageLeaf("ptoto.jpeg");

		f5 = new TextLeaf("文件.txt");
		f6 = new TextLeaf("编辑.doc");
		f7 = new TextLeaf("视图.docx");
		f8 = new TextLeaf("导航.properties");
		f9 = new TextLeaf("代码.xml");
		f10 = new TextLeaf("分析.html");

		f11 = new VideoLeaf("构建.mp4");
		f12 = new VideoLeaf("运行.flv");
		f13 = new VideoLeaf("工具.swf");
		f14 = new VideoLeaf("VCS.avi");
		f15 = new VideoLeaf("窗口.mkv");

		Composite f16 = new Composite("myFolder1");
		Composite f20 = new Composite("myFolder");

		f16.add(f3);
		f20.add(f16);
		f20.add(f1);
		f16.add(f9);
		f20.add(f5);
		f20.add(f15);
		f16.add(f13);

		f20.killVirus();

	}
}
